package com.zjw.springcloud.springcloudpojo.pojo;

import java.math.BigDecimal;

public class VPrice {
    private Integer 竞拍物品编号;

    private BigDecimal 最高竞拍价;

    public Integer get竞拍物品编号() {
        return 竞拍物品编号;
    }

    public void set竞拍物品编号(Integer 竞拍物品编号) {
        this.竞拍物品编号 = 竞拍物品编号;
    }

    public BigDecimal get最高竞拍价() {
        return 最高竞拍价;
    }

    public void set最高竞拍价(BigDecimal 最高竞拍价) {
        this.最高竞拍价 = 最高竞拍价;
    }
}