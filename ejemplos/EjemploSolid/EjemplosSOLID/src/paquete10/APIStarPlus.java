/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author Daniel
 */
public class APIStarPlus implements APIMovie{
    
    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        apiKey = String.format("%s593593", ak);
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

}
    
