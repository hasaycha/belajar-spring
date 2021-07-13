package com.hamdan.belajarspring.configurations;

import com.hamdan.belajarspring.models.DataBean;
import com.hamdan.belajarspring.models.SampleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

@Configuration
@Import(SecondConfiguration.class)
public class AppConfiguration {

    @Bean
    public DataBean createDataBeanHamdan() {
        return new DataBean("Hamdan");
    }

    @Bean
    public DataBean createDataBeanRijali() {
        return new DataBean("Rijali");
    }

    @Bean
    @Primary
    public SampleBean createSampleDataBean(@Qualifier("createDataBeanRijali") DataBean dataBean) {
        return new SampleBean(dataBean);
    }
}
