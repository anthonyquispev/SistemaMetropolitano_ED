package Nodos;

import entidades.Empleado;
import java.io.Serializable;

public class NodoArbol implements Serializable{
    public Empleado empleado;
    public NodoArbol hijo;
    public NodoArbol hermano;
    
    public NodoArbol(Empleado e) {
        empleado = e;
        hijo = null;
        hermano = null;
    }
}
