package com.gao.jin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.gao.jin.mapper")
@EnableScheduling
public class GaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GaoApplication.class, args);
    }
}