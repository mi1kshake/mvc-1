package com.model.shop;

/**
 * 商品类
 */
public class Shop {

    /**
     * 参数表
     */
    private String UID;
    private String Title;
    private Integer Price;

    /**
     * 带参构造
     */
    public Shop(String uid, String title, Integer price){
        this.UID = uid;
        this.Title = title;
        this.Price = price;
    }
}
