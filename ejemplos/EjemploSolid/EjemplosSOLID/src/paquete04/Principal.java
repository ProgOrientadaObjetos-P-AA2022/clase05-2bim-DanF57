/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {

        ArrayList<Transporte> transporte = new ArrayList<>();

        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();

        TransporteTransvia transvia = new TransporteTransvia();
        transvia.establecerCooperativaTransvia("Cariamanga");
        transvia.establecerTarifa();

        transporte.add(bus);
        transporte.add(taxi);
        transporte.add(transvia);

        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(transporte);
        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de Tarifas: %.2f",
                tipos.obtenerPromedioTarifas());

    }
}
