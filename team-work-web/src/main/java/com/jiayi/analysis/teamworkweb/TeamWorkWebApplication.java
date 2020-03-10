package com.jiayi.analysis.teamworkweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.jiayi.analysis.teamworkdata"})
public class TeamWorkWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamWorkWebApplication.class, args);
    }

}
