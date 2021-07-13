package com.hamdan.belajarspring.models;

import lombok.Getter;

@Getter
public class SampleBean {

    private DataBean dataBean;

    public SampleBean(DataBean dataBean) {
        this.dataBean = dataBean;
    }
}
