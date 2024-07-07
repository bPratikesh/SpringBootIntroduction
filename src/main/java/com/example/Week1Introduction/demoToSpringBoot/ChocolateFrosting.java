package com.example.Week1Introduction.demoToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "set.frosting", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{
    public String getFrostingType(){
        return "Chocolate frosting";
    }
}
