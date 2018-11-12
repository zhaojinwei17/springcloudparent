package com.zjw.springcloud.springcloudpojo.pojo;

public class Kind {
    private Integer kindid;

    private String kindname;

    public Integer getKindid() {
        return kindid;
    }

    public void setKindid(Integer kindid) {
        this.kindid = kindid;
    }

    public String getKindname() {
        return kindname;
    }

    public void setKindname(String kindname) {
        this.kindname = kindname == null ? null : kindname.trim();
    }
}