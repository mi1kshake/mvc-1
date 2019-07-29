package com.model;

import java.sql.*;

/**
 * 数据库类
 */
public class Db {

    /**
     * 数据库配置参数
     */
    private final String driver = "org.gjt.mm.mysql.Driver";
    private final String url = "jdbc:mysql://39.105.28.118:3306/mvc?autoReconnect=true&amp;failOverReadOnly=false";
    private final String username = "mvc";
    private final String password = "mvc";

    /**
     * 多数据方法
     * @param table 数据表名
     * @return 返回全部数据
     */
    public ResultSet fetchAll(String table) {
        ResultSet res = null;
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM " + table;
            PreparedStatement data = conn.prepareStatement(sql);
            res = data.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }

    /**
     * 单数据 方法
     * @param table 数据表名
     * @param key 字段名
     * @param value 检索值
     * @return 返回单个数据
     */
    public ResultSet fetchOne(String table, String key, String value){
        ResultSet res = null;
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM " + table + " WHERE " + key + " = " + value;
            PreparedStatement data = conn.prepareStatement(sql);
            res = data.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }
}
