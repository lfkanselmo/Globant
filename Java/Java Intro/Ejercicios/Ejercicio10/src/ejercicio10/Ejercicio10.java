/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 * números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int limitNum, sum = 0, askedNum;
        
        do{
            System.out.println("Ingrese el número limite, debe ser positivo: ");
            limitNum = read.nextInt();
        }while (limitNum<1);
        
        do{
            System.out.println("Ingrese: ");
            askedNum = read.nextInt();
            sum = sum + askedNum;
        }while(sum<=limitNum);
        
        System.out.println("Suma final: " + sum);
    }
    
}
