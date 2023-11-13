package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoTareasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoTareasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Prueba de subida a Github en un proyecto nuevo");
		
		System.out.println("Prueba de cambio en la misma rama");
	}

}
