/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {

        Persona p1 = new Persona("Daniel ",19);
        Persona p2 = new Persona("Eduardo ",20);
        Persona p3 = new Persona("Valeska ",21);
        Persona p4 = new Persona("Estefania ",22);
        
        ArrayList<Persona> lista = new ArrayList <>();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        OperacionesEstudiantes op = new OperacionesEstudiantes();
        op.establecerEstudiante(lista);
        op.establecerPromedioEdades();
        
        System.out.println(op);
        
    }
}
