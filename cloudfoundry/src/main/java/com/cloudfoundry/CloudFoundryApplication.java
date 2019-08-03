package com.cloudfoundry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Lenovo
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudFoundryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFoundryApplication.class, args);
    }
}
