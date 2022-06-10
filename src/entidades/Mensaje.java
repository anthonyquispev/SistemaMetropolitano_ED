package entidades;

import java.io.Serializable;
import java.util.Date;

public class Mensaje implements Serializable {

    private String emisor;
    private String receptor;
    private String asunto;
    private String textoEmisor;
    private String textoReceptor;
    private Date fechaEnviada;
    private Date fechaRecibida;
    private boolean bRespondido; //Determina si el mensaje ha sido respondido o no

    public Mensaje(String emisor, String asunto, String textoEmisor) {
        this.emisor = emisor;
        this.asunto = asunto;
        this.textoEmisor = textoEmisor;
        this.fechaEnviada = new Date();
        this.bRespondido = false;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getTextoEmisor() {
        return textoEmisor;
    }

    public Date getFechaEnviada() {
        return fechaEnviada;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public void setTextoReceptor(String textoReceptor) {
        this.textoReceptor = textoReceptor;
    }

    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }

    public void setbRespondido(boolean bRespondido) {
        this.bRespondido = bRespondido;
    }

    public String getTextoReceptor() {
        return textoReceptor;
    }

}
