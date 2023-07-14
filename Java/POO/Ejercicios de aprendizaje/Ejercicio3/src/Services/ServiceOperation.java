
package Services;

import Entities.Operation;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class ServiceOperation {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    //Crear una nueva operación ingresando 2 números
    public Operation newOperation(){
        System.out.println("Ingrese el primer número: ");
        int num1 = read.nextInt();
        System.out.println("");
        System.out.println("Ingrese el segundo número: ");
        int num2 = read.nextInt();
        System.out.println("");
        
        return new Operation(num1, num2);
               
    }
    
    //Metodo para la suma
    public int sum (int num1, int num2){
        return num1 + num2;
    }
    
    //Metodo para la resta
    public int subtra(int num1, int num2){
        return num1 - num2;
    }
    
    //Metodo para la multiplicación
    public int multi (int num1, int num2){
        return num1 * num2;
    }
    
    //Metodo para la división
    public double div (int num1, int num2){
        double number1 = (double)(num1);
        double number2 = (double)(num2);
        //validar si el divisor es cero
        if (num2 == 0) {
            System.out.println("La división entre cero es indeterminada");
            return 0;
        } else{
            return number1 / number2;
        }
    }
    
}
