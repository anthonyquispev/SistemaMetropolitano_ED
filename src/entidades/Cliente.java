package entidades;

import Nodos.NodoMensaje;
import colecciones.*;
import java.io.Serializable;
import java.util.ArrayList;
import otros.ConvertirDate_a_String;

public class Cliente extends Persona implements Serializable {

    private ArrayList<Tarjeta> tarjetas;
    private boolean movViaje; // Determina si un cliente está actualmente en un viaje o no

    private PilaMensajes mensajesEnviados;
    private PilaMensajes mensajesRecibidos;

    public Cliente(String dni, String nombres, String apellidoPaterno, String apellidoMaterno, int edad) {
        super(dni, nombres, apellidoPaterno, apellidoMaterno, edad);
        this.tarjetas = new ArrayList();
        this.movViaje = false;
        this.mensajesEnviados = new PilaMensajes();
        this.mensajesRecibidos = new PilaMensajes();
    }

    public boolean isMovViaje() {
        return movViaje;
    }

    public void setMovViaje(boolean movViaje) {
        this.movViaje = movViaje;
    }

    public boolean insertarTarjeta(Tarjeta t) {
        return this.tarjetas.add(t);
    }

    public int getNumeroTarjetas() {
        return this.tarjetas.size();
    }

    //¿El cliente tiene una tarjeta con este código?
    public boolean isTarjeta(int idTarjeta) {
        for (Tarjeta tarjeta : tarjetas) {
            if (idTarjeta == tarjeta.getIdTarjeta()) {
                return true;
            }
        }
        return false;
    }

    public String[] getTarjetas() {
        String[] s = new String[this.tarjetas.size()];
        int i = 0;
        for (Tarjeta t : this.tarjetas) {
            s[i] = String.valueOf(t.getIdTarjeta());
            i++;
        }
        return s;
    }

    public Tarjeta getTarjeta(int idTarjeta) {
        Tarjeta tarjeta = null;
        for (Tarjeta t : this.tarjetas) {
            if (idTarjeta == t.getIdTarjeta()) {
                tarjeta = t;
                break;
            }
        }
        return tarjeta;
    }

    public void apilarMensajeEnviado(Mensaje mensaje) {
        this.mensajesEnviados.apilar(mensaje);
    }

    public void desapilarMensajeEnviado() {
        this.mensajesEnviados.desapilar();
    }

    public String[][] getMensajesEnviados() {
        if (!this.mensajesEnviados.isEmpty()) {
            String[][] s = new String[mensajesEnviados.nElementos()][3];
            int i = 0;
            NodoMensaje temp = mensajesEnviados.cima;
            while (temp != null) {
                s[i][0] = temp.mensaje.getAsunto();
                s[i][1] = temp.mensaje.getTextoEmisor();
                s[i][2] = ConvertirDate_a_String.convertirFecha(temp.mensaje.getFechaEnviada());
                i++;
                temp = temp.siguiente;
            }
            return s;
        }
        return null;
    }

    public void apilarMensajeRecibido(Mensaje mensaje) {
        this.mensajesRecibidos.apilar(mensaje);
    }

    public void desapilarMensajeRecibido() {
        this.mensajesRecibidos.desapilar();
    }

    public String[][] getMensajesRecibidos() {
        if (!this.mensajesRecibidos.isEmpty()) {
            String[][] s = new String[mensajesRecibidos.nElementos()][2];
            int i = 0;
            NodoMensaje temp = mensajesRecibidos.cima;
            while (temp != null) {
                s[i][0] = temp.mensaje.getTextoEmisor();
                s[i][1] = temp.mensaje.getTextoReceptor();
                i++;
                temp = temp.siguiente;
            }
            return s;
        }
        return null;
    }
}
