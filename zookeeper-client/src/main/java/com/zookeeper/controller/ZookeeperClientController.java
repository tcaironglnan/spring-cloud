package com.zookeeper.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.common.model.City;
import com.common.service.CityService;
import com.zookeeper.service.FeignService;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author FaceFeel
 * @Created 2018-05-23 10:52
 **/
@RestController
public class ZookeeperClientController {
    private static final Logger log = LoggerFactory.getLogger(ZookeeperClientController.class);

    private static final UUID INSTANCE_UUID = UUID.randomUUID();

//    @Autowired
//    private FeignService feignService;

    @Resource
    @Reference(version = "1.0.0")
    private CityService cityService;

    @GetMapping("getUser")
    public List<City> user(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(cityService.hashCode()+"!!!!!!!!!!!!!!!!");
        return cityService.findAll();
    }

//    @GetMapping("/test")
//    public String test() {
//        log.info("test :" + INSTANCE_UUID.toString());
//        return feignService.test();
//    }

    @RequestMapping("/hello")
    public String hello(String name) {
        return "Hello Eureka " + name;
    }
}
