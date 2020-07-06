package com.upgrad.proman.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;

@Configuration
@ComponentScan("com.upgrad.proman.service")
@EntityScan("com.uprgad.proman.service.entity") //it only declares the classes to be used by persistence context

public class ServiceConfiguration {


}
