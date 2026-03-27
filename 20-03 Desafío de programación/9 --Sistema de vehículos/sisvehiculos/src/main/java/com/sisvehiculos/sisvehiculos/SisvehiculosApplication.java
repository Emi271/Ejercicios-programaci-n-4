package com.sisvehiculos.sisvehiculos;
import Vehiculos.vehiculo;
import Vehiculos.tipoCombustible;
import automoviles.Auto;
import camiones.Camion;
import Motos.Moto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SisvehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisvehiculosApplication.class, args);

		System.out.println("--- Sistema de Gestión de Flota ---");

        List<Vehiculo> flota = new ArrayList<>();

        // Instanciación de vehículos
        flota.add(new Auto("Toyota", "Corolla", 2023, TipoCombustible.HIBRIDO, 4));
        flota.add(new Camion("Volvo", "FH16", 2021, TipoCombustible.DIESEL, 25.5));
        flota.add(new Moto("Honda", "CBR600", 2022, TipoCombustible.NAFTA, 600));

        // Polimorfismo en acción: iteramos la lista de la clase base (Vehiculo) 
        // y se ejecuta el método mostrarInfo() específico de cada subclase.
        for (Vehiculo v : flota) {
            v.mostrarInfo();
        }

        System.out.println("-----------------------------------");
        // Uso del método estático para obtener la cantidad total de vehículos creados
        System.out.println("Total de vehículos en el sistema: " + Vehiculo.getCantidadVehiculos());
	}

}
