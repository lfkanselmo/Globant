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
public final class WashingMachine extends Appliance{
    private Double load;

    public WashingMachine() {
    }

    public WashingMachine(Double price, String color, String pConsumption, Double weight, Double load) {
        super(price, color, pConsumption, weight);
        this.load = load;
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Lavadora: [ Color: " + this.getColor() 
                + ", Consumo: " + this.getpConsumption()
                + ", Peso: " + this.getWeight()
                + ", Carga: " + this.getLoad()
                + ", Precio: " + this.getPrice()
                + " ]";
    }
    
    
    
    //Metodo crear lavadora
    public void createWashing(){
        System.out.println("Ingrese la carga");
        setLoad(read.nextDouble());
    }
    
    //Metodo precio final 
    public void finalPrice(){
        super.finalPrice();
        System.out.println(getPrice());
        if (getLoad() > 30d) {
            setPrice(getPrice() + 500d);
        }
        System.out.println(getPrice());
    }
    
    
}
