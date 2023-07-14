/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1;

/**
 *
 * @author Krausser
 */
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese número a sumar: ");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        
        System.out.println("Suma igual a: " + (num1+num2));
    }    
}
