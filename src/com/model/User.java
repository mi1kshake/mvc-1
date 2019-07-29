package com.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户类
 */
public class User {

    /**
     * 用户信息参数
     */
    private Integer Id = null;
    private String Username = null;
    private String Password = null;

    /**
     * 获取Id
     */
    public Integer getId(){
        return Id;
    }

    /**
     * 获取账号
     */
    public String getUsername(){
        return Username;
    }

    /**
     * 获取密码
     */
    public String getPassword(){
        return Password;
    }

    /**
     * 设置用户信息
     */
    public void setUserInfo(Integer id, String username, String password){
        Id = id;
        Username = username;
        Password = password;
    }

    /**
     * 登录验证
     * @return 登录状态
     */
    public boolean checkLogin(){
        Db db = new Db();
        ResultSet rs = db.fetchOne("user", "username", this.Username);
        try{
            rs.next();
            if(rs.getString("password").equals(this.Password)){
                System.out.println("true");
                return true;
            }
            else{
                System.out.println("false");
                return false;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    /**
     * 获取用户列表
     * @return 所有用户信息
     */
    public List getUserList() {
        Db db = new Db();
        List<String> l = new ArrayList<String>();
        ResultSet rs = db.fetchOne("user","username", "002");
        try{
            while(rs.next()){
                int id = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String res = id+" "+username+" "+password;
                l.add(res);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return l;
    }
}
