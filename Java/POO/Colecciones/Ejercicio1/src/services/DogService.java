/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Dog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class DogService {

    private static List<String> dogsBreed = new ArrayList<String>();
    private Dog dog = new Dog();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    //Metodo menú para agregar perros
    public void startProgram() {
        System.out.println("***** BIENVENIDO *****");

        boolean exit = false;
        boolean valid = true;
        String answer;
        do {

            if (valid) {
                addDog();
            }

            System.out.println();
            System.out.println("¿Desea ingresar una raza de perro? S/N");
            answer = read.next().toUpperCase();
            read.skip("\n");

            switch (answer) {
                case "S":
                    exit = false;
                    valid = true;
                    break;
                case "N":
                    showAll();
                    System.out.println();
                    System.out.println("***** FIN PROGRAMA *****");
                    System.out.println();
                    exit = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Opción ingresada no válida");
                    System.out.println();
                    exit = false;
                    valid = false;
                    break;
            }

        } while (exit == false);

    }

    //Metodo para agregar razas
    public void addDog() {
        System.out.println();
        System.out.println("ingrese raza: ");
        dog.setBreed(read.nextLine().toLowerCase());

        dogsBreed.add(dog.getBreed());
    }

    //Metodo para mostrar los perros
    public void showAll() {
        System.out.println();
        System.out.println("Razas guardadas: ");
        for (String dog : dogsBreed) {
            System.out.println(dog);
        }
        System.out.println();
    }

    //Metodo para eliminar raza
    public void deletBreed(String breed) {

        boolean exist = false;
        Iterator<String> it = dogsBreed.iterator();
        do {

            while (it.hasNext()) {
                if (it.next().equals(breed)) {
                    it.remove();
                    exist = true;
                }

            }

            if (exist) {
                System.out.println(breed + " Eliminada");
            } else {
                System.out.println(breed + " No existe dentro de la lista. "
                        + "Intente ingresarlo de nuevo");

                breed = read.nextLine();
            }
        } while (exist == false);
    }
}
