package com.adatos.adatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

import com.adatos.adatos.Datos.Lectura;
import com.adatos.adatos.Datos.SistemaIoT;
import java.util.Map;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class}) 
public class AdatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdatosApplication.class, args);

		SistemaIoT sistema = new SistemaIoT();

        sistema.agregarLectura(new Lectura("SENSOR-TEMP", 22.5, 1610000000L));
        sistema.agregarLectura(new Lectura("SENSOR-TEMP", 24.5, 1610000010L));
        sistema.agregarLectura(new Lectura("SENSOR-HUMEDAD", 60.0, 1610000000L));
        sistema.agregarLectura(new Lectura("SENSOR-TEMP", 35.0, 1610000020L)); // Alerta

        Map<String, Double> promedios = sistema.calcularPromediosPorSensor();
        System.out.println("Promedio SENSOR-TEMP: " + promedios.get("SENSOR-TEMP")); // 27.33
        System.out.println("Promedio SENSOR-HUMEDAD: " + promedios.get("SENSOR-HUMEDAD")); // 60.0

        System.out.println("\nAlertas (Temperatura > 30):");
        sistema.obtenerAlertas(30.0).forEach(a -> 
            System.out.println("- Sensor: " + a.getIdSensor() + " | Valor: " + a.getValor())
        );
	}

}
