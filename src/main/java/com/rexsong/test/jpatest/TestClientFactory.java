package com.rexsong.test.jpatest;

import com.rexsong.test.jpatest.config.HkConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClientFactory {
    public static TestClient getInstance() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(HkConfig.class);
        context.refresh();
        return context.getBean(TestClient.class);
    }
}
