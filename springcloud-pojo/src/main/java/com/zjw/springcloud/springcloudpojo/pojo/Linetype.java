package com.zjw.springcloud.springcloudpojo.pojo;

public class Linetype {
    private Integer linetypeid;

    private String typename;

    public Integer getLinetypeid() {
        return linetypeid;
    }

    public void setLinetypeid(Integer linetypeid) {
        this.linetypeid = linetypeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}