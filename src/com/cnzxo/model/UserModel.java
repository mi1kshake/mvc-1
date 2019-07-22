package com.cnzxo.model;

import java.sql.*;
import org.gjt.mm.mysql.Driver;

public class UserModel {

    private String username = null;
    private String password = null;
    final String driver = "org.gjt.mm.mysql.Driver";
    final String url = "jdbc:mysql://39.105.28.118:3306/mvc?autoReconnect=true&amp;failOverReadOnly=false";
    final String user = "mvc";
    final String pass = "mvc";

    public void setUser(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getSql() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            String sql = "SELECT * FROM user";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                username = rs.getString("username");
                password = rs.getString("password");
                System.out.println("username:" + username);
                System.out.println("password:" + password);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
