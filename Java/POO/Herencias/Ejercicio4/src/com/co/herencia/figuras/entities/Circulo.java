/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.herencia.figuras.entities;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Circulo implements CalculosFormas{
    
    Scanner read = new Scanner(System.in);

    @Override
    public double perimetro() {
        Double r = pedirRadio();
        
        return pi * (r + r);
    }

    @Override
    public double area() {
        Double r = pedirRadio();
        
        return pi * r * r;
    }
    
    private Double pedirRadio(){
        System.out.println("Ingrese el radio del circulo");
        Double r = read.nextDouble();
        
        return r;
    }
    
}
