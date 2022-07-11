/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma += e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }

    @Override
    public String toString() {
        String cadena = "------------Listado De Estudiantes--------\n";
        for (int i = 0; i < estudiantes.size(); i++) {
            cadena = String.format("%sEstudiante: %s\n", cadena,
                    obtenerEstudiante().get(i).obtenerNombre());
        }
        cadena = String.format("%sPromedio de edades de los estudiantes es: %s\n"
                ,cadena,
                obtenerPromedioEdades());
        return cadena;
    }
    
}
