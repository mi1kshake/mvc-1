package com.cnzxo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.cnzxo.model.UserModel;

/**
 * IndexController控制器类
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    /**
     * 默认页面
     */
    @RequestMapping("/index")
    public ModelAndView Index() {
        ModelAndView view = new ModelAndView("index");
        view.addObject("welcome", "hello");
        return view;
    }

    /**
     * 登录页面
     */
    @RequestMapping("/login")
    public String Login(String username, String password){
        UserModel user = new UserModel();
        System.out.println(user.getSql());
        return "login";
    }
}