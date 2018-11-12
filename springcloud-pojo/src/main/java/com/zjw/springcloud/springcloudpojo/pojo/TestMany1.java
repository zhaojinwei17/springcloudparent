package com.zjw.springcloud.springcloudpojo.pojo;

public class TestMany1 {
    private Long m1Id;

    private String name;

    public Long getM1Id() {
        return m1Id;
    }

    public void setM1Id(Long m1Id) {
        this.m1Id = m1Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}