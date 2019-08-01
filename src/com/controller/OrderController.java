package com.controller;

import com.model.index.Com;
import com.model.order.Order;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 订单控制器
 */
@Controller
@RequestMapping("order")
public class OrderController {

    /**
     * 默认页面
     */
    @RequestMapping(value = "index", method= RequestMethod.POST)
    public String Index(Model model, HttpSession session, HttpServletRequest request){
        model.addAttribute("title", "生成订单");
        if(session.getAttribute("uid") == null){
            return "redirect:../user/login";
        }
        else{
            Object gid = session.getAttribute("gid");
            Object number = session.getAttribute("order");
            Order order = new Order();
            Com com = new Com();
            String time = com.Time();
            order.Add(gid, number, "buyer", "seller", time);
            return "order/index";
        }
    }
}
