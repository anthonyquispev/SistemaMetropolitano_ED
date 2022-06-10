package colecciones;

import entidades.Estacion;
import java.io.Serializable;
import java.util.ArrayList;

public class ArregloEstacion implements Serializable {

    private ArrayList<Estacion> estaciones;

    public ArregloEstacion() {
        this.estaciones = new ArrayList<>();
    }

    public boolean add(Estacion e) {
        return this.estaciones.add(e);
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public Estacion getEstacion(int idEstacion) {
        Estacion est = null;
        for (Estacion estacion : this.estaciones) {
            if (idEstacion == estacion.getIdEstacion()) {
                est = estacion;
                break;
            }
        }
        return est;
    }

    public int getIdEstacion(String nombre) {
        int idEstacion = 0;
        for (Estacion estacion : this.estaciones) {
            if (nombre.equals(estacion.getNombre())) {
                idEstacion = estacion.getIdEstacion();
                return idEstacion;
            }
        }
        return idEstacion;
    }

    public Estacion getEstacion(String nombre) {
        Estacion est = null;
        for (Estacion estacion : this.estaciones) {
            if (nombre.equals(estacion.getNombre())) {
                est = estacion;
                break;
            }
        }
        return est;
    }

    public String[] getNombresSinEstVirtual() {
        String[] s = new String[this.estaciones.size() - 1];
        int i = 0;
        for (Estacion est : this.estaciones) {
            if (!est.getNombre().equals("Estación virtual")) {
                s[i] = est.getNombre();
                i++;
            }
        }
        return s;
    }

    public String[] getNombresConEstVirtual() {
        String[] s = new String[this.estaciones.size()];
        int i = 0;
        for (Estacion est : this.estaciones) {
            s[i] = est.getNombre();
            i++;
        }
        return s;
    }

}
