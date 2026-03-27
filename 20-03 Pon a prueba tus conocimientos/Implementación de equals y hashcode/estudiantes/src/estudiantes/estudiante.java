package estudiantes;

import java.util.List;
import java.util.Objects;

public class Estudiante {
    private int id;
    private String nombre;
    private String email;
    private List<Integer> calificaciones;

    public Estudiante(int id, String nombre, String email, List<Integer> calificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.calificaciones = calificaciones;
    }

    // --- Implementación obligatoria según el contrato ---
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 1. Comparar referencias
        if (obj == null || getClass() != obj.getClass()) return false; // 2. Verificar nulidad y tipo
        
        Estudiante otro = (Estudiante) obj; // 3. Cast seguro
        return this.id == otro.id; // 4. Dos estudiantes son iguales si tienen el mismo id
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // Se usa Objects.hash() con el campo id como identificador único
    }
}