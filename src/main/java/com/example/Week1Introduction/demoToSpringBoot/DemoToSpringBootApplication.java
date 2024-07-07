package com.example.Week1Introduction.demoToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoToSpringBootApplication implements CommandLineRunner {

//	@Autowired
//	Orange obj;

//	@Autowired
//	DBServices dbServices;

	@Autowired
	CakeBaker cb;

	public static void main(String[] args) {
		SpringApplication.run(DemoToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//obj.eatOrange();
		//System.out.println(dbServices.getData());

		cb.bakeCake();
	}
}
