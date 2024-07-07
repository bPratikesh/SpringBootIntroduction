package com.example.Week1Introduction.demoToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "set.syrup", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{
    public String getSyrupType(){
        return "Chocolate Syrup";
    }

    public String getNothing(){
        return "Chocolate null";
    }
}
