package librerias;

import colecciones.ArbolGeneral;
import colecciones.ColaMensajes;
import colecciones.ListaClientes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializadoraGen {

    public static void serializar(String nombreArchivo, ArrayList array) {
        try {
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(file);
            escritor.writeObject(array);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList deserializar(String nombreArchivo) {
        ArrayList retorno = new ArrayList();
        try {
            FileInputStream file = new FileInputStream(nombreArchivo);
            ObjectInputStream lector = new ObjectInputStream(file);
            retorno = (ArrayList) lector.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return retorno;
    }

    public static void serializarClientes(String nombreArchivo, ListaClientes tempClientes) {
        try {
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(file);
            escritor.writeObject(tempClientes);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ListaClientes deserializarClientes(String nombreArchivo) {
        ListaClientes retorno = new ListaClientes();
        try {
            FileInputStream file = new FileInputStream(nombreArchivo);
            ObjectInputStream lector = new ObjectInputStream(file);
            retorno = (ListaClientes) lector.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return retorno;
    }

    public static void serializarMensajesClientes(String nombreArchivo, ColaMensajes colaMensajes) {
        try {
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(file);
            escritor.writeObject(colaMensajes);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ColaMensajes deserializarMensajesClientes(String nombreArchivo) {
        ColaMensajes retorno = new ColaMensajes();
        try {
            FileInputStream file = new FileInputStream(nombreArchivo);
            ObjectInputStream lector = new ObjectInputStream(file);
            retorno = (ColaMensajes) lector.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return retorno;
    }

    public static void serializarEmpleados(String nombreArchivo, ArbolGeneral tempEmpleados) {
        try {
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(file);
            escritor.writeObject(tempEmpleados);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArbolGeneral deserializarEmpleados(String nombreArchivo) {
        ArbolGeneral retorno;
        try {
            FileInputStream file = new FileInputStream(nombreArchivo);
            ObjectInputStream lector = new ObjectInputStream(file);
            retorno = (ArbolGeneral) lector.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return retorno;
    }

}
