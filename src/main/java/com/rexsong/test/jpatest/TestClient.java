package com.rexsong.test.jpatest;

import com.rexsong.test.jpatest.features.CreateCustomerFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestClient {
    private CreateCustomerFeature createCustomerFeature;

    @Autowired
    public TestClient(CreateCustomerFeature createCustomerFeature) {
        this.createCustomerFeature = createCustomerFeature;
    }

    public void create() {
        createCustomerFeature.createCustomer();
    }
}
