package com.ejercio2.Ejerci2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD

@SpringBootApplication
=======
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "com.ejercio2.Ejerci2")
@EntityScan(basePackages = "com.ejercio2.Ejerci2.domain.entity")
>>>>>>> 13d76c896632fd726d4175cc0a1e3ece868d9b10
public class Ejerci2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejerci2Application.class, args);
	}

}
