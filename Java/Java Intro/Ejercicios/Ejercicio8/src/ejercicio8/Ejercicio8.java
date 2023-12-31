/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
 * usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
 * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.  
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese frase: ");
        String sentence = read.nextLine();
        
        if (sentence.length() == 8){
            System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
        }
    }
    
}
