package com.rexsong.test.jpatest;

import org.junit.jupiter.api.Test;

public class TestClientIT {

    @Test
    public void shouldCreateSuccessful() {
        TestClient testClient = TestClientFactory.getInstance();
        testClient.create();
    }
}
