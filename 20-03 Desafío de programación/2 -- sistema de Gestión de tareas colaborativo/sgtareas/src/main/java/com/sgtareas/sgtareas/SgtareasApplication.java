package com.sgtareas.sgtareas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

import com.sgtareas.sgtareas.Tareas.GestorTareas;
import com.sgtareas.sgtareas.Tareas.Tarea;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
public class SgtareasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgtareasApplication.class, args);

		GestorTareas gestor = new GestorTareas();

        gestor.agregarTarea(new Tarea("T1", "Diseñar base de datos", "Pendiente", 3));
        gestor.agregarTarea(new Tarea("T2", "Corregir bug en producción", "EnProgreso", 1)); // Crítica
        gestor.agregarTarea(new Tarea("T3", "Actualizar documentación", "Pendiente", 5));

        System.out.println("Siguiente tarea a procesar (debería ser la T2):");
        Tarea critica = gestor.obtenerSiguienteTareaCritica();
        System.out.println("- " + critica.getEstado() + " | Prioridad: " + critica.getPrioridad());

        System.out.println("\nTareas pendientes:");
        gestor.filtrarPorEstado("Pendiente").forEach(t -> 
            System.out.println("- Prioridad: " + t.getPrioridad())
        );
	}

}
