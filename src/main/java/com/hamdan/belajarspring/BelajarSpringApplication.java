package com.hamdan.belajarspring;

import com.hamdan.belajarspring.models.SampleBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BelajarSpringApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BelajarSpringApplication.class, args);

//        DataBean dataBean = context.getBean(DataBean.class);
//        System.out.println(dataBean.getName());

        SampleBean sampleBean = context.getBean(SampleBean.class);
        System.out.println(sampleBean.getDataBean().getName());
    }

}
