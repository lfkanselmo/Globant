/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package ejercicioextra15;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese los números");
        double num1 = read.nextDouble();
        double num2 = read.nextDouble();
        System.out.println("");
        
        System.out.println("Seleccione la opción deseada");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicación");
        System.out.println("4. división");
        System.out.println("");
        int option = read.nextInt();
        double result;
        System.out.println("");
        
        switch(option){
            case 1:
                result = addition(num1,num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
                
            case 2:
                result = subtraction(num1,num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
                
            case 3:
                result = multiplication(num1,num2);
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
                
            case 4:
                
                //comprobar división entre cero
                if (num2 == 0){
                    System.out.println("La operación no es válida, dividir entre cero es una indeterminación");
                    break;
                } else{
                    result = divition(num1,num2);
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                }
                
            default:
                System.out.println("Valor ingresado es incorrecto");
        }
    }
    
    
    //función para la suma
    public static double addition(double num1, double num2){
        return num1 + num2;
    }
    
    //función para la resta
    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }
    
    //función para la multiplicación
    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }
    
    //función para la división
    public static double divition(double num1, double num2){
        return num1 / num2;
    }
    
}
