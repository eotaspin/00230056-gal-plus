package com.telefonica.gal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.telefonica.gal" , "com.telefonica.gal.client.spain"})
public class SpainTdServicesConsolidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpainTdServicesConsolidationApplication.class, args);
	}

}
