package com.example.Week1Introduction.demoToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy", havingValue = "production")
public class ProdDb implements DB{
    public String getData(){
        return "Prod data";
    }
}
