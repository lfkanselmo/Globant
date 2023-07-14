/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ejercicio21;

/**
 *
 * @author Krausser
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        int n = 3, m = 10;
        int[][] matrizM = new int[m][m];
        int[][] matrizP = new int[n][n];
        
        //Rellenar y mostrar la matriz M
        fill(matrizM);
        System.out.println("La matriz M");
        System.out.println("");
        show(matrizM);
        
        //Rellenar y mostrar la matriz P
        fill(matrizP);
        System.out.println("La matriz P");
        System.out.println("");
        show(matrizP);
        
        //Almacenar vector con las coordenadas que me devuelve la comprobación
        int[] result = searchMatriz(matrizM,matrizP);
        
        if (result[0]==(-1)){
            System.out.println("No se encontró coincidencia");
        } else{
            System.out.println("Coincidencia encontrada en las coordenadas: [" + (result[0]+1) + ", " + (result[1]+1) + "]");
        }
       
    }
    
    //Procedimiento para rellenar la matriz
    public static void fill(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] = (int)(Math.random()*(2-1+1)+1);
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
    
    //Función para buscar la matriz P dentro de la matriz M
    public static int[] searchMatriz(int[][] matrixM, int[][] matrizP) {
        int rows = matrixM.length;
        int cols = matrixM[0].length;
        int pRows = matrizP.length;
        int pCols = matrizP[0].length;
        
        for (int i = 0; i <= rows - pRows; i++) {
            for (int j = 0; j <= cols - pCols; j++) {
                boolean found = true;
                
                outerLoop:
                for (int k = 0; k < pRows; k++) {
                    for (int l = 0; l < pCols; l++) {
                        
                        //comprobar posiciones en las matrices y si son diferentes termina el ciclo interno
                        if (matrixM[i + k][j + l] != matrizP[k][l]) {
                            found = false;
                            break outerLoop;
                        }
                    }
                }
                
                //si todas las comparaciones coinciden retorna vector con las coordenadas
                if (found) {
                    return new int[] {i,j};
                }
            }
        }
        
        return new int[] {-1,-1};
    }
    
}
