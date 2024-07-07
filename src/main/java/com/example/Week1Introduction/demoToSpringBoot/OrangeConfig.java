package com.example.Week1Introduction.demoToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrangeConfig {

    @Bean
    Orange getOr(){
        return new Orange();
    }
}
