package entidades;

import java.io.Serializable;

public class Persona implements Serializable {

    private String dni;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String usuario;

    public Persona(String dni, String nombres, String apellidoPaterno, String apellidoMaterno, int edad) {
        this.dni = dni;
        this.nombres = nombres.toUpperCase();
        this.apellidoPaterno = apellidoPaterno.toUpperCase();
        this.apellidoMaterno = apellidoMaterno.toUpperCase();
        this.edad = edad;
    }

    public Persona(String dni, String nombres, String apellidoPaterno, String apellidoMaterno, int edad, String username) {
        this.dni = dni;
        this.nombres = nombres.toUpperCase();
        this.apellidoPaterno = apellidoPaterno.toUpperCase();
        this.apellidoMaterno = apellidoMaterno.toUpperCase();
        this.edad = edad;
        this.usuario = username;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
