/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TarjetaCredito visa = new TarjetaCredito("Visa", "441", 20);
        
        MayorEdad representante = new MayorEdad("José", visa);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                //menor.obtenerRepresentante().obtenerTarjeta()
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombre());
        
    }
}
