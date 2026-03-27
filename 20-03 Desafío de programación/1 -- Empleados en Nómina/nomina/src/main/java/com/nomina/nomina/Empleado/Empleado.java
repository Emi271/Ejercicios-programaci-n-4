package com.nomina.nomina.Empleado;

import java.util.Objects;

public class Empleado {
    private int id;
    private String nombre;
    private String departamento;

    public Empleado(int id, String nombre, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Identidad basada estrictamente en el ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Empleado empleado = (Empleado) obj;
        return id == empleado.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "'}";
    }
}
