package otros;

import colecciones.ArbolGeneral;
import entidades.*;
import sistema.Sistema;

public class Excepciones {

    public void validarCliente(Cliente c) throws MiExcepcion {
        if (c.getNombres().equals("") || c.getApellidoPaterno().equals("")
                || c.getApellidoMaterno().equals("")
                || String.valueOf(c.getEdad()).equals("")
                || c.getDni().equals("")) {
            throw new MiExcepcion("Rellene todos los campos");
        }
        if (!this.validarDni(c.getDni())) {
            throw new MiExcepcion("DNI inválido: Ingrese un número de 8 dígitos");
        }
        if (this.evaluarDni(c.getDni())) {
            throw new MiExcepcion("Este DNI ya ha sido registrado");
        }
    }

    // Validar que el DNI tenga 8 dígitos
    public static boolean validarDni(String dni) {
        if (dni.length() != 8) {
            return false;
        }
        String numero = "";
        String tempDni = "";
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < dni.length(); i++) {
            numero = dni.substring(i, i + 1);
            for (int j = 0; j < nums.length; j++) {
                if (numero.equals(nums[j])) {
                    tempDni += nums[j];
                }
            }
        }
        if (tempDni.length() != 8) {
            return false;
        } else {
            return true;
        }
    }

    // Evitar DNI duplicados
    public boolean evaluarDni(String dni) {
        boolean resultClientes = Sistema.clientes.buscarDni(dni);
        //Primero se evalua los DNI de los clientes
        if (resultClientes) {
            return true;
        //Luego los DNI de los empleados    
        } else {
            boolean[] b = {false};
            ArbolGeneral arbol = Sistema.empleados;
            arbol.buscarDni(arbol.raiz, b, dni);
            return b[0];
        }
    }
    
    public void validarEmpleado(Empleado e) throws MiExcepcion{
        if (e.getNombres().equals("") || e.getApellidoPaterno().equals("")
                || e.getApellidoMaterno().equals("")
                || String.valueOf(e.getEdad()).equals("")
                || e.getDni().equals("")) {
            throw new MiExcepcion("Rellene todos los campos");
        }
        if (!this.validarDni(e.getDni())) {
            throw new MiExcepcion("DNI inválido: Ingrese un número de 8 dígitos");
        }
        if (this.evaluarDni(e.getDni())) {
            throw new MiExcepcion("Este DNI ya ha sido registrado");
        }        
    }
    
}
