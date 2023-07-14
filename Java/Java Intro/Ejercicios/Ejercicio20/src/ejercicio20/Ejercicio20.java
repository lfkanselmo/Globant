/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        int n = 3;
        int[][] matriz = new int[n][n];
        
        fill(matriz);
        show(matriz);
        int[] vectorSum = addition(matriz);
        
        //Verificar si es mágica o no la matriz
        if(check(vectorSum)){
            System.out.println("");
            System.out.println("La matriz es mágica");
        } else{
            System.out.println("");
            System.out.println("Nada mágico aquí");
        }
    }
    
    //Proceso para rellenar la matriz
    public static void fill(int[][] matriz){
        Scanner read = new Scanner(System.in);
        boolean pass = false;
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                //Ingreso de número
                do{
                    System.out.println("Ingrese: ");
                    matriz[i][j] = read.nextInt();
                    
                    //comprobar si los valores ingresados son correctos
                    if (matriz[i][j]<1 || matriz[i][j]>9){
                        System.out.println("No válido, ingrese de nuevo");
                        System.out.println("");
                        pass = false;
                    } else {
                        pass = true;
                    }
                }while(pass == false);
            }
        }
        
    }
    
    //Procedimiento para imprimir la matriz
    public static void show(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }
    
    //Función para sumar filas y columnas y guardarlos en un vector
    public static int[] addition(int[][] matriz){
        int size = (matriz.length*2)+2;
        int[] vector = new int[size];
        int n = matriz.length;
        
        //Inicializar vector
        for (int l=0; l<vector.length; l++){
            vector[l] = 0;
        }
        
        //rellenar el vector con la suma de las filas, columnas y diagonales
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if (i==j){
                   vector[size-2] = vector[size-2] + matriz[i][j];
                   vector[size-1] = vector[size-1] + matriz[i][(n-1)-i];
                }
                vector[i] = vector[i] + matriz[i][j];
                vector[n+i] = vector[n+i] + matriz[j][i];
            }
        }
        
        return vector;
    }
    
    //Proceso para verificar si las sumas son iguales todas
    public static boolean check(int[] vector){
        boolean result = true;
        int f = vector[0];
        for(int i=1; i<vector.length; i++){
            if (vector[i]!=f){
                result = false;
                break;
            }
        }
        
        return result;
    }
    
}
