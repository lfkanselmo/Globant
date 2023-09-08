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
public final class Television extends Appliance{
    private Integer resolution;
    private boolean tdtSint;
    
    public Television(){
        
    }
    
    public Television(Double price, String color, String pConsumption, Double weight, Integer resolution, boolean tdt){
        super(price, color, pConsumption, weight);
        this.resolution = resolution;
        this.tdtSint = tdt;        
    }

    public Integer getResolution() {
        return resolution;
    }

    public void setResolution(Integer resolution) {
        this.resolution = resolution;
    }

    public boolean isTdtSint() {
        return tdtSint;
    }

    public void setTdtSint(boolean tdtSint) {
        this.tdtSint = tdtSint;
    }

    @Override
    public String toString() {
        return "TV: [ Color: " + this.getColor() 
                + ", Consumo: " + this.getpConsumption()
                + ", Peso: " + this.getWeight()
                + ", Resolución: " + this.getResolution()
                + ", ¿Tiene TDT?: " + this.isTdtSint()
                + ", Precio: " + this.getPrice()
                + " ]";
    }
    
    
    
    
    
    public void createTv(){
        createAppliances();
        Integer aux;
        System.out.println("Ingrese la resolución de la pantalla");
        aux = super.read.nextInt();        
        setResolution(aux);
        
        boolean res;
        System.out.println("¿Tiene TDT?  S");
        String opc = super.read.next();
        if (opc.equalsIgnoreCase("s")) {
            res = true;
        } else {
            res = false;
        }
        
        setTdtSint(res);
    }

    @Override
    public void finalPrice() {
        super.finalPrice(); 
        Double priNew = getPrice();
        if (getResolution()>40) {
            setPrice(priNew + (priNew * 0.3) );
            
            if (isTdtSint()) {
                priNew += 500;
            }
        }
        setPrice(priNew);
    }
    
    
    
    
    
}
