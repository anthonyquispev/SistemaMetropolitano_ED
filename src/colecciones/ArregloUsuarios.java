package colecciones;

import entidades.Usuario;
import java.io.Serializable;
import java.util.ArrayList;

public class ArregloUsuarios implements Serializable {

    private ArrayList<Usuario> usuarios;

    public ArregloUsuarios() {
        this.usuarios = new ArrayList();
    }

    public boolean agregar(Usuario u) {
        return this.usuarios.add(u);
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario validar(String usu, String pass) {
        Usuario result = null;
        for (Usuario user : this.usuarios) {
            if (user.ingresar(usu, pass)) {
                result = user;
                break;
            }
        }
        return result;
    }

    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("USERNAME: " + usuario.getUsername() + "  PASSWORD: " + usuario.getPassword());
        }
    }

    public void eliminarUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                usuarios.remove(usuario);
                break;
            }
        }
    }
}
