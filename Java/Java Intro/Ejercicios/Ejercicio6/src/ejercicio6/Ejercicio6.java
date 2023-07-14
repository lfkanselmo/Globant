/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        int number = read.nextInt();
        
        if (number % 2 == 0){
            System.out.println("El número es par");
        } else{
            System.out.println("El número es impar");
        }
    }
    
}
