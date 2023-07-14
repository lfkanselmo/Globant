/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general
 */
package ejercicioextra6;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int n = read.nextInt();
        float counter = 0;
        float sum = 0;
        System.out.println("");
        
        //Ingreso de estaturas
        for (int i=0; i<n; i++){
            System.out.println("ingrese estatura en metros: ");
            float high = read.nextFloat();
            
            //Comprobar si la altura es menor a 1.60
            if (high<1.60) {
                sum = sum + high;
                counter++;
            }
        }
        
        //Sacar promedio
        System.out.println("El promedio de las estaturas menores a 1.60 mts es: " + (sum/counter) + " mts");
    }
    
}
