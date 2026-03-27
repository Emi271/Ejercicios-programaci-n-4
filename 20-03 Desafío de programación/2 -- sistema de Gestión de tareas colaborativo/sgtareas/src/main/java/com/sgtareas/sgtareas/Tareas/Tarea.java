package com.sgtareas.sgtareas.Tareas;

public class Tarea implements Comparable<Tarea> {
    private String id;
    private String titulo;
    private String estado; // Pendiente, EnProgreso, Completada
    private int prioridad; 

    public Tarea(String id, String titulo, String estado, int prioridad) {
        this.id = id;
        this.titulo = titulo;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    public String getEstado() { return estado; }
    public int getPrioridad() { return prioridad; }
    public void setEstado(String estado) { this.estado = estado; }


    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }
}