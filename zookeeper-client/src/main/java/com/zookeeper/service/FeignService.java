package com.zookeeper.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author FeeMo
 */
@FeignClient(value = "service-zookeeper-server", fallback = FeignFallbackImpl.class)
public interface FeignService {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test();
}
