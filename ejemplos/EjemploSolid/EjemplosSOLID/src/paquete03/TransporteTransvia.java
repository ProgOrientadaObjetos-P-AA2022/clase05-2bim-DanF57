package paquete03;

public class TransporteTransvia {

    private String CoperativaTransvia;
    private double tarifa;

    public void establecerCooperativaTranvia(String c) {
        CoperativaTransvia = c;
    }

    public void establecerTarifa() {
        tarifa = 1.40 + 0.40;
    }

    public String obtenerCooperativaTranvia() {
        return CoperativaTransvia;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
