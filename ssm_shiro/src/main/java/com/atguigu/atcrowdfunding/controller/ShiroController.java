package com.atguigu.atcrowdfunding.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Intellij IDEA.
 *
 * @author: wuliz
 * @date: 2022/8/4
 */
@Controller
@RequestMapping("/shiro")
public class ShiroController {


    @RequestMapping("/login")
    public String doLogin(String username,String password){
        Subject subject = SecurityUtils.getSubject();
        if(!subject.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            try {
                System.out.println("1."+token.hashCode());
                subject.login(token);
            }catch (AuthenticationException e){
                System.out.println(e.getMessage());
            }

        }
        return "redirect:/success";
    }
}
