package com.estudiantes.estudiantes;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import estudiantes.Estudiante;



@SpringBootApplication
public class EstudiantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudiantesApplication.class, args);

		List<Integer> notas1 = Arrays.asList(8, 9, 10);
        List<Integer> notas2 = Arrays.asList(7, 6, 8);

        Estudiante est1 = new Estudiante(1, "Emir", "emir@email.com", notas1);
        Estudiante est2 = new Estudiante(2, "Dante", "dante@email.com", notas2); 
        Estudiante est3 = new Estudiante(3, "Gena", "gena@email.com", notas1);

        System.out.println("--- Prueba de equals y hashCode ---");
        
        System.out.println("¿est1 es igual a est2?: " + est1.equals(est2)); 

        System.out.println("¿est1 es igual a est3?: " + est1.equals(est3)); 


        System.out.println("Hash de est1: " + est1.hashCode());
        System.out.println("Hash de est2 (debería ser igual al de est1): " + est2.hashCode());
	}

}
