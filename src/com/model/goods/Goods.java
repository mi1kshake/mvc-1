package com.model.goods;

/**
 * 商品类
 */
public class Goods {

    /**
     * 参数表
     */
    private String UID;
    private String Title;
    private Integer Price;

    /**
     * 带参构造
     */
    public Goods(String uid, String title, Integer price){
        this.UID = uid;
        this.Title = title;
        this.Price = price;
    }
}
