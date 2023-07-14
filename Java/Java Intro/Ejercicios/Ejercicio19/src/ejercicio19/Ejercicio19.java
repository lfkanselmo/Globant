/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        
        
        int n = 3;
        int[][] matriz = new int[n][n];
        
        fill(matriz);
        show(matriz);
        int[][] matrizTransp = transpose(matriz);
        show(matrizTransp);
        
        if (check(matriz,matrizTransp) == true){
            System.out.println("La matriz es  anti simétrica");
        } else {
            System.out.println("La matriz NO es anti simétrica");
        }
    }
    
    //Procedimiento para rellenar la matriz
    public static void fill(int[][] matriz){
        Scanner read = new Scanner(System.in);
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] = read.nextInt();
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
    
    //Función para transponer matrices
    public static int[][] transpose(int[][] matriz){
        int[][] finalMatriz = new int[matriz.length][matriz.length];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                finalMatriz[j][i] = matriz[i][j];
            }
        }
        
        return finalMatriz;
    }
    
    //función para comprobar si la matriz es anti simétrica
    public static boolean check(int[][] matriz, int [][] matrizT){
        boolean simetric = true;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if (matriz[i][j] != (matrizT[i][j])*(-1)){
                    simetric = false;
                    break;
                } else{
                    simetric = true;
                }
            }
        }
        
        return simetric;
    }
    
}
