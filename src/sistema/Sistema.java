package sistema;

import colecciones.ListaClientes;
import entidades.*;
import colecciones.*;

public class Sistema {

    public static ArregloUsuarios usuarios = new ArregloUsuarios();
    public static ListaClientes clientes = new ListaClientes();
    public static ArbolGeneral empleados = new ArbolGeneral();
    public static ArregloEstacion estaciones = new ArregloEstacion();
    
    public static Estacion estacionActual;
    public static Usuario usuarioActual;
    public static Cliente clienteActual;
    public static Empleado empleadoActual;
    public static Tarjeta tarjetaActual;
    public static MovimientoViaje movimientoViajeActual;
    public static Mensaje mensajeActual;
    
    public static ArregloMovimientosTarjeta movimientosTarjeta = new ArregloMovimientosTarjeta();
    public static ArregloMovimientoViaje movimientosViaje = new ArregloMovimientoViaje();
    public static ArregloBus buses = new ArregloBus();
    public static Rutas rutas = new Rutas();
    
    public static ColaMensajes mensajesClientes = new ColaMensajes();
    
    // 9 minutos  Tiempo promedio entre dos estaciones contiguas
    public static double velocidadProm = 350; //21 km/h  ->  350 m/min
    // Pago general para ingresar a un bus
    public static double pagoBus = 2.0;
    
    public static final String FILE_CLIENTES = "clientes.txt";
    public static final String FILE_EMPLEADOS = "empleados.txt";
    public static final String FILE_USUARIOS = "usuarios.txt";
    public static final String FILE_ESTACIONES = "estaciones.txt";
    public static final String FILE_MOVIMIENTOSTARJETA = "movimientosTarjeta.txt";
    public static final String FILE_MOVIMIENTOSVIAJE = "movimientosViaje.txt";
    public static final String FILE_COLAMENSAJES = "colaMensajes.txt";
    
}
