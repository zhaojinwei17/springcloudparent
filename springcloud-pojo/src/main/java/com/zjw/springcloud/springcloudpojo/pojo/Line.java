package com.zjw.springcloud.springcloudpojo.pojo;

import java.math.BigDecimal;

public class Line {
    private Integer lineid;

    private Integer linetypeid;

    private String linename;

    private Integer days;

    private BigDecimal price;

    private String vehicle;

    private String hotel;

    private String hasmeal;

    public Integer getLineid() {
        return lineid;
    }

    public void setLineid(Integer lineid) {
        this.lineid = lineid;
    }

    public Integer getLinetypeid() {
        return linetypeid;
    }

    public void setLinetypeid(Integer linetypeid) {
        this.linetypeid = linetypeid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle == null ? null : vehicle.trim();
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel == null ? null : hotel.trim();
    }

    public String getHasmeal() {
        return hasmeal;
    }

    public void setHasmeal(String hasmeal) {
        this.hasmeal = hasmeal == null ? null : hasmeal.trim();
    }
}