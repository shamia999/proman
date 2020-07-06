package com.upgrad.proman.api;

import com.upgrad.proman.service.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration

@SpringBootApplication
@Import(ServiceConfiguration.class)

@ComponentScan({"com.upgrad.proman.service.business","com.upgrad.proman.service.dao", "com.upgrad.proman.api.controller"})

public class promanApplication {
    public static void main(String[] args)

    {
        SpringApplication.run(promanApplication.class,args);
    }
}
