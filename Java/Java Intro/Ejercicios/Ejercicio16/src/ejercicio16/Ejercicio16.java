/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el total de números a ingresar: ");
        int n = read.nextInt();
        System.out.println("");
        
        int[] vector = new int[n];
        fill(vector);
        System.out.println("Ingrese el número a ingresar en el vector: ");
        int num = read.nextInt();
        System.out.println("");
        show(vector);
        System.out.println("");
        System.out.println("El número " + num + " se repite: " + checkNum(vector, num) + " veces.");
        System.out.println("");
    }
    
    //Procedimiento para rellenar el vector
    public static void fill(int[] vector){
        for (int i=0; i<vector.length-1; i++){
            vector[i] = (int)(Math.random()*10);
        }
    }
    
    //Procedimiento para mostar el vector
    public static void show(int[] vector){
        for (int i=0; i<vector.length-1; i++){
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }
    
    //Función para comparar y contar los números dentro del vector
    public static int checkNum(int[] vector, int num){
        int counter = 0;
        for (int i=0; i<vector.length-1; i++){
            if(vector[i] == num){
                counter++;
            }
        }
        
        return counter;
    }
}
