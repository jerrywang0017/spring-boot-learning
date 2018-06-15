package com.jerry.demo.springboot.scheduled.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DemoScheduled {

    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    @Scheduled(cron = "*/5 * * * * *")
    public void reportCurrentTimeCron() {
        System.out.println("现在时间Cron：" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }
}
