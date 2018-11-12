package com.zjw.springcloud.springcloudpojo.pojo;

public class TestMany2 {
    private Long m2Id;

    private String name;

    public Long getM2Id() {
        return m2Id;
    }

    public void setM2Id(Long m2Id) {
        this.m2Id = m2Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}