package colecciones;

import Nodos.NodoCliente;
import entidades.Cliente;
import java.io.Serializable;

public class ListaClientes implements Serializable {

    public NodoCliente cabeza;
    private int idCliente;
    private int longitud;

    public ListaClientes() {
        this.cabeza = null;
        this.idCliente = 1;
        this.longitud = 0;
    }

    //Pretend // insertarPrincipio
    public void insertar(Cliente cliente) {
        NodoCliente nodo = new NodoCliente(cliente);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public Cliente obtener(int n) {
        if (cabeza == null) {
            return null;
        } else {
            NodoCliente puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != n) { //Si el while se ha detenido por la 2da condición
                return null;
            } else {
                return puntero.cliente;
            }
        }
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void mostrarElementos() {
        NodoCliente tempNodo = cabeza;
        while (tempNodo != null) {
            System.out.println(tempNodo.cliente.toString());
            tempNodo = tempNodo.siguiente;
        }
    }

    public int validarCodigo() {
        NodoCliente temp;
        boolean band;
        int codigo = 0;
        do {
            band = true;
            codigo = (int) (Math.random() * 100000000);
            if (this.longitud > 0) {
                temp = cabeza;
                while (temp != null) {
                    if (temp.cliente.isTarjeta(codigo)) {
                        band = false;
                        break;
                    } else {
                        temp = temp.siguiente;
                    }
                }
            } else {
                return codigo;
            }
        } while (band == false);
        return codigo;
    }

    public boolean buscarDni(String dni) {
        if (!estaVacia()) {
            NodoCliente temp = cabeza;
            while (temp != null) {
                if (temp.cliente.getDni().equals(dni)) {
                    return true;
                }
                temp = temp.siguiente;
            }
        }
        return false;
    }

    //Obtener un cliente a partir de su nombre de usuario
    public Cliente obtenerClienteUsername(String username) {
        if (!estaVacia()) {
            NodoCliente temp = cabeza;
            while (temp != null) {
                if (temp.cliente.getUsuario().equals(username)) {
                    return temp.cliente;
                }
                temp = temp.siguiente;
            }
            return null;
        }
        return null;
    }

    //Obtener un cliente a partir de su dni
    public Cliente obtenerClienteDni(String dni) {
        if (cabeza != null) {
            NodoCliente temp = cabeza;
            while (temp != null) {
                if (temp.cliente.getDni().equals(dni)) {
                    return temp.cliente;
                }
                temp = temp.siguiente;
            }
        }
        return null;
    }

    //Muestra a todos los clientes sin ninguna restricción
    public String[][] getDatos() {
        if (cabeza != null) {
            String s[][] = new String[this.longitud][4];
            int i = 0;
            NodoCliente temp = cabeza;
            while (temp != null) {
                s[i][0] = temp.cliente.getNombres();
                s[i][1] = temp.cliente.getApellidoPaterno();
                s[i][2] = temp.cliente.getApellidoMaterno();
                s[i][3] = temp.cliente.getDni();
                i++;
                temp = temp.siguiente;
            }
            return s;
        }
        return null;
    }

    //Clientes que no están viajando
    public String[][] getDatosNoViaje() {
        if (cabeza != null) {
            String s[][] = new String[nClientesDisponibles()][4];
            int i = 0;
            NodoCliente temp = cabeza;
            while (temp != null) {
                if (temp.cliente.isMovViaje() == false) {
                    s[i][0] = temp.cliente.getNombres();
                    s[i][1] = temp.cliente.getApellidoPaterno();
                    s[i][2] = temp.cliente.getApellidoMaterno();
                    s[i][3] = temp.cliente.getDni();
                    i++;
                }
                temp = temp.siguiente;
            }
            return s;
        }
        return null;
    }

    //Cantidad de clientes disponibles para viajar
    private int nClientesDisponibles() {
        int n = 0;
        if (!estaVacia()) {
            NodoCliente temp = cabeza;
            while (temp != null) {
                if (temp.cliente.isMovViaje() == false) {
                    n++;
                }
                temp = temp.siguiente;
            }
        }
        return n;
    }

    //Búsqueda por nombres
    public String[][] getDatosNombres(String nombres) {
        int n = nDatosNombres(nombres), i = 0;
        if (n > 0) {
            String[][] s = new String[n][4];
            Cliente c;
            NodoCliente temp = cabeza;
            while (temp != null) {
                c = temp.cliente;
                if (c.getNombres().contains(nombres)
                        || c.getApellidoPaterno().contains(nombres)
                        || c.getApellidoMaterno().contains(nombres)) {
                    s[i][0] = c.getNombres();
                    s[i][1] = c.getApellidoPaterno();
                    s[i][2] = c.getApellidoMaterno();
                    s[i][3] = c.getDni();
                    i++;
                }
                temp = temp.siguiente;
            }
            return s;
        }
        return null;
    }

    private int nDatosNombres(String nombre) {
        int n = 0;
        if (!estaVacia()) {
            Cliente c;
            NodoCliente temp = cabeza;
            while (temp != null) {
                c = temp.cliente;
                if (c.getNombres().contains(nombre)
                        || c.getApellidoPaterno().contains(nombre)
                        || c.getApellidoMaterno().contains(nombre)) {
                    n++;
                }
                temp = temp.siguiente;
            }
        }
        return n;
    }

    //Búsqueda por nombres y que los clientes no estén viajando
    public String[][] getDatosNombresNoViaje(String nombres) {
        int n = nDatosNombresNoViaje(nombres), i = 0;
        if (n > 0) {
            String[][] s = new String[n][4];
            Cliente c;
            NodoCliente temp = cabeza;
            while (temp != null) {
                c = temp.cliente;
                if (c.isMovViaje() == false && (c.getNombres().contains(nombres)
                        || c.getApellidoPaterno().contains(nombres)
                        || c.getApellidoMaterno().contains(nombres))) {
                    s[i][0] = c.getNombres();
                    s[i][1] = c.getApellidoPaterno();
                    s[i][2] = c.getApellidoMaterno();
                    s[i][3] = c.getDni();
                    i++;
                }
                temp = temp.siguiente;
            }
            return s;
        }
        return null;
    }

    private int nDatosNombresNoViaje(String nombre) {
        int n = 0;
        if (!estaVacia()) {
            Cliente c;
            NodoCliente temp = cabeza;
            while (temp != null) {
                c = temp.cliente;
                if (c.isMovViaje() == false && (c.getNombres().contains(nombre)
                        || c.getApellidoPaterno().contains(nombre)
                        || c.getApellidoMaterno().contains(nombre))) {
                    n++;
                }
                temp = temp.siguiente;
            }
        }
        return n;
    }

    //Obtener un cliente a partir de un código de tarjeta
    public Cliente obtenerClienteIdTarjeta(int idTarjeta) {
        if (!estaVacia()) {
            NodoCliente temp = cabeza;
            while (temp != null) {
                if (temp.cliente.isTarjeta(idTarjeta)) {
                    return temp.cliente;
                }
                temp = temp.siguiente;
            }
        }
        return null;
    }

    public boolean eliminarCliente(Cliente cliente) {
        if (!estaVacia()) {
            NodoCliente auxBorrar = cabeza, auxAnterior = null;
            while ((auxBorrar != null) && (auxBorrar.cliente != cliente)) {
                auxAnterior = auxBorrar;
                auxBorrar = auxBorrar.siguiente;
            }
            if (auxBorrar == null) {
                //El elemento no ha sido encontrado
                return false;
            } else if (auxAnterior == null) {
                //Se debe eliminar el primer nodo
                cabeza = cabeza.siguiente;
                return true;
            } else {
                //El elemento está en la lista, pero no es el primero
                auxAnterior.siguiente = auxBorrar.siguiente;
                return true;
            }
        }
        return false;
    }

    public int getLongitud() {
        return longitud;
    }

    public String generarNombreUsuario(Cliente c) {
        String username = "";
        username += c.getApellidoPaterno();
        username += c.getNombres().substring(0, 1);
        username += idCliente;
        idCliente++;
        return username;
    }    
    
}
