package camiones;

import vehiculos.Vehiculo;
import vehiculos.TipoCombustible;

public final class Camion extends Vehiculo {
    private double capacidadCargaToneladas;

    public Camion(String marca, String modelo, int anio, TipoCombustible combustible, double capacidadCarga) {
        super(marca, modelo, anio, combustible);
        setCapacidadCargaToneladas(capacidadCarga);
    }

    public void setCapacidadCargaToneladas(double capacidadCargaToneladas) {
        if (capacidadCargaToneladas > 0) {
            this.capacidadCargaToneladas = capacidadCargaToneladas;
        } else {
            throw new IllegalArgumentException("La capacidad de carga debe ser mayor a 0.");
        }
    }

    @Override
    public double calcularConsumo() {
        // Lógica simulada: el consumo aumenta según la carga
        return 15.0 + (capacidadCargaToneladas * 0.5);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("🚛 Camión: " + getIdentificacionBasica() + " | Carga: " + capacidadCargaToneladas + "t | Consumo: " + calcularConsumo() + "L/100km");
    }
}