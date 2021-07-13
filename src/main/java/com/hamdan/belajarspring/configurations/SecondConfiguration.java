package com.hamdan.belajarspring.configurations;

import com.hamdan.belajarspring.models.DataBean;
import com.hamdan.belajarspring.models.SampleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SecondConfiguration {

    @Bean
    public DataBean createDataBeanTriyadi() {
        return new DataBean("Triyadi");
    }

    @Bean
    public SampleBean createSampleDataBeanTriyadi(@Qualifier("createDataBeanTriyadi") DataBean dataBean) {
        return new SampleBean(dataBean);
    }
}
