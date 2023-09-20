/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.herencia.figuras.main;

import com.co.herencia.figuras.entities.Circulo;
import com.co.herencia.figuras.entities.Cuadrado;

/**
 *
 * @author Krausser
 */
public class Main {

    public static void main(String[] args) {
        Circulo cir = new Circulo();
        Cuadrado cua = new Cuadrado();
        
        System.out.println("El perimetro del circulo es: " + cir.perimetro());
        System.out.println("El area del circulo es: " + cir.area());
        System.out.println("-------------------------------------------------------");
        System.out.println("El perimetro del cuadrado es: " + cua.perimetro());
        System.out.println("El area del cuadrado es: " + cua.area());
    }

}
