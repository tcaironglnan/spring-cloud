package com.task.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author FeeMo
 */
@Component
public class ScheduledTask {
    /**
     * 每隔1秒执行, 单位：ms。
     */
    @Scheduled(fixedRate = 1000)
    public void testFixRate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        System.out.println("每隔1秒执行一次：" + dateFormat.format(new Date()));
    }
}