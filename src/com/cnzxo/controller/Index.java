package com.cnzxo.controller;

import com.cnzxo.model.User;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主控制器
 */
@Controller
@RequestMapping("/index")
public class Index {

    /**
     * 默认页面
     */
    @RequestMapping("/index")
    public String Index(Model model) {
        model.addAttribute("title","title");
        User user = new User();
        user.getUserList();
        model.addAttribute("body","body");
        return "index";
    }
}