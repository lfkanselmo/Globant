/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división.
 */
package ejercicioextra11;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        int num = read.nextInt();
        int result = num;
        int counter = 0;
        boolean end = false;
        
        do{
            if (result==0){
                end = true;
                break;
            } else{
                result = result / 10;
                counter++;
            }
        }while(end == false);
        
        System.out.println(num + " tiene " + counter + " dígitos");
    }
    
}
