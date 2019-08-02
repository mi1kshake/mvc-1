package com.controller;

import com.model.index.Com;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品控制器
 */
@Controller
@RequestMapping("shop")
public class ShopController {

    /**
     * 商品页面
     */
    @RequestMapping("index")
    public String Index(){
        return "shop/index";
    }

    /**
     * 商品详情
     */
    @RequestMapping("detail")
    public String Detail(Model model, HttpSession session, HttpServletRequest request){
        model.addAttribute("title", "商品详情");        //页面标题
        String gid = request.getParameter("gid");
        Com com = new Com();
        String order = com.UUID();
        session.setAttribute("gid", gid);
        session.setAttribute("order", order);
        if(session.getAttribute("uid") == null){        //登录检测
            return "redirect:../user/login";
        }
        else{
            return "shop/detail";
        }
    }
}
