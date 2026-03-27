import java.util.*;
import java.util.stream.Collectors;

public class Contacto {
    private String nombre;
    private String sede;
    private String telefono;

    public Contacto(String nombre, String sede, String telefono) {
        this.nombre = nombre;
        this.sede = sede;
        this.telefono = telefono;
    }

    public String getSede() { return sede; }
    public String getNombre() { return nombre; }
}

class DirectorioEmpresarial {
    // Clave: Nombre, Valor: Contacto para búsquedas O(1)
    private Map<String, Contacto> directorio = new HashMap<>();

    public void agregarOActualizar(Contacto c) {
        directorio.put(c.getNombre(), c);
    }

    public void eliminar(String nombre) {
        directorio.remove(nombre);
    }

    public Contacto buscarPorNombre(String nombre) {
        return directorio.get(nombre);
    }

    public List<Contacto> listarPorSede(String sede) {
        return directorio.values().stream()
            .filter(c -> c.getSede().equalsIgnoreCase(sede))
            .collect(Collectors.toList());
    }
}