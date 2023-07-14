/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese número entero: ");
        int num = read.nextInt();
        
        operate(num);
    }
    
    //Procedimiento para operar y mostrar el doble, el triple y la raiz
    public static void operate(int number){
        int forTwo = number * 2;
        int forThree = number * 3;
        float root = (float) Math.sqrt(number);
        
        System.out.println("El doble: " + forTwo);
        System.out.println("El triple: " + forThree);
        System.out.println("La raiz cuadrada: " + root);
    }
    
}
