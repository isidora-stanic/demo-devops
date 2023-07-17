package com.example.demo3mongodb;

import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
public class SomeTest {

    @Container
    public static MongoDBContainer mongoDBContainer = new MongoDBContainer();

    @Test
    public void someIntegrationTest() {
        // This is an integration test that uses the MongoDB container.
        String connectionString = mongoDBContainer.getReplicaSetUrl();

        System.out.println("Inside integration test " + connectionString);

        // Perform your integration test using the connection string.
        assertTrue(true); // Replace with actual assertions
    }
}