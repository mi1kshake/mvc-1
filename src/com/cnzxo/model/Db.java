package com.cnzxo.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 * 数据库类
 */
public class Db {

    /**
     * 数据成员
     */
    private final String driver = "org.gjt.mm.mysql.Driver";
    private final String url = "jdbc:mysql://39.105.28.118:3306/mvc?autoReconnect=true&amp;failOverReadOnly=false";
    private final String user = "mvc";
    private final String pass = "mvc";

    /**
     * 返回全部数据
     */
    public Vector<String> fetchAll(String table) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Vector<String> v = new Vector();
        int i = 0;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            String sql = "SELECT * FROM " + table;
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String res = id+" "+username+" "+password;
                v.add(res);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return v;
    }
}
