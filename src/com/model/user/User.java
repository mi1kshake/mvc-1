package com.model.user;

import com.model.index.Com;
import com.model.index.Db;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 * 用户类
 */
public class User {

    /**
     * 用户信息参数
     */
    private String Username;
    private String Password;
    private String UID;
    private String Nickname;
    private String College;
    private String Room;
    private String Sid;
    private String Image = "../static/img/login.png";
    private final String Table = "user";
    private final String Table1 = "user_info";

    /**
     * 无参构造函数
     */
    public User(){
        this.Nickname = "";
        this.College = "";
        this.Room = "";
        this.Sid = "";
    }

    /**
     * 带参构造函数
     */
    public User(String username, String password){
        this.Username = username;
        this.Password = password;
    }

    public String getNickname(){
        return this.Nickname;
    }

    public String getUsername(){
        return this.Username;
    }

    public String getCollege(){
        return this.College;
    }

    public String getRoom(){
        return this.Room;
    }

    public String getSid(){ return this.Sid; }

    public String getUid(){
        return this.UID;
    }

    /**
     * 登录验证
     */
    public boolean checkLogin(){
        try{
            Db db = new Db();
            ResultSet rs = db.fetchOne(this.Table, "username", this.Username);
            if(rs == null){
                return false;
            }
            else{
                rs.next();
                this.UID = rs.getString(4);
                ResultSet res = db.fetchOne(this.Table1, "uuid", this.UID);
                res.next();
                this.Nickname = res.getString("nickname");
                this.College = res.getString("college");
                this.Room = res.getString("room");
                this.Sid = res.getString("sid");
                Com com = new Com();
                String password = com.MD5(this.Password);
                return rs.getString("password").equals(password);
            }
        }
        catch (Exception e){
            return false;
        }
    }

    /**
     * 获取用户列表
     */
    public List getUserList() {
        List<String> l = new ArrayList<>();
        try{
            Db db = new Db();
            ResultSet rs = db.fetchAll(this.Table);
            while(rs.next()){
                l.add(rs.getString(2));
            }
        }catch(Exception e){
            System.out.println("[User.getUserList]:Unable to find users.");
        }
        return l;
    }

    /**
     * 用户注册
     */
    public boolean Register(){
        try{
            Db db = new Db();
            Com com = new Com();
            String uuid = com.UUID();
            String password = com.MD5(this.Password);
            String [] key = {"uuid", "username", "password"};
            String [] val = {uuid, this.Username, password};
            db.Insert(this.Table, key, val);
            String [] key1 = {"uuid", "username", "image"};
            String [] val1 = {uuid, this.Username, this.Image};
            db.Insert(this.Table1, key1, val1);
            return true;
        }
        catch (Exception e){
            System.out.println("[User.Register]:Unable to register this user.");
            return false;
        }
    }

    /**
     * 注册检测
     */
    public boolean checkRegister(){
        try{
            Db db = new Db();
            ResultSet rs = db.fetchOne(this.Table, "username", this.Username);
            rs.next();
            System.out.println("[User.checkRegister]:The user name " + rs.getString("username") + " already exists.");
            return false;
        }
        catch (Exception e){
            System.out.println("[User.checkRegister]:Unable to find " + this.Username);
            return true;
        }
    }

    /**
     * 修改信息
     */
    public boolean addStore(String uid, String sid){
        Db db = new Db();
        String [] key = {"sid"};
        String [] val = {sid};
        db.Update("user_info", key, val, "uuid", uid);
        return true;
    }

    /**
     * 获取店铺
     */
    public boolean getStore(String uid){
        try{
            Db db = new Db();
            ResultSet rs = db.fetchOne("user_info", "uuid", uid);
            rs.next();
            if(rs.getString("sid") == null){
                return true;
            }
            else{
                return false;
            }
        }
        catch (Exception e){
            System.out.println("[User.getStore]:Unable to get the store.");
            return false;
        }
    }
}
