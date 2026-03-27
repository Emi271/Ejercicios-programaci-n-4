package com.sisinventario.sisinventario.Producto;

public class Producto {
    // Contador estático compartido por todas las instancias
    private static int totalProductosRegistrados = 0;

    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        // Se incrementa el contador global cada vez que se llama al constructor
        totalProductosRegistrados++;
    }

    // Método estático para consultar el total sin instanciar
    public static int getTotalProductosRegistrados() {
        return totalProductosRegistrados;
    }

    public String getCodigo() { return codigo; }
}
