/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appliances.entities;

/**
 *
 * @author Krausser
 */
public class WashingMachine extends Appliance{
    private Double load;

    public WashingMachine() {
    }

    public WashingMachine(Double load) {
        this.load = load;
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }
    
    //Metodo crear lavadora
    public void createWashing(){
        createAppliances();
        System.out.println("Ingrese la carga");
        setLoad(read.nextDouble());
    }
    
    //Metodo precio final 
    public void finalPrice(){
        super.finalPrice();
        if (getLoad() > 30d) {
            setPrice(getPrice() + 500d);
        }
        
    }
    
    
}
