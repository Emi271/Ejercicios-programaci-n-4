package com.adatos.adatos.Datos;

public class Lectura {
    private String idSensor;
    private double valor;
    private long timestamp;

    public Lectura(String idSensor, double valor, long timestamp) {
        this.idSensor = idSensor;
        this.valor = valor;
        this.timestamp = timestamp;
    }

    public String getIdSensor() { return idSensor; }
    public double getValor() { return valor; }
    public long getTimestamp() { return timestamp; }

}
