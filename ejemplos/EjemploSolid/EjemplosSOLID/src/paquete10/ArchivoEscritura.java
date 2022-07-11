/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ArchivoEscritura {
    
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> peliculas;
    
    public ArchivoEscritura(String n) {
        nombreArchivo = n;
        establecerPeliculas(peliculas);
        
        try {
            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            if (peliculas.size() > 0) {
                for (int i = 0; i < peliculas.size(); i++) {
                    establecerRegistro(peliculas.get(i));
                    establecerSalida();
                }
            }
            
        } catch (IOException IOexception) {
            System.out.println("Error al abrir el archivo");
        }
    }
    
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }
    
    public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo");
        }
    }
    
    public void establecerRegistro(GeneradorPeliculas n) {
        registro = n;
    }
    
    public void establecerPeliculas(ArrayList<GeneradorPeliculas> p) {
        peliculas = p;
        ArchivoLectura lec = new ArchivoLectura(nombreArchivo);
        lec.establecerCasa();
        peliculas = lec.obtenerCasas();
    }
    
     public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    public ObjectOutputStream obtenerSalida() {
        return salida;
    }
    
    public ArrayList<GeneradorPeliculas> obtenerCasas() {
        return peliculas;
    }
    
    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        } 
    } 
    
}