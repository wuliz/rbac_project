import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

/**
 * Created by Intellij IDEA.
 *
 * @author: wuliz
 * @date: 2022/8/3
 */
public class TestShiroBase {
    /**
     * 用于测试Shiro基础
     */
    @Test
    public void testShiroBase(){
        // 创建Shiro安全管理器，是Shiro的核心
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        // 加载ini配置文件，得到配置文件中配置的用户信息
        IniRealm iniRealm = new IniRealm("classpath:shiro-authc.ini");
        // 将realm对象注入到securityManager中
        securityManager.setRealm(iniRealm);
        // 将安全管理器注入到当前环境中
        SecurityUtils.setSecurityManager(securityManager);
        // 获取subject主体对象，无论是否登录都可以获取
        Subject subject = SecurityUtils.getSubject();
        // 打印一下认证状态
        System.out.println("认证状态"+subject.isAuthenticated());
        // 创建一个携带了账号和密码的令牌
        UsernamePasswordToken token = new UsernamePasswordToken("xiaolin", "6667");
        // 调用subject传入令牌进行登录
        subject.login(token);
        System.out.println("认证状态"+subject.isAuthenticated());
    }

}
