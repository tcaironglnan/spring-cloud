package com.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * @author Lenovo
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@ImportResource({"classpath:spring-dubbo.xml"})
@EntityScan(basePackages = "com.common.model")
public class ZookeeperServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperServerApplication.class, args);
        System.out.println("服务端启动成功！！！");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
