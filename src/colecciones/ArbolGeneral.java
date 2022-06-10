package colecciones;

import Nodos.NodoArbol;
import entidades.Empleado;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class ArbolGeneral implements Serializable {

    public NodoArbol raiz;
    private int idEmpleado;
    private int longitud;

    public ArbolGeneral() {
    }

    public ArbolGeneral(Empleado e) {
        raiz = new NodoArbol(e);
        idEmpleado = 1;
        longitud = 1;
    }

    public int idEm() {
        return (idEmpleado++);
    }

    public void insertar(Empleado hijo) {
        NodoArbol[] p = new NodoArbol[1];
        Buscar(raiz, p, hijo.getIdCargoJefe());
        if (p[0] != null) {
            NodoArbol x = new NodoArbol(hijo);
            if (p[0].hijo == null) {
                p[0].hijo = x;
            } else {
                p[0] = p[0].hijo;
                //x se insertará como hermano del último hijo insertado en el padre
                while (p[0].hermano != null) {
                    p[0] = p[0].hermano;
                }
                p[0].hermano = x;
            }
            hijo.setUsuario(generarNombreUsuario(hijo));
            longitud++;
        }
    }

    public void Buscar(NodoArbol padre, NodoArbol[] puntero, int idCargoJefe) {
        if (padre != null) {
            if (padre.empleado.getIdCargo() == idCargoJefe) {
                puntero[0] = padre;
            }
            Buscar(padre.hijo, puntero, idCargoJefe);
            Buscar(padre.hermano, puntero, idCargoJefe);
        }
    }

    public void buscarDni(NodoArbol padre, boolean[] b, String dni) {
        if (padre != null) {
            if (dni.equals(padre.empleado.getDni())) {
                b[0] = true;
            }
            buscarDni(padre.hijo, b, dni);
            buscarDni(padre.hermano, b, dni);
        }
    }

    public boolean estaVacia() {
        return raiz == null;
    }

    public String generarNombreUsuario(Empleado e) {
        String username = "";
        username += e.getApellidoPaterno();
        username += e.getNombres().substring(0, 1);
        username += idEmpleado;
        idEmpleado++;
        return username;
    }

    public void preOrden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.println(nodo.empleado.getNombreCargo() + " ");
            NodoArbol tempNodo = nodo.hijo;
            while (tempNodo != null) {
                preOrden(tempNodo);
                tempNodo = tempNodo.hermano;
            }
        }
    }

    //Recorrido en anchura con saltos de línea
    public void recorridoNiveles(NodoArbol nodo) {
        Queue<NodoArbol> cola = new LinkedList<>();
        cola.add(nodo);//encolar
        NodoArbol temp1, temp2;
        int nivelAnterior, nivelActual = 0;

        while (!cola.isEmpty()) {
            nivelAnterior = nivelActual;
            temp1 = cola.poll();//desencolar
            nivelActual = temp1.empleado.getNivel();
            //Imprimir datos
            if (nivelAnterior == nivelActual) {
                System.out.print(" - " + temp1.empleado.getNombreCargo());
            } else {
                if (nivelActual != 1) {
                    System.out.print("\n" + temp1.empleado.getNombreCargo());
                } else {
                    //Para la raiz
                    System.out.print(temp1.empleado.getNombreCargo());
                }
            }
            temp2 = temp1.hijo;
            if (temp2 != null) {
                cola.add(temp2);
                while (temp2.hermano != null) {
                    cola.add(temp2.hermano);
                    temp2 = temp2.hermano;
                }
            }
        }
    }

    public void getDatos(NodoArbol nodo, Vector v) {
        Queue<NodoArbol> cola = new LinkedList<>();
        cola.add(nodo);
        NodoArbol temp1, temp2;
        while (!cola.isEmpty()) {
            temp1 = cola.poll();
            v.add(temp1.empleado);
            temp2 = temp1.hijo;
            if (temp2 != null) {
                cola.add(temp2);
                while (temp2.hermano != null) {
                    cola.add(temp2.hermano);
                    temp2 = temp2.hermano;
                }
            }
        }
    }

    public String mostrarElementos(NodoArbol nodo, String dni) {
        NodoArbol[] p = new NodoArbol[1];
        String s = "";
        obtenerNodoDni(raiz, p, dni);
        Queue<NodoArbol> cola = new LinkedList<>();
        cola.add(p[0]);
        NodoArbol temp1, temp2;
        int nivelAnterior, nivelActual = 0;
        String str;
        while (!cola.isEmpty()) {
            nivelAnterior = nivelActual;
            temp1 = cola.poll();
            nivelActual = temp1.empleado.getNivel();
            str = temp1.empleado.getNombresYCargo();
            if (nivelAnterior == nivelActual) {
                s += " - " + str;
            } else {
                if (nivelActual != 1) {
                    s += "\n" + str;
                } else {
                    s += str;
                }
            }
            temp2 = temp1.hijo;
            if (temp2 != null) {
                cola.add(temp2);
                while (temp2.hermano != null) {
                    cola.add(temp2.hermano);
                    temp2 = temp2.hermano;
                }
            }
        }
        return s;
    }

    //Obtener un nodo a partir de un DNI
    public void obtenerNodoDni(NodoArbol padre, NodoArbol[] p, String dni) {
        if (padre != null) {
            if (dni.equals(padre.empleado.getDni())) {
                p[0] = padre;
            }
            obtenerNodoDni(padre.hijo, p, dni);
            obtenerNodoDni(padre.hermano, p, dni);
        }
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getLongitud() {
        return longitud;
    }

}
