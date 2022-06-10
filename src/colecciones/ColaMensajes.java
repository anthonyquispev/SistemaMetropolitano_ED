package colecciones;

import Nodos.NodoMensaje;
import entidades.Mensaje;
import java.io.Serializable;
import otros.ConvertirDate_a_String;

public class ColaMensajes implements Serializable {

    public NodoMensaje frente, ultimo;
    private int longitud;

    public ColaMensajes() {
        frente = ultimo = null;
        longitud = 0;
    }

    //Inserción por el final
    public void encolar(Mensaje msj) {
        NodoMensaje nuevoNodo = new NodoMensaje(msj);
        if (frente == null) {
            frente = ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
        longitud++;
    }

    //Eliminar por el frente
    public Mensaje desencolar() {
        Mensaje msj = null;
        if (!vacio()) {
            msj = frente.mensaje;
            if (frente == ultimo) {
                frente = ultimo = null;
            } else {
                frente = frente.siguiente;
            }
            longitud--;
        }
        return msj;
    }

    public boolean vacio() {
        return frente == null;
    }

    public String[][] obtenerMensajesClientes() {
        if (!vacio()) {
            String[][] s = new String[longitud][3];
            int i = 0;
            NodoMensaje temp = frente;
            while (temp != null) {
                s[i][0] = ConvertirDate_a_String.convertirFecha(temp.mensaje.getFechaEnviada());
                s[i][1] = temp.mensaje.getAsunto();
                s[i][2] = temp.mensaje.getEmisor();
                i++;
                temp = temp.siguiente;
            }
            return s;
        }
        return null;
    }

}
