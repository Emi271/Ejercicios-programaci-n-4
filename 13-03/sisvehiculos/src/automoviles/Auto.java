package automoviles;

import vehiculos.Vehiculo;
import vehiculos.TipoCombustible;

// Usamos final para evitar que Auto tenga subclases
public final class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int anio, TipoCombustible combustible, int cantidadPuertas) {
        super(marca, modelo, anio, combustible);
        setCantidadPuertas(cantidadPuertas);
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        if (cantidadPuertas > 1 && cantidadPuertas <= 5) {
            this.cantidadPuertas = cantidadPuertas;
        } else {
            throw new IllegalArgumentException("Cantidad de puertas inválida.");
        }
    }

    @Override
    public double calcularConsumo() {
        // Lógica simulada: un auto consume 8 litros cada 100km
        return 8.5; 
    }

    @Override
    public void mostrarInfo() {
        System.out.println("🚗 Auto: " + getIdentificacionBasica() + " | Puertas: " + cantidadPuertas + " | Consumo: " + calcularConsumo() + "L/100km");
    }
}