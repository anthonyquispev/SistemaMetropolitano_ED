package main;

import entidades.Bus;
import librerias.SerializadoraGen;
import sistema.Sistema;
import ventanaPrincipal.frmIngreso;

public class App {

    public static void main(String[] args) {
        Bus bus01 = new Bus("A", 0);
        Bus bus02 = new Bus("B", 1);
        Bus bus03 = new Bus("C", 2);
        Bus bus04 = new Bus("D", 3);
        Bus bus05 = new Bus("EX1", 4);
        Bus bus06 = new Bus("EX2", 5);
        Bus bus07 = new Bus("EX3", 6);
        Bus bus08 = new Bus("EX4", 7);
        Bus bus09 = new Bus("EX5", 8);
        Bus bus10 = new Bus("EX6", 9);
        Bus bus11 = new Bus("EX7", 10);
        Bus bus12 = new Bus("EX8", 11);
        Bus bus13 = new Bus("SX9", 12);
        Bus bus14 = new Bus("SX", 13);
        Bus bus15 = new Bus("SXN", 14);

        Sistema.buses.agregar(bus01);
        Sistema.buses.agregar(bus02);
        Sistema.buses.agregar(bus03);
        Sistema.buses.agregar(bus04);
        Sistema.buses.agregar(bus05);
        Sistema.buses.agregar(bus06);
        Sistema.buses.agregar(bus07);
        Sistema.buses.agregar(bus08);
        Sistema.buses.agregar(bus09);
        Sistema.buses.agregar(bus10);
        Sistema.buses.agregar(bus11);
        Sistema.buses.agregar(bus12);
        Sistema.buses.agregar(bus13);
        Sistema.buses.agregar(bus14);
        Sistema.buses.agregar(bus15);

        // DESERIALIZACIÓN
        Sistema.estaciones.setEstaciones(SerializadoraGen.deserializar(Sistema.FILE_ESTACIONES));
        Sistema.usuarios.setUsuarios(SerializadoraGen.deserializar(Sistema.FILE_USUARIOS));
        Sistema.movimientosTarjeta.setMovimientos(SerializadoraGen.deserializar(Sistema.FILE_MOVIMIENTOSTARJETA));
        Sistema.movimientosViaje.setMovimientos(SerializadoraGen.deserializar(Sistema.FILE_MOVIMIENTOSVIAJE));
        Sistema.clientes = SerializadoraGen.deserializarClientes(Sistema.FILE_CLIENTES);
        Sistema.empleados = SerializadoraGen.deserializarEmpleados(Sistema.FILE_EMPLEADOS);
        Sistema.mensajesClientes = SerializadoraGen.deserializarMensajesClientes(Sistema.FILE_COLAMENSAJES);
        
        // SERIALIZACIÓN
        // Se realiza la serialización al momento de presionar en los botones SALIR, 
        // pero se puede modificar para que se guarden los datos constantemente.
        
        //  ABRIR VENTANA PRINCIPAL
        frmIngreso frm = new frmIngreso();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }
}
