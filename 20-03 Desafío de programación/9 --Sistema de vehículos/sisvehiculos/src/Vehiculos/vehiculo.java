package vehiculos;

public abstract class Vehiculo {
    // Atributos privados para encapsulamiento estricto
    private String marca;
    private String modelo;
    private int anio;
    private TipoCombustible combustible;
    
    // Contador global de instancias (static)
    private static int contadorVehiculos = 0;
    
    // Constante (final) compartida por todos los vehículos
    public static final int ANIO_MINIMO_PERMITIDO = 1900;

    public Vehiculo(String marca, String modelo, int anio, TipoCombustible combustible) {
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
        this.combustible = combustible;
        
        contadorVehiculos++; // Incrementa cada vez que se crea un vehículo
    }

    // Métodos abstractos que obligan a las subclases a implementarlos
    public abstract double calcularConsumo();
    public abstract void mostrarInfo();

    // Método final que no puede ser sobrescrito por las subclases
    public final String getIdentificacionBasica() {
        return marca + " " + modelo + " (" + anio + ")";
    }

    // Método estático para acceder al contador
    public static int getCantidadVehiculos() {
        return contadorVehiculos;
    }

    // Getters y Setters con validación (Encapsulamiento)
    public String getMarca() { return marca; }
    
    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
    }

    public String getModelo() { return modelo; }
    
    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            throw new IllegalArgumentException("El modelo no puede estar vacío.");
        }
    }

    public int getAnio() { return anio; }
    
    public void setAnio(int anio) {
        if (anio >= ANIO_MINIMO_PERMITIDO) {
            this.anio = anio;
        } else {
            throw new IllegalArgumentException("El año debe ser mayor o igual a " + ANIO_MINIMO_PERMITIDO);
        }
    }

    public TipoCombustible getCombustible() { return combustible; }
    public void setCombustible(TipoCombustible combustible) { this.combustible = combustible; }
}