package com.zookeeper.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author FaceFeel
 * @Created 2018-05-23 10:52
 **/
@RestController
public class ZookeeperServerController {

    private static final Logger log = LoggerFactory.getLogger(ZookeeperServerController.class);
    private static final UUID INSTANCE_UUID = UUID.randomUUID();

    @GetMapping("/test")
    public String test(){
        log.info("test :" + INSTANCE_UUID.toString());
        return INSTANCE_UUID.toString();
    }

    @RequestMapping("/hello")
    public String hello(String name) {
        return "Hello Eureka " + name;
    }
}
