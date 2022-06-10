package entidades;

import java.io.Serializable;
import java.util.Date;

public class MovimientoViaje implements Serializable {

    private int idTarjeta;
    private Date horaInicio;//Hora de inicio del viaje
    private String estacionInicial;
    private Date horaFin;//Hora de finalización del viaje
    private String estacionFinal;
    private boolean estado;//El movimiento aún no termina, porque falta la estación final y la hora final
    private String tipoBus;

    public MovimientoViaje(int idTarjeta, String estacionInicial, String tipoBus) {
        this.idTarjeta = idTarjeta;
        this.horaInicio = new Date();
        this.estacionInicial = estacionInicial;
        this.tipoBus = tipoBus;
        this.estado = true;
        this.horaFin = null;
        this.estacionFinal = null;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public String getEstacionInicial() {
        return estacionInicial;
    }

    public String getEstacionFinal() {
        return estacionFinal;
    }

    public void setEstacionFinal(String estacionFinal) {
        this.estacionFinal = estacionFinal;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin() {
        this.horaFin = new Date();
    }

    public void finalizarViaje(Cliente c, String estacionFinal) {
        this.setHoraFin();
        this.setEstacionFinal(estacionFinal);
        this.setEstado(false);//Termina el movimiento viaje
        c.setMovViaje(false); //El cliente termina su viaje
    }

}
