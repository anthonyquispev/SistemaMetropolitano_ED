package entidades;

public class Bus {

    private String tipoBus;
    private int idBus;

    public Bus(String tipoBus, int idBus) {
        this.tipoBus = tipoBus;
        this.idBus = idBus;
    }

    public int getIdBus() {
        return idBus;
    }

    public String getTipoBus() {
        return tipoBus;
    }

}
