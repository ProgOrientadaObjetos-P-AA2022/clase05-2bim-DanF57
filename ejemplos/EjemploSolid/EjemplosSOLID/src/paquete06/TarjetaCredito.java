package paquete06;

public class TarjetaCredito {
    
    private String nombre;
    private String codigo;
    private double cupoMaximo;

    public TarjetaCredito(String nom, String cod, double cupo){
        establecerNombre(nom);
        establecerCodigo(cod);
        establecerCupoMaximo(cupo);
    }

    public void establecerNombre(String n){
        nombre = n;
    }

    public void establecerCodigo(String c){
        codigo = c;
    }

    public void establecerCupoMaximo(double c){
        cupoMaximo = c;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerCodigo(){
        return codigo;
    }

    public double obtenerCupoMaximo(){
        return cupoMaximo;
    }
}
