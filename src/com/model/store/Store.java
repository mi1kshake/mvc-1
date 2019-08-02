package com.model.store;

import com.model.index.Com;
import com.model.index.Db;

import java.sql.ResultSet;

/**
 * 店铺类
 */
public class Store {

    /**
     * 参数表
     */
    private String UID;
    private String SID;
    private String Title;
    private String About;

    /**
     * 带参构造
     */
    public Store(){
        this.UID = "";
        this.SID = "";
        this.Title = "";
        this.About = "";
    }

    public String getUID(){
        return this.UID;
    }

    public String getSID(){
        return this.SID;
    }

    public String getTitle(){
        return this.Title;
    }

    public String getAbout(){
        return this.About;
    }

    /**
     * 申请开店
     */
    public boolean Apply(String uid, String sid, String title, String about){
        try{
            Db db = new Db();
            this.UID = uid;
            this.SID = sid;
            this.Title = title;
            this.About = about;
            String [] key = {"sid", "title", "about", "seller"};
            String [] val = {this.SID, this.Title, this.About, this.UID};
            db.Insert("store", key, val);
            return true;
        }
        catch (Exception e){
            System.out.println("[Store.Apply]:Unable to apply the store.");
            return false;
        }
    }

    /**
     * 店铺信息
     */
    public boolean Info(String sid){
        try{
            Db db = new Db();
            ResultSet rs = db.fetchOne("store", "sid", sid);
            rs.next();
            this.UID = rs.getString("seller");
            this.Title = rs.getString("title");
            this.About = rs.getString("about");
            this.SID = rs.getString("sid");
            return true;
        }
        catch (Exception e){
            System.out.println("[Store.Info]:Unable to find " + sid + " store.");
            return false;
        }
    }
}
