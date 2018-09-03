package com.goldCup.srm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.goldCup.srm.controller" })
public class WebStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(WebStart.class, args);
	}

}
