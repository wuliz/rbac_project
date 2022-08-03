package com.atguigu.atcrowdfunding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Intellij IDEA.
 *
 * @author: wuliz
 * @date: 2022/8/3
 */
@Controller
@RequestMapping("/test")
public class Test {
    @RequestMapping("/get")
    @ResponseBody
    public String get(){
        return "1";
    }
}
