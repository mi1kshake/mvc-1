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
    private String Image = "../static/img/login.png";
    private final String Table = "user";
    private final String Table1 = "user_info";

    /**
     * 无参构造函数
     */
    public User(){

    }

    /**
     * 带参构造函数
     */
    public User(String username, String password){
        this.Username = username;
        this.Password = password;
        this.Nickname = "";
        this.College = "";
        this.Room = "";
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

    public String getUid(){
        return this.UID;
    }

    /**
     * 登录验证
     * @return 登录状态
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
     * @return 所有用户信息
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
     * @return 注册情况
     */
    public boolean Register(){
        try{
            Db db = new Db();
            Com com = new Com();
            String uuid = com.UUID();
            String password = com.MD5(this.Password);
            String [] key = {"uuid", "username", "password"};
            String [] val = {uuid, this.Username, password};
            db.Insert(this.Table, key, val); //插入uuid、账号、密码
            String [] key1 = {"uuid", "username", "image"};
            String [] val1 = {uuid, this.Username, this.Image};
            db.Insert(this.Table1, key1, val1); //插入uuid、账号
            return true;
        }
        catch (Exception e){
            System.out.println("[User.Register]:Unable to register this user.");
            return false;
        }
    }

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
}
