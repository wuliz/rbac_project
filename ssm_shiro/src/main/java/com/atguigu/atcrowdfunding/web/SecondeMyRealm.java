package com.atguigu.atcrowdfunding.web;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;

/**
 * Created by Intellij IDEA.
 *
 * @author: wuliz
 * @date: 2022/8/4
 */
public class SecondeMyRealm extends AuthenticatingRealm {

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("second");
        //强转
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //username,password
        String username = token.getUsername();

        //密码：明文，密文
        char[] password = token.getPassword();

        //调用数据库
        //抛出异常
        if(username.equals("unknow")){
            throw new UnknownAccountException("用户不存在");
        }
        if(username.equals("monster")){
            throw  new LockedAccountException("用户被锁定");
        }
        //构建认证对象返回
        Object principal = username;
        Object credentials = "123456";
        String realmName = getName();
        //配置md5加盐加密
        ByteSource bytes = ByteSource.Util.bytes(username);
        //SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(principal,credentials,realmName);
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(principal,credentials,bytes,realmName);

        System.out.println(authenticationToken);
        return simpleAuthenticationInfo;
    }
}
