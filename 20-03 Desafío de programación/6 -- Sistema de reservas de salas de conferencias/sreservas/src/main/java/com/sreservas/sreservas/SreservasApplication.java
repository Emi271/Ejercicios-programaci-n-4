package com.sreservas.sreservas;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

import com.sreservas.sreservas.Reserva.GestorReservas;
import com.sreservas.sreservas.Sala.Sala;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class}) 
public class SreservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SreservasApplication.class, args);

		GestorReservas gestor = new GestorReservas();
        Sala sala1 = new Sala("SALA-A", 10);
        
        LocalDateTime inicio1 = LocalDateTime.of(2026, 4, 10, 10, 0);
        LocalDateTime fin1 = LocalDateTime.of(2026, 4, 10, 12, 0);
        
        System.out.println("Reserva 1 (10hs a 12hs): " + sala1.reservar(inicio1, fin1, "Equipo Frontend")); // true

        LocalDateTime inicio2 = LocalDateTime.of(2026, 4, 10, 11, 0);
        LocalDateTime fin2 = LocalDateTime.of(2026, 4, 10, 13, 0);
        
        System.out.println("Reserva 2 (11hs a 13hs - superpuesta): " + sala1.reservar(inicio2, fin2, "Equipo Backend")); // false
	}

}
