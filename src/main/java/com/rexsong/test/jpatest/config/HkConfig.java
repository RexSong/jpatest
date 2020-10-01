package com.rexsong.test.jpatest.config;

import com.rexsong.test.jpatest.features.CreateCustomerFeature;
import com.rexsong.test.jpatest.features.CreateCustomerFeatureHk;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.rexsong.test.jpatest")
public class HkConfig {
    private final BeanFactory beanFactory;

    @Autowired
    public HkConfig(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    @Bean
    public CreateCustomerFeature createCustomerFeature() {
        return beanFactory.getBean(CreateCustomerFeatureHk.class);
    }
}
