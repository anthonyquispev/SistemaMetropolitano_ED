
package colecciones;

import entidades.Bus;
import java.util.ArrayList;

public class ArregloBus {
    
    private ArrayList<Bus> buses;

    public ArregloBus() {
        this.buses = new ArrayList();
    }

    public boolean agregar(Bus bus) {
        return this.buses.add(bus);
    }
    
    public String[] getTiposBus() {
        String[] s = new String[this.buses.size()];
        int i = 0;
        for (Bus bus : this.buses) {
            s[i] = bus.getTipoBus();
            i++;
        }
        return s;
    }
    
    public String getTipoBus(int idBus) {
        String nombre = null;
        for (Bus bus : buses) {
            if (idBus == bus.getIdBus()) {
                return bus.getTipoBus();
            }
        }
        return nombre;
    }
}
