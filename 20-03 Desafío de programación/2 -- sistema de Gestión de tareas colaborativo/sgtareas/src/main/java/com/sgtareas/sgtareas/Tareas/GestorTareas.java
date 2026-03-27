package com.sgtareas.sgtareas.Tareas;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.List;

public class GestorTareas {
    private Queue<Tarea> colaTareas = new PriorityQueue<>();
    private List<Tarea> todasLasTareas = new ArrayList<>();

    public void agregarTarea(Tarea t) {
        colaTareas.offer(t);
        todasLasTareas.add(t);
    }

    public Tarea obtenerSiguienteTareaCritica() {
        return colaTareas.poll();
    }

    public List<Tarea> filtrarPorEstado(String estadoBuscado) {
        return todasLasTareas.stream()
            .filter(t -> t.getEstado().equalsIgnoreCase(estadoBuscado))
            .collect(Collectors.toList());
    }
}
