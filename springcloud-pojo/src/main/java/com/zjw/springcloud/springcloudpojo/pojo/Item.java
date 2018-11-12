package com.zjw.springcloud.springcloudpojo.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Item {
    private Integer itemid;

    private String itemname;

    private String itemdesc;

    private Integer kindid;

    private Date starttime;

    private Date endtime;

    private BigDecimal initprice;

    private BigDecimal maxprice;

    private BigDecimal reserveprice;

    private Integer ownerid;

    private Integer winnerid;

    private Integer stateid;

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc == null ? null : itemdesc.trim();
    }

    public Integer getKindid() {
        return kindid;
    }

    public void setKindid(Integer kindid) {
        this.kindid = kindid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public BigDecimal getInitprice() {
        return initprice;
    }

    public void setInitprice(BigDecimal initprice) {
        this.initprice = initprice;
    }

    public BigDecimal getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(BigDecimal maxprice) {
        this.maxprice = maxprice;
    }

    public BigDecimal getReserveprice() {
        return reserveprice;
    }

    public void setReserveprice(BigDecimal reserveprice) {
        this.reserveprice = reserveprice;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getWinnerid() {
        return winnerid;
    }

    public void setWinnerid(Integer winnerid) {
        this.winnerid = winnerid;
    }

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }
}