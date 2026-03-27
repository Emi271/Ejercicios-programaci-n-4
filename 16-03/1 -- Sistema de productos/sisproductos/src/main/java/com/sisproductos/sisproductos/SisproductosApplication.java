package com.sisproductos.sisproductos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import producto.producto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class}) 
public class SisproductosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SisproductosApplication.class, args);
    }

    @Bean
    public CommandLineRunner ejecutar() { 
        return args -> {
            List<producto> productos = new ArrayList<>();
            productos.add(new producto("Laptop", 999.99, "Electrónica"));
            productos.add(new producto("Mouse", 25.50, "Accesorios"));
            productos.add(new producto("Teclado", 75.00, "Accesorios"));
            productos.add(new producto("Monitor", 299.99, "Electrónica"));

            System.out.println("\n--- Pruebas de Ordenamiento ---");

            productos.sort(Comparator.comparing(producto::getPrecio));
            System.out.println("Ordenado por precio: " + productos);

            productos.sort(Comparator.comparing(producto::getNombre).reversed());
            System.out.println("Ordenado por nombre (DESC): " + productos);

            productos.sort(Comparator.comparing(producto::getCategoria)
                    .thenComparing(producto::getPrecio));
            System.out.println("Ordenado por categoría y precio: " + productos);
            
            System.out.println("-------------------------------\n");
        };
    }
}