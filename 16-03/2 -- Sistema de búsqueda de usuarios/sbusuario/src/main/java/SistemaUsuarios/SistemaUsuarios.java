package SistemaUsuarios;

import java.util.HashMap;
import java.util.Collection;

public class SistemaUsuarios {
    private HashMap<String, Usuario> usuarios;

    public SistemaUsuarios() {
        this.usuarios = new HashMap<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.put(usuario.getDni(), usuario);
    }

    public Usuario buscarPorDni(String dni) {
        return usuarios.get(dni);
    }

    public boolean actualizarUsuario(String dni, Usuario usuarioActualizado) {
        if (usuarios.containsKey(dni)) {
            usuarios.put(dni, usuarioActualizado);
            return true;
        }
        return false;
    }

    public boolean eliminarUsuario(String dni) {
        return usuarios.remove(dni) != null;
    }

    public Collection<Usuario> listarUsuarios() {
        return usuarios.values();
    }
}
