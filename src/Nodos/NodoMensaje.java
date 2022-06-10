package Nodos;

import entidades.Mensaje;
import java.io.Serializable;

public class NodoMensaje implements Serializable {

    public Mensaje mensaje;
    public NodoMensaje siguiente;

    public NodoMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
        this.siguiente = null;
    }
}
