/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente. 
 */
package ejercicioextra9;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el divisor: ");
        int divider = read.nextInt();
        System.out.println("");
        System.out.println("Ingrese el dividendo: ");
        int dividend = read.nextInt();
        boolean stop = false;
        int quotient = 0;
        int resi = dividend;
        
        do{
            if(resi < divider){
                stop = true;
                break;
            } else{
                resi = resi - divider;
                quotient++;
            }
        } while(stop == false);
        
        System.out.println(dividend + " / " + divider + " = " + quotient + " ----> Residuo = " + resi);
    }
    
}
