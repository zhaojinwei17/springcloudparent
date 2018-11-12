package com.zjw.springcloud.springcloudpojo.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer ordersid;

    private Integer customerid;

    private Date ordersdate;

    private BigDecimal amount;

    private Integer manTimes;

    private BigDecimal discount;

    private BigDecimal effectiveamount;

    public Integer getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(Integer ordersid) {
        this.ordersid = ordersid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Date getOrdersdate() {
        return ordersdate;
    }

    public void setOrdersdate(Date ordersdate) {
        this.ordersdate = ordersdate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getManTimes() {
        return manTimes;
    }

    public void setManTimes(Integer manTimes) {
        this.manTimes = manTimes;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getEffectiveamount() {
        return effectiveamount;
    }

    public void setEffectiveamount(BigDecimal effectiveamount) {
        this.effectiveamount = effectiveamount;
    }
}