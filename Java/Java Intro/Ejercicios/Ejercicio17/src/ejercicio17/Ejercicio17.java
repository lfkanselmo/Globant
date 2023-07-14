/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de valores del vector: ");
        int n = read.nextInt();
        System.out.println("");
        int[] vector = new int[n];
        fill(vector);
        show(vector);
        System.out.println("");
        int[] vectorCounter = counter(vector);
        showVC(vectorCounter);
    }
    
    //Procedimiento para rellenar el vector
    public static void fill(int[] vector){
        for (int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*(99999-1+1)+1);
        }
    }
    
    //Función para contar los números
    public static int[] counter(int[] vector){
        int[] vectorCounter = new int[5];
        
        //inicializar el vector de contadores
        for(int k=0; k<vectorCounter.length; k++){
            vectorCounter[k] = 0;
        }
        
        //Comprobar los valores del vector
        for (int i=0; i<vector.length; i++){
            if (vector[i]<=99999 && vector[i]>=10000){
                vectorCounter[4] = vectorCounter[4] + 1;
            } else if(vector[i]<=9999 && vector[i]>=1000){
                vectorCounter[3] = vectorCounter[3] + 1;
            } else if(vector[i]<=999 && vector[i]>=100){
                vectorCounter[2] = vectorCounter[2] + 1;
            } else if(vector[i]<=99 && vector[i]>=10){
                vectorCounter[1] = vectorCounter[1] + 1;
            } else if(vector[i]<=9 && vector[i]>=1){
                vectorCounter[0] = vectorCounter[0] + 1;
            }
        }
        System.out.println(vectorCounter[4]);
        return vectorCounter;
    }
    
        //Procedimiento para mostar el vector
    public static void show(int[] vector){
        for (int i=0; i<vector.length; i++){
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }
    
        //Procedimiento para mostar el vector de los contadores
    public static void showVC(int[] vector){
        System.out.println(vector.length);
        for (int i=0; i<vector.length; i++){
            
            //imprimir según la cantidad de digitos
            switch(i){
                case 0:
                    System.out.println("Valores de 1 digito: " + vector[0]);
                    System.out.println("");
                    break;
                    
                case 1:
                    System.out.println("Valores de 2 digitos: " + vector[1]);
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("Valores de 3 digitos: " + vector[2]);
                    System.out.println("");
                    break;
                    
                case 3:
                    System.out.println("Valores de 4 digitos: " + vector[3]);
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("Valores de 5 digitos: " + vector[4]);
                    System.out.println("");
                    break;
                    
                default:
                    
            }
        }
        System.out.println("");
    }
    
}
