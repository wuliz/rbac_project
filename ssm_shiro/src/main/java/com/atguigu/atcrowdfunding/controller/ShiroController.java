package com.atguigu.atcrowdfunding.controller;

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

        return "redirect:/success";
    }
}
