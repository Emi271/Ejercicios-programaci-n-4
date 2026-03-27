package empleados;

import java.util.*;
import java.util.stream.Collectors;

public class AnalisisEmpleados {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
            new Empleado("Ana", "IT", 3500, 5),
            new Empleado("Luis", "Ventas", 3000, 3),
            new Empleado("María", "IT", 4000, 8),
            new Empleado("Pedro", "RRHH", 3200, 4),
            new Empleado("Sofia", "Ventas", 3100, 2)
        );

        // 1. Filtrar por departamento
        List<Empleado> deptoIT = empleados.stream()
            .filter(e -> e.getDepartamento().equals("IT"))
            .collect(Collectors.toList());

        // 2. Calcular salario promedio
        double promedio = empleados.stream()
            .mapToDouble(Empleado::getSalario)
            .average()
            .orElse(0.0);

        // 3. Encontrar máximo salario
        Empleado maxSalario = empleados.stream()
            .max(Comparator.comparingDouble(Empleado::getSalario))
            .orElse(null);

        // 4. Agrupar por departamento
        Map<String, List<Empleado>> agrupados = empleados.stream()
            .collect(Collectors.groupingBy(Empleado::getDepartamento));

        // 5. Filtrar senior (más de 3 años exp y salario > 3000)
        List<Empleado> seniors = empleados.stream()
            .filter(e -> e.getAñosExperiencia() > 3 && e.getSalario() > 3000)
            .collect(Collectors.toList());
    }
}