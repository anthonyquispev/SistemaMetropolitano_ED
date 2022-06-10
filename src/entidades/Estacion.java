package entidades;

import java.io.Serializable;

public class Estacion implements Serializable {

    private int idEstacion;
    private String nombre;
    private String ubicacion;
    
    //Longitud que debe se debe recorrer para llegar hacia la próxima estación de norte a sur
    private double distancia;
    //Tiempo que demora en llegar hacia la próxima estación de norte a sur
    private double tiempo;
    //Aquí se almacenará todo el monto acumulado por cada estación
    private Taquilla taquilla;

    public Estacion(String nombre, String ubicacion, int idEstacion, double distancia, double tiempo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.taquilla = new Taquilla();
        this.idEstacion = idEstacion;
    }

    public Estacion(String nombre, String ubicacion, int idEstacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.taquilla = new Taquilla();
        this.idEstacion = idEstacion;
    }

    public int getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(int idEstacion) {
        this.idEstacion = idEstacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public Taquilla getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(Taquilla taquilla) {
        this.taquilla = taquilla;
    }

}
