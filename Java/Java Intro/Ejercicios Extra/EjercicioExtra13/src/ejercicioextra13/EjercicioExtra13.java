/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar.
 */
package ejercicioextra13;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la escalera: ");
        int n = read.nextInt();
        System.out.println("");
        System.out.println("");
        
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
