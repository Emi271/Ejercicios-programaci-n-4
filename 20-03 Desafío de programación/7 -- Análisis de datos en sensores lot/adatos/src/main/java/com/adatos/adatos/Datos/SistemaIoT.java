package com.adatos.adatos.Datos;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SistemaIoT {
    private List<Lectura> lecturasHistoricas = new ArrayList<>();

    public void agregarLectura(Lectura l) {
        lecturasHistoricas.add(l);
    }

    // Agrupa por sensor y calcula el promedio de sus lecturas
    public Map<String, Double> calcularPromediosPorSensor() {
        return lecturasHistoricas.stream()
            .collect(Collectors.groupingBy(
                Lectura::getIdSensor,
                Collectors.averagingDouble(Lectura::getValor)
            ));
    }

    // Retorna lecturas que superen un umbral (alertas)
    public List<Lectura> obtenerAlertas(double umbralMaximo) {
        return lecturasHistoricas.stream()
            .filter(l -> l.getValor() > umbralMaximo)
            .collect(Collectors.toList());
    }
}
