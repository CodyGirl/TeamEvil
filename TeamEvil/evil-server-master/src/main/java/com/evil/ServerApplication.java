package com.evil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;


@SpringBootApplication
@EntityScan(basePackages = {"com.evil.domain"})
@ComponentScan(basePackages = "com.evil")
public class ServerApplication {

    @PostConstruct
    public void callMethods() {

    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);

    }
}
