/*

Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 

 */
package main;

import java.util.Scanner;
import services.DogService;

/**
 *
 * @author Krausser
 */
public class Main {
    
    static Scanner read = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        DogService breeds = new DogService();
        
        breeds.startProgram();
        
        breeds.showAll();
        System.out.println("Escriba la raza que desea eliminar: ");
        breeds.deletBreed(read.nextLine());
        
        breeds.showAll();
    }
    
}
