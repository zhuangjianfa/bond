package com.owner.bond;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * 启动类
 *
 */
@SpringBootApplication
@ComponentScan({"com.owner"})
@MapperScan("com.owner.bond.dao")
@EnableConfigurationProperties
public class BondApplication
{
    @PostConstruct
    void setDefaultTimezone() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
        SpringApplication.run(BondApplication.class,args);
    }
}
