package com.sbusuario.sbusuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SistemaUsuarios.SistemaUsuarios;

@SpringBootApplication
public class SbusuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbusuarioApplication.class, args);
		SistemaUsuarios sistema = new SistemaUsuarios();
        sistema.agregarUsuario(new usuario("12345678A", "Juan Pérez", "juan@email.com", "600123456"));
        sistema.agregarUsuario(new usuario("87654321B", "María García", "maria@email.com", "600987654"));

        Usuario encontrado = sistema.buscarPorDni("12345678A");
        if (encontrado != null) {
            System.out.println("Usuario encontrado: " + encontrado);
        } else {
            System.out.println("Usuario no encontrado");
        }

        // Listar todos
        sistema.listarUsuarios().forEach(System.out::println);
    }

}
