package com.tomorrow.serviceprovide.Timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 测试定时器
 *
 * @AUTHOR TCH
 * @CREATE 2018-02-20
 **/
@Component
public class TestTimer {

    @Scheduled(cron="1 * * * * ?") //每1秒执行一次
    public void statusCheck() {
        System.out.println("1");
    }
}
