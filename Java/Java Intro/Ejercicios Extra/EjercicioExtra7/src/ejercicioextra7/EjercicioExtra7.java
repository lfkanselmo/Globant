/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario.
 */
package ejercicioextra7;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        //Pedir la cantidad de números
        System.out.println("Ingrese cantidad de números");
        int n = read.nextInt();
        int[] vector = new int[n];
        
        //rellenar el vector
        fill(vector,n);
        
        //mostrar el vector
        show(vector);
        
        int k = 1;
        int sum = vector[0];
        int max = vector[0];
        int min = vector[0];
                
        do{
            //evaluar el mínimo y el máximo
            if (vector[k]<min){
                min = vector[k];
            } else if (vector[k]>max){
                max = vector[k];
            }
            
           sum = sum + vector[k];
           
           k++;
            
        }while(k < n); 
        
        //Calcular el promedio
        float average = sum / n;
        
        System.out.println("");
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + average);
    }
    
    //proceso para rellenar el vector
    public static void fill(int[] vector, int n){
        for (int i=0; i<n; i++){
            vector[i] = (int)(Math.random()*100);
        }
    }
    
    //proceso para mostrar el vector
    public static void show(int[] vector){
        for (int i=0; i<vector.length; i++){
            System.out.print("[" + vector[i] + "] ");
        }
    }
    
}
