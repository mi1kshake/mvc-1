package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 店铺控制器
 */
@Controller
@RequestMapping("store")
public class StoreController {

    /**
     * 默认页面
     */
    @RequestMapping("index")
    public String Index(HttpSession session){
        if(session.getAttribute("uid") == null){
            return "redirect:../user/login";
        }
        else{
            return "store/index";
        }
    }
}
