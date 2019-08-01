package com.controller;

import com.model.user.User;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主控制器
 */
@Controller
@RequestMapping("index")
public class IndexController {

    /**
     * 默认页面
     */
    @RequestMapping("index")
    public String Index(Model model) {
        model.addAttribute("title","首页");
        return "index/index";
    }
}