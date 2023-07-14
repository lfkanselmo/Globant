/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse.
 */
package ejercicioextra8;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int nPair = 0, nOdd = 0, counter = 0;
        boolean pass = false;
        
        //verificar números ingresados, si son diferentes de 5, pares o impares
        do{
            System.out.println("ingrese número: ");
            num = read.nextInt();
            if (num>0){
                if (num % 5 == 0){
                    pass = true;
                    break;
                } else if (num % 2 == 0){
                    nPair++;
                } else{
                    nOdd++;
                }
                
                counter++;
            }
        }while(pass == false);
        
        System.out.println("La cantidad de números impares es: " + nOdd);
        System.out.println("La cantidad de números pares es: " + nPair);
        System.out.println("La cantidad de números ingresados en total es: " + counter);
    }
    
}
