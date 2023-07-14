/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package ejercicioextra22;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra22 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese dimensión de la matriz");
        int n = read.nextInt();
        int m = read.nextInt();
        int[][] matrix = new int[n][m];
        
        fillMatrix(matrix);
    }
    
    public static void fillMatrix(int[][] matrix){
        int sum = 0;
        
        //rrellenar y mostrar la matriz
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j] = (int)(Math.random()*10);
                sum += matrix[i][j];
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println("");
        }
        
        System.out.println("Suma total: " + sum);
    }
    
}
