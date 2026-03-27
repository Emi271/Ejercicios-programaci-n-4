package com.platredes.platredes.Usuario;
import java.util.*;

public class Usuario {
    private String username;
    // Set garantiza que no haya amigos duplicados
    private Set<Usuario> amigos; 

    public Usuario(String username) {
        this.username = username;
        this.amigos = new HashSet<>();
    }

    public String getUsername() { return username; }
    
    public void agregarAmigo(Usuario amigo) {
        this.amigos.add(amigo);
        amigo.amigos.add(this); 
    }

    public boolean esAmigoDe(Usuario otro) {
        return amigos.contains(otro);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario usuario = (Usuario) obj;
        return Objects.equals(username, usuario.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
