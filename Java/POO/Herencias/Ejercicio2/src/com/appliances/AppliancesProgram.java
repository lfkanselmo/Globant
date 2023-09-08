/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appliances;

import com.appliances.entities.Appliance;
import com.appliances.entities.Television;
import com.appliances.entities.WashingMachine;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class AppliancesProgram {

    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<Appliance> appliances = new ArrayList<Appliance>(); 
        
        Appliance lavadora1 = new WashingMachine(1000d, "negro", "a", 79d, 40d);
        Appliance lavadora2 = new WashingMachine(1000.50d, "rojo", "e", 56d, 23d);
        Appliance tv1 = new Television(1000.30d, "negro", "a", 15d, 45, true);
        Appliance tv2 = new Television(1000.23d, "azul", "b", 18d, 52, false);
        
        appliances.add(lavadora1);
        appliances.add(lavadora2);
        appliances.add(tv1);
        appliances.add(tv2);
        
        Double sum = 0d;
        for (Appliance appliance : appliances) {
            appliance.finalPrice();
            sum += appliance.getPrice();
            System.out.println(appliance.toString());
        }
        
        System.out.println("Precio de todos los electrodomesticos: " + sum);
    }
   
}
