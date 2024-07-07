package com.example.Week1Introduction.demoToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    Frosting fr;
    @Autowired
    Syrup sr;
    public void bakeCake(){
        System.out.println("Cakes Frosting is "+fr.getFrostingType()+" and syrup is "+sr.getSyrupType()+"."+sr.getNothing());
    }
}
