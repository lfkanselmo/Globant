/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package ejercicioextra18;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del vector");
        int n = read.nextInt();
        System.out.println("");
        int sum = 0;
        
        int[] vector = new int[n];
        
        //Solicitar valor al usuario y sumarlo con valores de vector
        System.out.println("Ingrese valor");
        int num = read.nextInt();
        
        //rellenar el vector con valores ingresados por el usuario
        for (int i=0; i<n; i++){            
            vector[i] = (int)(Math.random()*10);
            vector[i] = vector[i] + num;
        }
          
        show(vector);     
    }
    
    
    //Proceso para mostrar valores del vector
    public static void show(int[] vector){
        for (int i=0; i<vector.length; i++){
            System.out.print("[" + vector[i] + "] ");
        }
    }
    
}
