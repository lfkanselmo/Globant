/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boat_rental.models;

/**
 *
 * @author Krausser
 */
public class LuxuryYacht extends Sailboat{
    private Integer cabins;

    public LuxuryYacht(Integer cabins, Integer masts, Double cv, String registration, Integer eslora, Integer yearFabric) {
        super(masts, cv, registration, eslora, yearFabric);
        this.cabins = cabins;
    }

    
    
}
