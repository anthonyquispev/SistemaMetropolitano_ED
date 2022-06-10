package Nodos;

import entidades.Cliente;
import java.io.Serializable;

public class NodoCliente implements Serializable {

    public Cliente cliente;
    public NodoCliente siguiente;

    public NodoCliente(Cliente cliente) {
        this.cliente = cliente;
        this.siguiente = null;
    }

}
