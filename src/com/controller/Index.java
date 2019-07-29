package com.controller;

import com.model.User;
import org.apache.catalina.Session;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 主控制器
 */
@Controller
@RequestMapping("index")
public class Index {

    /**
     * 默认页面
     */
    @RequestMapping("index")
    public String Index(Model model, HttpSession session) {
        model.addAttribute("title","首页");
        User user = new User();
        List<String> l = user.getUserList();
        if(l.isEmpty()){
            System.out.println("空");
        }
        else{
            System.out.println(l);
        }
        if(session.getAttribute("user")==null){
            System.out.println("未登录!");
        }
        else{
            System.out.println("已登录!");
        }
        return "index";
    }

    /**
     * 用户登录
     */
    @RequestMapping("login")
    public String Login(String username, String password, Model model, HttpSession session){
        model.addAttribute("title","用户登录");
        if(session.getAttribute("user") == null){
            try{
                User user = new User();
                user.setUserInfo(1, username, password);
                boolean state = user.checkLogin();
                if(state == true){
                    session.setAttribute("user",username);
                    System.out.println("登录成功!");
                    return "redirect:user";
                }
                else{
                    System.out.println("登录失败!");
                    return "login";
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
        else{
            return "redirect:user";
        }
        return "login";
    }

    /**
     * 用户注册
     */
    @RequestMapping("register")
    public String Register(String username,String password,String check,Model model){
        model.addAttribute("title","用户注册");
        return "register";
    }

    /**
     * 注销登录
     */
    @RequestMapping("logout")
    public String Logout(SessionStatus sessionStatus, HttpSession httpSession){
        sessionStatus.setComplete();
        httpSession.invalidate();
        System.out.println("注销成功!");
        return "redirect:index";
    }

    /**
     * 用户页面
     */
    @RequestMapping("user")
    public String User(HttpSession session){
        if(session.getAttribute("user")==null){
            return "redirect:login";
        }
        else{
            System.out.println("已登录!");
        }
        return "user";
    }
}