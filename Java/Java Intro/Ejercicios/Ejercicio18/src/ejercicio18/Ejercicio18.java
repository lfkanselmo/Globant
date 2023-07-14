/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package ejercicio18;

/**
 *
 * @author Krausser
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        int n = 4;
        int matriz[][] = new int[n][n];
        
        fill(matriz);
        System.out.println("Matriz original:");
        show(matriz);
        System.out.println("");
        System.out.println("Matriz Transpuesta: ");
        showTransposed(matriz);
    }
    
    //Rellenar la matriz
    public static void fill(int[][] matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[0].length; j++){
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
    }
    
    //Proceso para mostrar la matriz transpuesta
    public static void show(int[][] matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println("");
        }
    }
    
    //Proceso para mostrar la matriz transpuesta
    public static void showTransposed(int[][] matriz){
        for (int j=0; j<matriz.length; j++){
            for (int i=0; i<matriz[0].length; i++){
                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println("");
        }
    }
    
}
