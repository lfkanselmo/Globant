/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
 * pantalla el siguiente menú:
 *  MENU
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Salir
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int election;
        float resultFloat, result, num1, num2;
        boolean exit = false, pass = false;
        
        do{
            System.out.println("Ingrese el primer número:");
            num1 = read.nextInt();
            System.out.println("");
            System.out.println("Ingrese el segundo número: ");
            num2 = read.nextInt();
            System.out.println("");
            
            if (num1<1 || num2<1){
                System.out.println("los números deben ser enteros positivos...");
                System.out.println("");
                pass=false;
            } else{
                pass=true;
            }
            
        }while(pass==false);
        

        
        do{
            System.out.println("******MENU******");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción");
            System.out.println("");
            election = read.nextInt();
            System.out.println("");
            
            switch (election){
                case 1:
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    System.out.println("");
                    break;
                    
                case 2:
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    System.out.println("");
                    break;
                    
                case 3:
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    System.out.println("");
                    break;
                    
                case 4:
                    resultFloat = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultFloat);
                    System.out.println("");
                    break;
                    
                case 5:
                    read.skip("\n");
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String option = read.nextLine().toUpperCase();
                    System.out.println("");
                    
                    if (option.equals("S")){
                        System.out.println("******ADIOS!!******");
                        exit = true;
                        break;   
                    } else{
                        break;
                    }
                    
                default:
                    System.out.println("Opción incorrecta");
                    System.out.println("");
                    break;
            }
        }while(exit==false);
    }
    
}
