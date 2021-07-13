package com.hamdan.belajarspring.models;

import lombok.Getter;

@Getter
public class DataBean {

    private String name;

    public DataBean(String name) {
        this.name = name;
    }
}
