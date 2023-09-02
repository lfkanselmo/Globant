/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appliances.entities;

import com.appliances.enums.Color;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Appliance {

    private Double price;
    private Color color;
    private char pConsumption;
    private Double weight;
    protected final Scanner read = new Scanner(System.in);

    public Appliance() {
    }

    public Appliance(Double price, String color, String pConsumption, Double weight) {
        this.price = price;
        this.color = checkColor(color);
        this.pConsumption = checkPowerConsumption(pConsumption.toUpperCase());
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(String color) {
        this.color = checkColor(color);
    }

    public char getpConsumption() {
        return pConsumption;
    }

    public void setpConsumption(String pConsumption) {
        this.pConsumption = checkPowerConsumption(pConsumption.toUpperCase());
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //Metodo para comprobar el consumo electrico
    private char checkPowerConsumption(String l) {
        char letter = 70;    // F
        char aux = l.charAt(0);

        if (aux >= 65 && aux <= 70) {   // A to F
            letter = aux;
        }
        return letter;
    }

    //Metodo para comprobar el color
    private Color checkColor(String color) {
        Color colorSelect;

        switch (color) {
            case "blanco":
                colorSelect = Color.BLANCO;
                break;

            case "negro":
                colorSelect = Color.NEGRO;
                break;

            case "rojo":
                colorSelect = Color.ROJO;
                break;

            case "azul":
                colorSelect = Color.AZUL;
                break;

            case "gris":
                colorSelect = Color.GRIS;
                break;

            default:
                colorSelect = Color.BLANCO;
                break;
        }

        return colorSelect;
    }

    //Metodo para validar el ingreso de números
    protected Double checkNumbers() {
        Double number = 0d;

        do {
            try {
                number = read.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ingrese solamente números");
                number = 0d;
            }
        } while (number == 0d);

        return number;
    }

    //Metodo para crear un electrodomestico
    public void createAppliances() {
        setPrice(1000d);
        System.out.println("Ingrese el color del electrodomestico");
        setColor(read.next());
        System.out.println("Ingrese el peso del electrodomestico");
        setWeight(checkNumbers());
        System.out.println("Ingrese el consumo energetico del electrodomestico");
        setpConsumption(read.next());
        System.out.println();
    }

    //Metodo para el precio final
    public void finalPrice() {
        Double aux = getPrice();

        switch (getpConsumption()) {
            case 'A':
                aux += 1000d;
                break;
            case 'B':
                aux += 800d;
                break;
            case 'C':
                aux += 600d;
                break;
            case 'D':
                aux += 500d;
                break;
            case 'E':
                aux += 300d;
                break;
            case 'F':
                aux += 100d;
                break;
        }
        
        Double pes = getWeight();
        if (pes>=1d && pes <= 19d) {
            aux += 100d;
        } else if(pes>=20d && pes <= 49d){
            aux += 500d;
        } else if(pes>=50d && pes <= 79d){
            aux += 800d;
        } else{
            aux += 1000d;
        }
        
        setPrice(aux);
    }
}
