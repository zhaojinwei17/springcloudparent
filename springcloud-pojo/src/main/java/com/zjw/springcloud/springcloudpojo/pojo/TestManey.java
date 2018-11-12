package com.zjw.springcloud.springcloudpojo.pojo;

public class TestManey {
    private Long maneyId;

    private String name;

    private Long oneId;

    public Long getManeyId() {
        return maneyId;
    }

    public void setManeyId(Long maneyId) {
        this.maneyId = maneyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getOneId() {
        return oneId;
    }

    public void setOneId(Long oneId) {
        this.oneId = oneId;
    }
}