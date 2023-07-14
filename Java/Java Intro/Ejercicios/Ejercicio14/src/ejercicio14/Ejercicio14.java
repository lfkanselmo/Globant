/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean pass = false;
        String currency;
        
        //Ingresar cantidad de Euros a convertir
        System.out.println("Ingrese cantidad de Euros: ");
        float euros = read.nextFloat();
        read.skip("\n");
        System.out.println("");
        
        //Ingresar tipo de cambio de salida, validar que sea correcto
        do{
            System.out.println("Ingrese el tipo de cambio al que desea convertir: ");
            System.out.println("'d' para Dólares");
            System.out.println("'l' para Libras");
            System.out.println("'y' para Yenes");
            System.out.println("");
            currency = read.nextLine().toLowerCase();
            
            //comprobar que sea valido el valor ingresado
            if (!currency.equals("d") && !currency.equals("l") && !currency.equals("y")){
                System.out.println("opción no válida");
                pass = false;
            }else {
                pass = true;
            }
            
            System.out.println("");
        }while(pass==false);
        
        //Imprimir resultado
        switch(currency){
            case "d":
                System.out.println(euros + " equivalen a " + (converter(currency,euros)) + " Dólares");
                break;
                
            case "l":
                System.out.println(euros + " equivalen a " + (converter(currency,euros)) + " Libras");
                break;
                
            case "y":
                System.out.println(euros + " equivalen a " + (converter(currency,euros)) + " Dólares");
                break;
        }
        
    }
    
    //Función para convertir euros
    public static float converter(String currency, float money){
        float cash = 0;
        switch(currency){
        case "d":
            cash = (float)(money * 1.28611);
            break;
            
        case "l":
            cash = (float)(money * 0.86);
            
        case "y":
            cash = (float)(money * 129.852);
        }
        
        return cash;
    }
    
}
