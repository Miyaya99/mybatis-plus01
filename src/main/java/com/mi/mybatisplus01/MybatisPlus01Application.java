package com.mi.mybatisplus01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.mi.mybatisplus01.mapper")
public class MybatisPlus01Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus01Application.class, args);
    }

}
