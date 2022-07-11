/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ArchivoLectura {

    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> peliculas;
    private String nombreArchivo;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } catch (IOException ioException) {
                System.out.println("Error al abrir el archivo" + ioException);
            }
        }
    }

    public void establecerCasa() {
        peliculas = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    GeneradorPeliculas registro = (GeneradorPeliculas)
                            entrada.readObject();
                    peliculas.add(registro);
                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.out.println("Error al leer el archivo");
                } catch (ClassNotFoundException ex) {
                    System.out.println("No se pudo crear el objeto" + ex);
                }
            }
        }

    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public ArrayList<GeneradorPeliculas> obtenerCasas() {
        return peliculas;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Peliculas\n";
        for (int i = 0; i < peliculas.size(); i++) {
            //Casa ca = casas.get(i);
            cadena = String.format("%sPeliculas:\n"
                    + "%s\n",
                    cadena,
                    peliculas.get(i).obtenerUrl());
        }
        return cadena;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        }
    }

}
