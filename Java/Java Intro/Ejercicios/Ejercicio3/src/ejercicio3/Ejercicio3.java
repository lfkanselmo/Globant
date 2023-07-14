/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 * en minúsculas.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Igrese frase: ");
        String sentence = read.nextLine();
        System.out.println("");
        System.out.println(sentence.toLowerCase());
        System.out.println("");
        System.out.println(sentence.toUpperCase());
        
    }
    
}
