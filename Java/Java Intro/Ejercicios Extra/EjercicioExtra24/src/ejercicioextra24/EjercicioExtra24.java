/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci.
 */
package ejercicioextra24;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de valores de la serie: ");
        int n = read.nextInt();
        
        int[] vectorFibo = new int[n];
        
        //rellenar el vector con la serie de Fibonacci
        for(int i=0; i<n; i++){
            vectorFibo[i] = fibonacci(i);
        }
        
        show(vectorFibo);
    }
    
    //Proceso para mostrar el vector
    public static void show(int[] vector){
        System.out.println("Serie de Fibonacci con " + vector.length + " valores...");
        for (int i=0; i<vector.length; i++){
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }
    
    //función para rellenar realizar la serie de Fibonacci
    public static int fibonacci(int n){
        if (n<2){
            return 1;
        } else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
}
