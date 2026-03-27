package com.sreservas.sreservas.Reserva;

import java.time.LocalDateTime;

public class Reserva {
  private LocalDateTime inicio;
    private LocalDateTime fin;
    private String usuario;

    public Reserva(LocalDateTime inicio, LocalDateTime fin, String usuario) {
        this.inicio = inicio;
        this.fin = fin;
        this.usuario = usuario;
    }

    public boolean seSuperponeCon(LocalDateTime nuevoInicio, LocalDateTime nuevoFin) {
        return inicio.isBefore(nuevoFin) && nuevoInicio.isBefore(fin);
    }  
}
