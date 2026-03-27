package com.nomina.nomina;

import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;


import java.util.Set;
import com.nomina.nomina.Empleado.Empleado;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class NominaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NominaApplication.class, args);
    } 
    private Set<Empleado> empleados = new HashSet<>();
    public boolean agregarEmpleado(Empleado emp) {
        return empleados.add(emp); 
    }

    public boolean existeEmpleado(Empleado emp) {
        return empleados.contains(emp); 
    }
}
