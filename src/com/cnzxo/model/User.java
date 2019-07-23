package com.cnzxo.model;

import java.sql.*;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.cnzxo.model.Db;

/**
 * 用户类
 */
public class User {

    /**
     * 数据成员
     */
    private Integer Id = null;
    private String Username = null;
    private String Password = null;
    final String driver = "org.gjt.mm.mysql.Driver";
    final String url = "jdbc:mysql://39.105.28.118:3306/mvc?autoReconnect=true&amp;failOverReadOnly=false";
    final String user = "mvc";
    final String pass = "mvc";

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
     * 获取用户列表
     */
    public ResultSet getUserList() {
        Db db = new Db();
        List l = db.fetchAll("user");
        Iterator iterator = l.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return null;
    }
}
