package com.joe.input;

import com.joe.input.schedule.ScheduleService;
import com.joe.input.service.DataInputJobsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author ckh
 * @since 2021/1/19
 */
@SpringBootApplication
public class MainApplication7719 implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication7719.class, args);
    }


    @Resource
    DataInputJobsService service;

    @Resource
    ScheduleService scheduleService;

    /**
     * 调用定时任务, 启动导入
     */
    @Override
    public void run(String... args) throws Exception {
        // do schedule
        scheduleService.testOracle();
        scheduleService.testMysql();
//        service.diagnosisDict();
//        service.clinicItemDict();
        service.clinicMaster();
        service.patMasterIndex();
    }
}
