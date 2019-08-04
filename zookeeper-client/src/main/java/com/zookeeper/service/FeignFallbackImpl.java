package com.zookeeper.service;
import org.springframework.stereotype.Component;

/**
 * @author FeeMo
 */
@Component
public class FeignFallbackImpl implements FeignService {

    @Override
    public String test() {
        return "service error!";
    }
}