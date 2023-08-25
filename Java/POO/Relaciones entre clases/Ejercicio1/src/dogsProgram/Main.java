/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package dogsProgram;

import dogsProgram.entities.Dog;
import dogsProgram.entities.Person;

/**
 *
 * @author Krausser
 */
public class Main {
    public static void main(String[] args) {
        Person per1 = new Person("Juan", "Rivera", 30, "98745632");
        Person per2 = new Person("Luisa", "Medina", 27, "25369851");
        Dog dog1 = new Dog("Lupe", "Chihuahua", 3, 100.3);
        Dog dog2 = new Dog("Canela", "Pastor Aleman", 5, 120.7);
        
        per1.setDog(dog1);
        per2.setDog(dog2);
        
        System.out.println(per1.toString());
        System.out.println();
        System.out.println(per2.toString());
    }
    
}
