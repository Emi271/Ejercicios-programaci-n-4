package motos;

import vehiculos.Vehiculo;
import vehiculos.TipoCombustible;

public final class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int anio, TipoCombustible combustible, int cilindrada) {
        super(marca, modelo, anio, combustible);
        setCilindrada(cilindrada);
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada > 49) {
            this.cilindrada = cilindrada;
        } else {
            throw new IllegalArgumentException("La cilindrada debe ser de al menos 50cc.");
        }
    }

    @Override
    public double calcularConsumo() {
        // Lógica simulada: las motos consumen menos
        return cilindrada * 0.015;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("🏍️ Moto: " + getIdentificacionBasica() + " | Cilindrada: " + cilindrada + "cc | Consumo: " + calcularConsumo() + "L/100km");
    }
}