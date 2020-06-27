package com.upgrad.proman.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;

@Configuration
@ComponentScan("com.upgrad.proman.service")
@EntityScan("com.uprgad.proman.service.entity")

public class ServiceConfiguration {


}
