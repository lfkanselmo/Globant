/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
 * diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese frase: ");
        String sentence = read.nextLine();
        
        //comprobar si la primera letra es 'A'
        if (sentence.substring(0,1).equals("A")){
            System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
        }
    }
    
}
