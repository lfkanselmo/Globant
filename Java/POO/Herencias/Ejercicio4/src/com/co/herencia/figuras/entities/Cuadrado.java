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
public class Cuadrado implements CalculosFormas{
    
    Scanner read = new Scanner(System.in);

    @Override
    public double perimetro() {
        Double[] datos = pedirBaseAltura();
        
        return ((datos[0]*2) + (datos[1] * 2) );
    }

    @Override
    public double area() {
        Double[] datos = pedirBaseAltura();
        
        return datos[0] * datos[1];
    }
    
    private Double[] pedirBaseAltura(){
        Double[] cuadra = new Double[2];
        
        System.out.println("Ingrese la altura del cuadrado");
        double altura = read.nextDouble();
        System.out.println("Ingrese la base del cuadrado");
        double base = read.nextDouble();
        
        cuadra[0] = altura;
        cuadra[1] = base;
        
        return cuadra;
        
    }
    
}
