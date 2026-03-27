package com.sreservas.sreservas.Reserva;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

import com.sreservas.sreservas.Sala.Sala;

public class GestorReservas {
    private List<Sala> salas = new ArrayList<>();

    public List<Sala> buscarSalasDisponibles(int capacidadRequerida, LocalDateTime inicio, LocalDateTime fin) {
        return salas.stream()
            .filter(s -> s.getCapacidad() >= capacidadRequerida)
            .filter(s -> s.estaDisponible(inicio, fin))
            .collect(Collectors.toList());
    }
}
