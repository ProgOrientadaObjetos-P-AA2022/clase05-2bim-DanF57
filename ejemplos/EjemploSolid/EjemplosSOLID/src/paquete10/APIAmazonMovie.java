/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;


public class APIAmazonMovie implements APIMovie{
    
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = String.format("%s909090", ak);
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
