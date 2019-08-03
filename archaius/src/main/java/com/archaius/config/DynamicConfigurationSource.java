package com.archaius.config;

import com.netflix.config.PollResult;
import com.netflix.config.PolledConfigurationSource;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 读取配置文件
 * @author FeeMo
 */
@Configuration
public class DynamicConfigurationSource implements PolledConfigurationSource {
    @Override
    public PollResult poll(boolean initial, Object checkPoint) throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("test", UUID.randomUUID().toString());
        return PollResult.createFull(map);
    }
}