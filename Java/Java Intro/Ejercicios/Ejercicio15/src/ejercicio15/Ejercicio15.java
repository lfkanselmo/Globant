/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejercicio15;

/**
 *
 * @author Krausser
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        int n = 100;
        int[] vector = new int[n];
        
        //rellenar el vector con los primeros 100 números
        for (int i=0; i<n; i++){
            vector[i] = i+1;
        }
        
        //imprimir los valores del vector en forma descendente
        for (int j=(n-1); j>=0; j--){
            System.out.println(vector[j]);
        }
    }
    
}
