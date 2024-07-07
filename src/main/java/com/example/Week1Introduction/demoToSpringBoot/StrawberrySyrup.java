package com.example.Week1Introduction.demoToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "set.syrup", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{
    public String getSyrupType(){
        return "Strawberry Syrup";
    }

    public String getNothing(){
        return "Strawberry null";
    }
}
