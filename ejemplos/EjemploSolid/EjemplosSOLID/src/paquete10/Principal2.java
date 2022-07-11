/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Principal2 {

    public static void main(String[] args) {
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp1 = new GeneradorPeliculas();
        gp1.establecerLlave(api);
        gp1.establecerUrl("http://api.movie?api=");


        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");        

        APIDirectvGo api3 = new APIDirectvGo();
        api3.establecerApiKey("123455");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");

        APIStarPlus api4 = new APIStarPlus();
        api4.establecerApiKey("123455");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        
        ArrayList<GeneradorPeliculas> gps = new ArrayList<>();
        
        gps.add(gp1);
        gps.add(gp2);
        gps.add(gp3);
        gps.add(gp4);
        
        ArchivoEscritura archivopeli
                            = new ArchivoEscritura("datos/peliculas.dat");
                    archivopeli.establecerPeliculas(gps);
                    archivopeli.establecerSalida();
    }
}
