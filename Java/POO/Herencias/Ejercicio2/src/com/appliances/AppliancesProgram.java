/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appliances;

import com.appliances.entities.WashingMachine;

/**
 *
 * @author Krausser
 */
public class AppliancesProgram {
    public static void main(String[] args){
        WashingMachine lavadora = new WashingMachine();
        
        lavadora.createWashing();
        lavadora.finalPrice();
        System.out.println(lavadora.getColor());
        System.out.println(lavadora.getPrice());
    }
}
