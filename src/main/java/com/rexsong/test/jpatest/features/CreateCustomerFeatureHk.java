package com.rexsong.test.jpatest.features;

import org.springframework.stereotype.Component;

@Component
public class CreateCustomerFeatureHk implements CreateCustomerFeature{
    @Override
    public void createCustomer() {
        System.out.println("CreateCustomerFeatureHk executed");
    }
}
