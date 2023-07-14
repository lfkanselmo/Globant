/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese frase: ");
        String sentence = (read.nextLine()).toLowerCase();
        
        if (sentence.equals("eureka")){
            System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
        }
    }
    
}
