package com.example.Week1Introduction.demoToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "set.frosting", havingValue = "strawberry")
public class StrawberryFrosting implements Frosting {
    public String getFrostingType(){
        return "Strawberry Frosting";
    }
}
