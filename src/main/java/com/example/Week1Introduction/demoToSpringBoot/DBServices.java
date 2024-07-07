package com.example.Week1Introduction.demoToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBServices {

    // 1.injecting dependencies using annotation
    //@Autowired
    final private DB db;

    // 2.injecting dependencies using constructor
    public DBServices(DB db){
        this.db=db;
    }

    String getData(){
        return db.getData();
    }
}
