package com.platredes.platredes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.platredes.platredes.Usuario.Usuario;
import com.platredes.platredes.RedSocial.RedSocial;

@SpringBootApplication
public class PlatredesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatredesApplication.class, args);

		RedSocial red = new RedSocial();

        Usuario user1 = new Usuario("emi_dev");
        Usuario user2 = new Usuario("gaston_code");
        Usuario user3 = new Usuario("luna_design");

        red.registrarUsuario(user1);
        red.registrarUsuario(user2);

        user1.agregarAmigo(user2);
        user1.agregarAmigo(user2); // Intentamos duplicar la amistad

        System.out.println("¿emi_dev es amigo de gaston_code?: " + user1.esAmigoDe(user2)); // true
        System.out.println("¿gaston_code es amigo de emi_dev?: " + user2.esAmigoDe(user1)); // true (relación bidireccional)
        System.out.println("¿emi_dev es amigo de luna_design?: " + user1.esAmigoDe(user3)); // false
	}

}
