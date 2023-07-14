/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente.
 */
package ejercicioextra10;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        //Generación de números entre 0-10 y producto de estos
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        
        int nUser;
        boolean pass=false;
        
        //adivinar
        do{
            System.out.println("Adivine el resultado de la multiplicación");
            nUser = read.nextInt();
            System.out.println("");
            if(nUser == (num1*num2)){
                System.out.println("Lo lograste. Los números eran " + num1 + " y " + num2);
                pass = true;
                break;
            } else{
                System.out.println("Error, siga intentando...");
                System.out.println("");
            }
        }while(pass==false);
    }
    
}
