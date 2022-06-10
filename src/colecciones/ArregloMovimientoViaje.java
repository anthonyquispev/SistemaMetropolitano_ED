package colecciones;

import entidades.Cliente;
import entidades.MovimientoViaje;
import java.io.Serializable;
import java.util.ArrayList;
import otros.ConvertirDate_a_String;
import sistema.Sistema;

public class ArregloMovimientoViaje implements Serializable{

    private ArrayList<MovimientoViaje> movimientos;

    public ArregloMovimientoViaje() {
        this.movimientos = new ArrayList<>();
    }

    public ArrayList<MovimientoViaje> getMovimientos() {
        return movimientos;
    }

    public boolean agregar(MovimientoViaje mov) {
        return this.movimientos.add(mov);
    }

    public void setMovimientos(ArrayList<MovimientoViaje> movimientos) {
        this.movimientos = movimientos;
    }

    //Viajes que se han realizado con un determinado idTarjeta
    public String[][] getDatosIdTarjeta(int idTarjeta) {
        int n = this.nMovimientosIdTarjeta(idTarjeta);
        String[][] s = new String[n][3];
        int i = 0;
        for (MovimientoViaje mov : movimientos) {
            if (idTarjeta == mov.getIdTarjeta() && mov.isEstado() == false) {
                s[i][0] = ConvertirDate_a_String.convertirFecha(mov.getHoraInicio());
                s[i][1] = mov.getEstacionInicial();
                s[i][2] = mov.getEstacionFinal();
                i++;
            }
        }
        return s;
    }

    private int nMovimientosIdTarjeta(int idTarjeta) {
        int n = 0;
        for (MovimientoViaje mov : movimientos) {
            if (idTarjeta == mov.getIdTarjeta() && mov.isEstado() == false) {
                n++;
            }
        }
        return n;
    }

    //Clientes que están actualmente en un viaje
    public String[][] getDatosFinalizarViaje() {
        int n = 0;
        for (MovimientoViaje movimiento : this.movimientos) {
            if (movimiento.isEstado() == true) {
                n++;
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (MovimientoViaje mov : this.movimientos) {
                if (mov.isEstado() == true) {
                    Cliente c = Sistema.clientes.obtenerClienteIdTarjeta(mov.getIdTarjeta());
                    s[i][0] = c.getDni();
                    s[i][1] = c.getNombres() + " " + c.getApellidoPaterno() + " " + c.getApellidoMaterno();
                    s[i][2] = String.valueOf(mov.getIdTarjeta());
                    s[i][3] = mov.getTipoBus();
                    s[i][4] = mov.getEstacionInicial();
                    s[i][5] = String.valueOf(mov.getHoraInicio());
                    i++;
                }
            }
        }
        return s;
    }

    public String[][] getDatosViajesCompletados() {
        int n = 0;
        for (MovimientoViaje movimiento : this.movimientos) {
            if (movimiento.isEstado() == false) {
                n++;
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][8];
            int i = 0;
            for (MovimientoViaje mov : this.movimientos) {
                if (mov.isEstado() == false) {
                    Cliente c = Sistema.clientes.obtenerClienteIdTarjeta(mov.getIdTarjeta());
                    s[i][0] = c.getDni();
                    s[i][1] = c.getNombres() + " " + c.getApellidoPaterno() + " " + c.getApellidoMaterno();
                    s[i][2] = String.valueOf(mov.getIdTarjeta());
                    s[i][3] = mov.getTipoBus();
                    s[i][4] = mov.getEstacionInicial();
                    s[i][5] = ConvertirDate_a_String.convertirFecha(mov.getHoraInicio());
                    s[i][6] = mov.getEstacionFinal();
                    s[i][7] = ConvertirDate_a_String.convertirFecha(mov.getHoraFin());
                    i++;
                }
            }
        }
        return s;
    }

    public MovimientoViaje obtenerMovimientoViajeHoraInicio(int idTarjeta, String horaInicio) {
        String hInicio;
        for (MovimientoViaje mov : movimientos) {
            hInicio = String.valueOf(mov.getHoraInicio());
            if ((idTarjeta == mov.getIdTarjeta()) && (hInicio.equals(horaInicio))) {
                return mov;
            }
        }
        return null;
    }

    //Movimientos viaje que se realizaron de una estación a otra
    public String[][] getDatosViajesEstaciones(String estInicial, String estFinal) {
        int n = this.nViajesEstaciones(estInicial, estFinal);
        String[][] s = new String[n][5];
        int i = 0;
        for (MovimientoViaje mov : this.movimientos) {
            if (mov.isEstado() == false && mov.getEstacionInicial().equals(estInicial)
                    && mov.getEstacionFinal().equals(estFinal)) {
                Cliente c = Sistema.clientes.obtenerClienteIdTarjeta(mov.getIdTarjeta());
                s[i][0] = c.getNombres() + " " + c.getApellidoPaterno() + " " + c.getApellidoMaterno();//Nombres
                s[i][1] = String.valueOf(mov.getIdTarjeta());//Código de tarjeta
                s[i][2] = ConvertirDate_a_String.convertirFecha(mov.getHoraInicio());//Hora inicio
                s[i][3] = ConvertirDate_a_String.convertirFecha(mov.getHoraFin());//Hora fin
                s[i][4] = mov.getTipoBus();//Tipo bus
                i++;
            }
        }
        return s;
    }

    private int nViajesEstaciones(String estInicial, String estFinal) {
        int n = 0;
        for (MovimientoViaje mov : movimientos) {
            if (mov.isEstado() == false && mov.getEstacionInicial().equals(estInicial)
                    && mov.getEstacionFinal().equals(estFinal)) {
                n++;
            }
        }
        return n;
    }
}
