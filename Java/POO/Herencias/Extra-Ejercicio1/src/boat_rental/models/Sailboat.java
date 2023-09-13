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
public class Sailboat extends Boat{
    private Integer masts;
    private Double cv;

    public Sailboat(Integer masts, Double cv, String registration, Integer eslora, Integer yearFabric) {
        super(registration, eslora, yearFabric);
        this.masts = masts;
        this.cv = cv;
    }
    
    
}
