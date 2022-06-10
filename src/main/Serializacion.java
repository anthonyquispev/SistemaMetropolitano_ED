package main;

import colecciones.*;
import entidades.*;
import java.util.ArrayList;
import librerias.SerializadoraGen;
import sistema.*;

public class Serializacion {

    public static void main(String[] args) {
        
        // Al compilar se crean los archivos correspondientes
        // y si estos ya existen, entonces se reemplazan por nuevos archivos, reseteando la data
        
        /* USUARIOS */
        Usuario u01 = new Usuario("MASTER", "76413156", 1);
        Usuario u02 = new Usuario("CASTAÑEDAM2", "77414526", 1);
        Usuario u03 = new Usuario("ESPINOZAR3", "74484174", 1);
        Usuario u04 = new Usuario("MAUROJ4", "14123456", 1);
        Usuario u05 = new Usuario("MORENOM5", "98456789", 1);
        Usuario u06 = new Usuario("JIMÉNEZR6", "78451245", 1);
        Usuario u07 = new Usuario("PINEDOM7", "45121214", 1);
        Usuario u08 = new Usuario("MORENOF8", "76193457", 1);
        Usuario u09 = new Usuario("GARCÍAM9", "12451234", 1);
        Usuario u10 = new Usuario("ARANAG10", "72458238", 1);
        Usuario u11 = new Usuario("SÁNCHEZM0", "78154265", 2);        

        /* EMPLEADOS */
        Empleado e01 = new Empleado(0, "76413156", "Ernesto", "Rodríguez", "Campos", 50, "MASTER");
        Empleado e02 = new Empleado(1, "77414526", "Mario", "Castañeda", "Valencia", 30);
        Empleado e03 = new Empleado(2, "74484174", "Raúl", "Espinoza", "Barreto", 30);
        Empleado e04 = new Empleado(3, "14123456", "José", "Mauro", "Banderas", 29);
        Empleado e05 = new Empleado(4, "98456789", "Miguel", "Moreno", "Sánchez", 30);
        Empleado e06 = new Empleado(5, "78451245", "Rodrigo", "Jiménez", "Torres", 26);
        Empleado e07 = new Empleado(6, "45121214", "Mauricio", "Pinedo", "Fernández", 30);
        Empleado e08 = new Empleado(7, "76193457", "Francisco", "Moreno", "Banderas", 21);
        Empleado e09 = new Empleado(8, "12451234", "Marcos", "García", "Arana", 27);
        Empleado e10 = new Empleado(9, "72458238", "Gabriel", "Arana", "Ramírez", 19);
        
        /* ESTACIONES */
        //30Km/h 500 m/min
        Estacion estacion01 = new Estacion("Naranjal", "Norte", 0, 800, 800 / Sistema.velocidadProm);
        Estacion estacion02 = new Estacion("Izaguirre", "Norte", 1, 650, 650 / Sistema.velocidadProm);
        Estacion estacion03 = new Estacion("Pacifico", "Norte", 2, 450, 450 / Sistema.velocidadProm);
        Estacion estacion04 = new Estacion("Independencia", "Norte", 3, 400, 400 / Sistema.velocidadProm);
        Estacion estacion05 = new Estacion("Los Jazmines", "Norte", 4, 530, 530 / Sistema.velocidadProm);
        Estacion estacion06 = new Estacion("Tomás Valle", "Centro", 5, 580, 580 / Sistema.velocidadProm);
        Estacion estacion07 = new Estacion("El Milagro", "Centro", 6, 670, 670 / Sistema.velocidadProm);
        Estacion estacion08 = new Estacion("Honorio Delgado", "Centro", 7, 800, 800 / Sistema.velocidadProm);
        Estacion estacion09 = new Estacion("UNI", "Centro", 8, 800, 800 / Sistema.velocidadProm);
        Estacion estacion10 = new Estacion("Parque del Trabajo", "Sur", 9, 750, 750 / Sistema.velocidadProm);
        Estacion estacion11 = new Estacion("Caquetá", "Sur", 10, 950, 950 / Sistema.velocidadProm);
        Estacion estacion12 = new Estacion("Ramón Castilla", "Sur", 11, 550, 550 / Sistema.velocidadProm);
        Estacion estacion13 = new Estacion("Tacna", "Sur", 12, 550, 550 / Sistema.velocidadProm);
        Estacion estacion14 = new Estacion("Jirón de la Unión", "Sur", 13, 550, 550 / Sistema.velocidadProm);
        Estacion estacion15 = new Estacion("Colmena", "Sur", 14, 700, 700 / Sistema.velocidadProm);
        Estacion estacion16 = new Estacion("Dos de Mayo", "Sur", 15, 550, 550 / Sistema.velocidadProm);
        Estacion estacion17 = new Estacion("Quilca", "Sur", 16, 600, 600 / Sistema.velocidadProm);
        Estacion estacion18 = new Estacion("España", "Sur", 17, 500, 500 / Sistema.velocidadProm);
        Estacion estacion19 = new Estacion("Estacion Central", "Sur", 18, 1300, 1300 / Sistema.velocidadProm);
        Estacion estacion20 = new Estacion("Estadio Nacional", "Sur", 19, 920, 920 / Sistema.velocidadProm);
        Estacion estacion21 = new Estacion("México", "Sur", 20, 680, 680 / Sistema.velocidadProm);
        Estacion estacion22 = new Estacion("Canadá", "Sur", 21, 1000, 1000 / Sistema.velocidadProm);
        Estacion estacion23 = new Estacion("Javier Prado", "Sur", 22, 800, 800 / Sistema.velocidadProm);
        Estacion estacion24 = new Estacion("Carnaval Moreyra", "Sur", 23, 640, 640 / Sistema.velocidadProm);
        Estacion estacion25 = new Estacion("Aramburú", "Sur", 24, 700, 700 / Sistema.velocidadProm);
        Estacion estacion26 = new Estacion("Domingo Orué", "Sur", 25, 610, 610 / Sistema.velocidadProm);
        Estacion estacion27 = new Estacion("Angamos", "Sur", 26, 700, 700 / Sistema.velocidadProm);
        Estacion estacion28 = new Estacion("Ricardo Palma", "Sur", 27, 670, 670 / Sistema.velocidadProm);
        Estacion estacion29 = new Estacion("Benavides", "Sur", 28, 550, 550 / Sistema.velocidadProm);
        Estacion estacion30 = new Estacion("28 de Julio", "Sur", 29, 850, 850 / Sistema.velocidadProm);
        Estacion estacion31 = new Estacion("Plaza de Flores", "Sur", 30, 700, 700 / Sistema.velocidadProm);
        Estacion estacion32 = new Estacion("Balta", "Sur", 31, 850, 850 / Sistema.velocidadProm);
        Estacion estacion33 = new Estacion("Bulevar", "Sur", 32, 500, 500 / Sistema.velocidadProm);
        Estacion estacion34 = new Estacion("Estadio Unión", "Sur", 33, 750, 750 / Sistema.velocidadProm);
        Estacion estacion35 = new Estacion("Escuela Militar", "Sur", 34, 1000, 1000 / Sistema.velocidadProm);
        Estacion estacion36 = new Estacion("Terán", "Sur", 35, 600, 600 / Sistema.velocidadProm);
        Estacion estacion37 = new Estacion("Rosario de Villa", "Sur", 36, 900, 900 / Sistema.velocidadProm);
        Estacion estacion38 = new Estacion("Matellini", "Sur", 37, 0, 0);
        Estacion estacion39 = new Estacion("Estación virtual", "", 38);

        /* CLIENTES */
        Cliente cliente01 = new Cliente("78154265", "Miguel Abel", "Sánchez", "Martínez", 20);
        Tarjeta t = estacion01.getTaquilla().emitirTarjeta(EnumTipoTarjeta.ESCOlAR, 14525144);
        cliente01.insertarTarjeta(t);
        cliente01.setUsuario("SÁNCHEZM0");

        ArrayList<Usuario> tempUsuarios = new ArrayList();
        tempUsuarios.add(u01);
        tempUsuarios.add(u02);
        tempUsuarios.add(u03);
        tempUsuarios.add(u04);
        tempUsuarios.add(u05);
        tempUsuarios.add(u06);
        tempUsuarios.add(u07);
        tempUsuarios.add(u08);
        tempUsuarios.add(u09);
        tempUsuarios.add(u10);
        tempUsuarios.add(u11);

        ArbolGeneral tempEmpleados = new ArbolGeneral(e01);
        tempEmpleados.insertar(e02);
        tempEmpleados.insertar(e03);
        tempEmpleados.insertar(e04);
        tempEmpleados.insertar(e05);
        tempEmpleados.insertar(e06);
        tempEmpleados.insertar(e07);
        tempEmpleados.insertar(e08);
        tempEmpleados.insertar(e09);
        tempEmpleados.insertar(e10);
        
        ArrayList<Estacion> tempEstaciones = new ArrayList();
        tempEstaciones.add(estacion01);
        tempEstaciones.add(estacion02);
        tempEstaciones.add(estacion03);
        tempEstaciones.add(estacion04);
        tempEstaciones.add(estacion05);
        tempEstaciones.add(estacion06);
        tempEstaciones.add(estacion07);
        tempEstaciones.add(estacion08);
        tempEstaciones.add(estacion09);
        tempEstaciones.add(estacion10);
        tempEstaciones.add(estacion11);
        tempEstaciones.add(estacion12);
        tempEstaciones.add(estacion13);
        tempEstaciones.add(estacion14);
        tempEstaciones.add(estacion15);
        tempEstaciones.add(estacion16);
        tempEstaciones.add(estacion17);
        tempEstaciones.add(estacion18);
        tempEstaciones.add(estacion19);
        tempEstaciones.add(estacion20);
        tempEstaciones.add(estacion21);
        tempEstaciones.add(estacion22);
        tempEstaciones.add(estacion23);
        tempEstaciones.add(estacion24);
        tempEstaciones.add(estacion25);
        tempEstaciones.add(estacion26);
        tempEstaciones.add(estacion27);
        tempEstaciones.add(estacion28);
        tempEstaciones.add(estacion29);
        tempEstaciones.add(estacion30);
        tempEstaciones.add(estacion31);
        tempEstaciones.add(estacion32);
        tempEstaciones.add(estacion33);
        tempEstaciones.add(estacion34);
        tempEstaciones.add(estacion35);
        tempEstaciones.add(estacion36);
        tempEstaciones.add(estacion37);
        tempEstaciones.add(estacion38);
        tempEstaciones.add(estacion39);

        ListaClientes tempClientes = new ListaClientes();
        tempClientes.insertar(cliente01);

        // SERIALIZACIÓN
        SerializadoraGen.serializar(Sistema.FILE_ESTACIONES, tempEstaciones);
        SerializadoraGen.serializar(Sistema.FILE_USUARIOS, tempUsuarios);
        SerializadoraGen.serializarClientes(Sistema.FILE_CLIENTES, tempClientes);
        SerializadoraGen.serializarEmpleados(Sistema.FILE_EMPLEADOS, tempEmpleados);
        SerializadoraGen.serializar(Sistema.FILE_MOVIMIENTOSTARJETA, Sistema.movimientosTarjeta.getMovimientos());
        SerializadoraGen.serializar(Sistema.FILE_MOVIMIENTOSVIAJE, Sistema.movimientosViaje.getMovimientos());
        SerializadoraGen.serializarMensajesClientes(Sistema.FILE_COLAMENSAJES, Sistema.mensajesClientes);

    }
}
