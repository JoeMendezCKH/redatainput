package com.joe.input;

import com.joe.input.schedule.Timing;
import com.joe.input.service.DataService;
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
    DataService dataService;

    @Resource
    Timing timing;

    /**
     * 调用定时任务, 启动导入
     */
    @Override
    public void run(String... args) throws Exception {
        // do schedule
        timing.testOracle();
        timing.testMysql();
        TimeUnit.SECONDS.sleep(3);
        dataService.diagnosisDict();
        System.out.println("aaaaaaaaaaaaaa");
    }
}
