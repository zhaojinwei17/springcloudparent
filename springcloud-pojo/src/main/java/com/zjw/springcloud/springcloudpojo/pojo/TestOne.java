package com.zjw.springcloud.springcloudpojo.pojo;

public class TestOne {
    private Long oneId;

    private String name;

    public Long getOneId() {
        return oneId;
    }

    public void setOneId(Long oneId) {
        this.oneId = oneId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}