/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje.
 */
package ejercicioextra3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] vocals = {"a","e","i","o","u"};
        System.out.println("Ingrese letra: ");
        String letter = read.nextLine().toLowerCase();
        
        //Buscar un valor dentro de un vector
        if (Arrays.asList(vocals).contains(letter)){
            System.out.println("Vocal");
        } else{
            System.out.println("No es una vocal");
        }
    }
    
}
