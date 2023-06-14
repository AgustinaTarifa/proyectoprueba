package com.unla.proyectoprueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class ProyectopruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectopruebaApplication.class, args);
	}

}
