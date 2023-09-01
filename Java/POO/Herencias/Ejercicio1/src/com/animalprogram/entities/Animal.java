/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.animalprogram.entities;

/**
 *
 * @author Krausser
 */
public class Animal {
    protected String name;
    protected String food;
    protected Integer age;
    protected String breed;

    public Animal(String name, String food, Integer age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }    
    
    public void alimentarse(){
        System.out.println("La mascota come: " + food);
    }
    
}
