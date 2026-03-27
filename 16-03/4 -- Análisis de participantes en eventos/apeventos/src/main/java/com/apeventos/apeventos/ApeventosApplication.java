package com.apeventos.apeventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

import com.apeventos.apeventos.Eventos.Evento;
import com.apeventos.apeventos.Eventos.GestionEventos;

import java.time.LocalDate;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class}) 
public class ApeventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApeventosApplication.class, args);

		GestionEventos gestion = new GestionEventos();

        Evento e1 = new Evento("Concierto", LocalDate.of(2026, 5, 10), "Música");
        Evento e2 = new Evento("Feria Tech", LocalDate.of(2026, 6, 2), "Tecnología");
        Evento e3 = new Evento("Maratón", LocalDate.of(2026, 7, 20), "Deporte");

        gestion.agregarEvento("E1", e1);
        gestion.agregarEvento("E2", e2);
        gestion.agregarEvento("E3", e3);

        gestion.registrarParticipante("E1", "123A");
        gestion.registrarParticipante("E1", "456B");
        gestion.registrarParticipante("E2", "123A"); 
        gestion.registrarParticipante("E3", "789C");
        gestion.registrarParticipante("E3", "456B");

        System.out.println("Participantes únicos totales: " + gestion.contarParticipantesUnicos());
        System.out.println("Eventos por categoría: " + gestion.contarEventosPorCategoria());
        gestion.eventoConMasParticipantes().ifPresent(ev ->
            System.out.println("Evento con más participantes: " + ev)
        );

	}

}
