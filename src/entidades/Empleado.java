package entidades;

import java.io.Serializable;
import otros.CargosEmpleados;

public class Empleado extends Persona implements Serializable {

    private int idCargo;
    private int nivel;
    private String nombreCargo;
    private int idCargoJefe;
    private double sueldo;

    public Empleado(int idCargo, String dni, String nombres, String apellidoPaterno, String apellidoMaterno, int edad) {
        super(dni, nombres, apellidoPaterno, apellidoMaterno, edad);
        this.idCargo = idCargo;
        this.nivel = (int) CargosEmpleados.infoEmpleado[idCargo][0];
        this.nombreCargo = (String) CargosEmpleados.infoEmpleado[idCargo][1];
        this.idCargoJefe = (int) CargosEmpleados.infoEmpleado[idCargo][2];
        this.sueldo = (double) CargosEmpleados.infoEmpleado[idCargo][3];
    }

    //Constructor para los registros iniciales
    public Empleado(int idCargo, String dni, String nombres, String apellidoPaterno, String apellidoMaterno, int edad, String username) {
        super(dni, nombres, apellidoPaterno, apellidoMaterno, edad, username);
        this.idCargo = idCargo;
        this.nivel = (int) CargosEmpleados.infoEmpleado[idCargo][0];
        this.nombreCargo = (String) CargosEmpleados.infoEmpleado[idCargo][1];
        this.idCargoJefe = (int) CargosEmpleados.infoEmpleado[idCargo][2];
        this.sueldo = (double) CargosEmpleados.infoEmpleado[idCargo][3];
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public int getIdCargoJefe() {
        return idCargoJefe;
    }

    public double getSueldo() {
        return sueldo;
    }
    public String getNombresYCargo() {
        return super.getNombres() + " " + super.getApellidoPaterno() + "(" + getNombreCargo() + ")";
    }

}
