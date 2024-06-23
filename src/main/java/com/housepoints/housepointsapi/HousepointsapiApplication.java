package com.housepoints.housepointsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HousepointsapiApplication {

	public static void main(String[] args) {
		SystemPropertiesLoader.loadProperties();
		SpringApplication.run(HousepointsapiApplication.class, args);
	}

}
