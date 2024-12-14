package com.ejercio2.Ejerci2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "com.ejercio2.Ejerci2")
@EntityScan(basePackages = "com.ejercio2.Ejerci2.domain.entity")
public class Ejerci2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejerci2Application.class, args);
	}

}
