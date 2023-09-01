/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.animalprogram.main;

import com.animalprogram.entities.Animal;
import com.animalprogram.entities.Cat;
import com.animalprogram.entities.Dog;
import com.animalprogram.entities.Horse;

/**
 *
 * @author Krausser
 */
public class AnimalProgram {
    public static void main(String[] args){
        Animal dog1 = new Dog("Stich", "meat", 6, "Bulldog");
        dog1.alimentarse();
        Animal dog2 = new Dog("Teddy", "chiken", 8, "Chihuahua");
        dog2.alimentarse();
        Animal cat1 = new Cat("Pelusa", "cookies", 3, "Bombai");
        cat1.alimentarse();
        Animal cat2 = new Cat("Spark", "fish", 5, "Siamés");
        cat2.alimentarse();
        Animal horse1 = new Horse("Canela", "weed", 4, "Fino");
        horse1.alimentarse();
    }
}
