package com.archaius.controller;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 将值作为JSON响应检索
 * @author FaceFeel
 * @Created 2018-05-23 10:52
 **/
@RestController
public class ArchaiusController {

    private DynamicStringProperty propertyOneWithDynamic = DynamicPropertyFactory.getInstance()
            .getStringProperty("springcloud.archaius.properties.one", "not found!");

    private DynamicStringProperty propertyTwoWithDynamic = DynamicPropertyFactory.getInstance()
            .getStringProperty("springcloud.archaius.properties.two", "not found!");

    private DynamicStringProperty propertyThreeWithDynamic = DynamicPropertyFactory.getInstance()
            .getStringProperty("springcloud.archaius.properties.three", "not found!");

    private DynamicStringProperty propertyFourWithDynamic = DynamicPropertyFactory.getInstance()
            .getStringProperty("springcloud.archaius.properties.four", "not found!");

    @GetMapping("/properties-from-dynamic")
    public Map<String, String> getPropertiesFromDynamic() {
        Map<String, String> properties = new HashMap<>();
        properties.put(propertyOneWithDynamic.getName(), propertyOneWithDynamic.get());
        properties.put(propertyTwoWithDynamic.getName(), propertyTwoWithDynamic.get());
        properties.put(propertyThreeWithDynamic.getName(), propertyThreeWithDynamic.get());
        properties.put(propertyFourWithDynamic.getName(), propertyFourWithDynamic.get());
        return properties;
    }

    @RequestMapping("/hello")
    public String hello(String name) {
        return "Hello Eureka " + name;
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
