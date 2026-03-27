package com.apeventos.apeventos.Eventos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private String categoria;
    private Set<String> participantes; // DNIs únicos

    public Evento(String nombre, LocalDate fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
        this.participantes = new HashSet<>();
    }

    public String getNombre() { return nombre; }
    public LocalDate getFecha() { return fecha; }
    public String getCategoria() { return categoria; }
    public Set<String> getParticipantes() { return participantes; }

    public boolean registrarParticipante(String dni) {
        return participantes.add(dni); // true si se añadió (era único)
    }

    public int numeroParticipantes() {
        return participantes.size();
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %s participantes", nombre, categoria, numeroParticipantes());
    }
}
