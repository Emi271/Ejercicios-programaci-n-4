package com.platredes.platredes.RedSocial;

import com.platredes.platredes.Usuario.Usuario;
import java.util.*;

public class RedSocial {
    // Búsqueda rápida de perfiles
    private Map<String, Usuario> usuarios = new HashMap<>();

    public void registrarUsuario(Usuario u) {
        usuarios.putIfAbsent(u.getUsername(), u);
    }

    public Usuario buscarUsuario(String username) {
        return usuarios.get(username);
    }
}