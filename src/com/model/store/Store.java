package com.model.store;

/**
 * 店铺类
 */
public class Store {

    /**
     * 参数表
     */
    public String UID;
    private String Name;
    private String Manager;

    /**
     * 带参构造
     */
    public Store(String uid, String name, String maneger){
        this.UID = uid;
        this.Name = name;
        this.Manager = maneger;
    }
}
