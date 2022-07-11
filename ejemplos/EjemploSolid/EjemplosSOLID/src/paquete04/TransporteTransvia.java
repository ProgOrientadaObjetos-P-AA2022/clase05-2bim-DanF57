package paquete04;

public class TransporteTransvia extends Transporte {

    private String cooperativaTransvia;

    public void establecerCooperativaTransvia(String n) {
        cooperativaTransvia = n;
    }

    public String obtenerCooperativaTrasvia() {
        return cooperativaTransvia;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 3.00 * 2.00;
    }
}
