package com.joe.reinput;

import com.joe.reinput.service.DataService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;


/**
 * @author ckh
 * @since 2021/1/20
 */
@SpringBootApplication
public class DataInputMainApplication7720 implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(DataInputMainApplication7720.class, args);
    }

    @Resource
    DataService service;

    @Override
    public void run(String... args) throws Exception {
        service.testMysql();
        service.testOracle();
    }
}
