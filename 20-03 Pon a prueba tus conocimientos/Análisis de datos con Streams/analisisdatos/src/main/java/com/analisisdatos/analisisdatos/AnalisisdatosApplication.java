package com.analisisdatos.analisisdatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class}) 
public class AnalisisdatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalisisdatosApplication.class, args);
	}

}
