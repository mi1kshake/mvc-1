package com.controller;

import com.model.index.Com;
import com.model.index.Db;
import com.model.store.Store;
import com.model.user.User;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

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
    public String Index(String sid, HttpSession session, Model model){
        model.addAttribute("title","卖家中心");
        if(session.getAttribute("uid") == null){
            return "redirect:../user/login";
        }
        else{
            if(session.getAttribute("sid") == null){
                return "redirect:../store/error";
            }
            else{
                return "store/index";
            }
        }
    }

    /**
     * 申请开店
     */
    @RequestMapping("apply")
    public String Apply(String title, String about, Model model, HttpSession session){
        model.addAttribute("title","申请开店");
        if(session.getAttribute("uid") == null){
            return "redirect:../user/login";
        }
        else{
            User user = new User();
            String uid = (String)session.getAttribute("uid");
            if(user.getStore(uid) == true){
                if(title == null || "".equals(title) || about == null || "".equals(about)){
                    return "store/apply";
                }
                else{
                    Store store = new Store();
                    Com com = new Com();
                    String sid = com.UUID();
                    if(store.Apply(uid, sid, title, about)){
                        user.addStore(uid, sid);
                        session.setAttribute("sid", sid);
                        return "redirect:../store/index";
                    }
                    else{
                        return "store/apply";
                    }
                }
            }
            else{
                return "store/apply";
            }
        }
    }

    /**
     * 店铺展示
     */
    @RequestMapping("show")
    public String Show(String sid, Model model, HttpSession session){
        model.addAttribute("title", "店铺展示");
        if(sid == null || "".equals(sid)){
            return "redirect:../store/error";
        }
        else{
            Store store = new Store();
            if(store.Info(sid)){
                ArrayList<String> info = new ArrayList<>();
                info.add(store.getUID());
                info.add(store.getSID());
                info.add(store.getTitle());
                info.add(store.getAbout());
                session.setAttribute("info", info);
                return "store/show";
            }
            else{
                return "redirect:../store/error";
            }
        }
    }

    /**
     * 访问错误
     */
    @RequestMapping("error")
    public String Error(Model model, HttpSession session){
        model.addAttribute("title","访问错误");
        return "store/error";
    }
}
