package entidades;

import java.io.Serializable;

public class Taquilla implements Serializable {

    private double montoRecaudadoRecargas;
    private double montoRecaudadoViajes;
    private int nRecargas;
    private int nViajes;
    private int nTarjetasEmitidas;

    public Taquilla() {
        this.montoRecaudadoRecargas = 0;
        this.montoRecaudadoViajes = 0;
        this.nRecargas = 0;
        this.nViajes = 0;
        this.nTarjetasEmitidas = 0;
    }

    public Tarjeta emitirTarjeta(EnumTipoTarjeta tipo, int codigo) {
        Tarjeta t = new Tarjeta(codigo, tipo);
        this.nTarjetasEmitidas++;
        return t;
    }

    public void recargar(double monto) {
        this.montoRecaudadoRecargas += monto;
        this.nRecargas++;
    }

    public void viajarBus(double monto) {
        this.montoRecaudadoViajes += monto;
        this.nViajes++;
    }

    public double getMontoRecaudadoRecargas() {
        return montoRecaudadoRecargas;
    }

    public double getMontoRecaudadoViajes() {
        return montoRecaudadoViajes;
    }

    public int getnRecargas() {
        return nRecargas;
    }

    public int getnViajes() {
        return nViajes;
    }

    public int getnTarjetasEmitidas() {
        return nTarjetasEmitidas;
    }

}
