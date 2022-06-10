package colecciones;

import entidades.*;
import java.io.Serializable;
import java.util.ArrayList;
import otros.ConvertirDate_a_String;
import sistema.Sistema;

public class ArregloMovimientosTarjeta implements Serializable{

    private ArrayList<MovimientoTarjeta> movimientos;

    public ArregloMovimientosTarjeta() {
        this.movimientos = new ArrayList<>();
    }

    public boolean agregar(MovimientoTarjeta mov) {
        return this.movimientos.add(mov);
    }

    public ArrayList<MovimientoTarjeta> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<MovimientoTarjeta> movimientos) {
        this.movimientos = movimientos;
    }

    //Recargas de una determinada tarjeta
    public String[][] getDatosRecargasTarjeta(int idTarjeta) {
        int n = this.nMovimientosTarjeta(idTarjeta);
        String[][] s = new String[n][4];
        int i = 0;
        for (MovimientoTarjeta mov : this.movimientos) {
            if (idTarjeta == mov.getIdTarjeta()) {
                s[i][0] = mov.getEstacion();
                s[i][1] = ConvertirDate_a_String.convertirFecha(mov.getFecha());
                s[i][2] = String.valueOf(mov.getMonto());
                i++;
            }
        }
        return s;
    }

    private int nMovimientosTarjeta(int idTarjeta) {
        int n = 0;
        for (MovimientoTarjeta movimiento : this.movimientos) {
            if (idTarjeta == movimiento.getIdTarjeta()) {
                n++;
            }
        }
        return n;
    }

    //Recargas en una determinada estación
    public String[][] getDatosRecargasEstacion(String estacion) {
        int n = this.nMovimientosEstacion(estacion);
        String[][] s = new String[n][4];
        int i = 0;
        for (MovimientoTarjeta mov : this.movimientos) {
            if (estacion.equals(mov.getEstacion())) {
                Cliente c = Sistema.clientes.obtenerClienteIdTarjeta(mov.getIdTarjeta());
                s[i][0] = c.getNombres() + " " + c.getApellidoPaterno() + " " + c.getApellidoMaterno(); //Nombres
                s[i][1] = String.valueOf(mov.getIdTarjeta()); //Código de tarjeta
                s[i][2] = ConvertirDate_a_String.convertirFecha(mov.getFecha()); //Fecha
                s[i][3] = String.valueOf(mov.getMonto()); //Monto
                i++;
            }
        }
        return s;
    }

    private int nMovimientosEstacion(String estacion) {
        int n = 0;
        for (MovimientoTarjeta mov : movimientos) {
            if (estacion.equals(mov.getEstacion())) {
                n++;
            }
        }
        return n;
    }
}
