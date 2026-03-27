package com.apeventos.apeventos.Eventos;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;

public class GestionEventos {
    private Map<String, Evento> eventos; // clave por nombre o id

    public GestionEventos() {
        this.eventos = new HashMap<>();
    }

    public void agregarEvento(String id, Evento evento) {
        eventos.put(id, evento);
    }

    public Evento obtenerEvento(String id) {
        return eventos.get(id);
    }

    public boolean registrarParticipante(String idEvento, String dni) {
        Evento e = eventos.get(idEvento);
        if (e == null) return false;
        return e.registrarParticipante(dni);
    }

    // Análisis con Streams

    // 1) Contar número total de participantes únicos en todos los eventos
    public long contarParticipantesUnicos() {
        return eventos.values().stream()
                .flatMap(e -> e.getParticipantes().stream())
                .distinct()
                .count();
    }

    // 2) Agrupar eventos por categoría y contar eventos por categoría
    public Map<String, Long> contarEventosPorCategoria() {
        return eventos.values().stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
    }

    // 3) Encontrar el evento con más participantes
    public Optional<Evento> eventoConMasParticipantes() {
        return eventos.values().stream()
                .max(Comparator.comparingInt(Evento::numeroParticipantes));
    }

    public Collection<Evento> listarEventos() {
        return eventos.values();
    }
}
