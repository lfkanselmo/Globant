/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)..
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese los grados C a convertir: ");
        float celsius = read.nextFloat();
        float fahrenheit = converter(celsius);
        
        System.out.println(celsius + " grados Celsius, equivalen a " + fahrenheit + " grados Fahrenheit");
    }
    
    //Función para convertir grados celsius a fahrenheit
    public static float converter(float degrees){
        degrees = 32 + (9*(degrees/5));
        
        return degrees;
    }
    
}
