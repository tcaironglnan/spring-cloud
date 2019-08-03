package com.archaius.config;

import com.netflix.config.DynamicConfiguration;
import com.netflix.config.FixedDelayPollingScheduler;
import com.netflix.config.PolledConfigurationSource;
import com.netflix.config.sources.URLConfigurationSource;
import org.apache.commons.configuration.AbstractConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置一个类似于默认config.properties的属性文件，
 * 但其优先级高于Spring环境和应用程序属性的其余部分
 * @author FeeMo
 */
@Configuration
public class ApplicationPropertiesConfigurations {
    @Bean
    public AbstractConfiguration addApplicationPropertiesSource() {
        PolledConfigurationSource source = new URLConfigurationSource("classpath:config.properties");
        return new DynamicConfiguration(source, new FixedDelayPollingScheduler());
    }
}