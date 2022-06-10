package entidades;

import java.io.Serializable;
import java.util.Date;
import sistema.Sistema;

public class Tarjeta implements Serializable {

    private int idTarjeta; //Código de tarjeta
    private double saldo;
    private Date fechaEmision;
    private EnumTipoTarjeta tipo;

    public Tarjeta(int idTarjeta, EnumTipoTarjeta tipo) {
        this.idTarjeta = idTarjeta;
        this.tipo = tipo;
        this.fechaEmision = new Date();
        this.saldo = 0;
    }

    public MovimientoTarjeta recargarTarjeta(double monto, Estacion estacion) {
        MovimientoTarjeta mov = null;
        if (monto > 0) {
            estacion.getTaquilla().recargar(monto);
            this.incrementarSaldo(monto);
            mov = new MovimientoTarjeta(idTarjeta, estacion.getNombre(), monto);
        }
        return mov;
    }

    private void incrementarSaldo(double monto) {
        double nuevoSaldo = this.saldo + monto;
        this.saldo = nuevoSaldo;
    }

    public MovimientoViaje viajar(Estacion estacion, String tipoBus) {
        MovimientoViaje mov = null;
        double porcentaje = this.tipo.getPorcentaje();
        double monto = Sistema.pagoBus * porcentaje;
        //Verifica si la tarjeta tiene suficiente saldo para realizar el viaaje
        if (this.saldo >= monto) {
            estacion.getTaquilla().viajarBus(monto);
            Cliente c = Sistema.clientes.obtenerClienteIdTarjeta(this.idTarjeta);
            c.setMovViaje(true);//El cliente ahora está en un viaje
            this.pagarViaje(monto);
            mov = new MovimientoViaje(idTarjeta, estacion.getNombre(), tipoBus);
        }
        return mov;
    }

    public void pagarViaje(double monto) {
        double nuevoSaldo = this.getSaldo() - monto;
        this.saldo = nuevoSaldo;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public EnumTipoTarjeta getTipo() {
        return tipo;
    }

}
