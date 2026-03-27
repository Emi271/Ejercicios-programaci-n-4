package com.sreservas.sreservas.Sala;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.*;


import com.sreservas.sreservas.Reserva.Reserva;

public class Sala {
    private String id;
    private int capacidad;
    private List<Reserva> calendario = new ArrayList<>();

    public Sala(String id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
    }

    public boolean estaDisponible(LocalDateTime inicio, LocalDateTime fin) {
        return calendario.stream()
                .noneMatch(reserva -> reserva.seSuperponeCon(inicio, fin));
    }

    public boolean reservar(LocalDateTime inicio, LocalDateTime fin, String usuario) {
        if (estaDisponible(inicio, fin)) {
            calendario.add(new Reserva(inicio, fin, usuario));
            return true;
        }
        return false;
    }
    
    public int getCapacidad() { return capacidad; }
}
