package com.example.Week1Introduction.demoToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name= "deploy", havingValue = "development")
public class DevDb implements DB{
    public String getData(){
        return "Dev data";
    }
}
