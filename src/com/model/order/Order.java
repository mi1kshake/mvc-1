package com.model.order;

import com.model.index.Db;

/**
 * 订单系统
 */
public class Order {

    /**
     * 创建订单
     */
    public boolean Add(Object gid, Object number, String buyer, String seller, String time){
        Db db = new Db();
        String [] key = {"gid", "number", "buyer", "seller", "time"};
        String [] val = {(String)gid, (String)number, buyer, seller, time};
        db.Insert("order", key, val);
        return false;
    }
}
