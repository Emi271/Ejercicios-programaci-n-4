package empleados;

import java.util.*;
import java.util.stream.Collectors;

public class Empleado {
    public String nombre;
    public String departamento;
    private double salario;
    private int aniosExperiencia;

    public Empleado(String nombre, String departamento, double salario, int aniosExperiencia) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public int getAñosExperiencia() {
        return aniosExperiencia;
    }


List empleados = Arrays.asList(
    new Empleado("Paco", "Dev", 5000, 3),
    new Empleado("Gena", "Dev", 3000, 2),
    new Empleado("Lily", "Marketing", 4000, 2),
    new Empleado("Dante", "RRHH", 2000, 2)
);
}