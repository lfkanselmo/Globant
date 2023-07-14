/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package ejercicioextra5;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //Ingreso y validación del tipo de socio
        boolean pass;
        String type;
        do{
            pass = true;
            System.out.println("Ingrese el tipo de socio (A,B,C)");
            type = read.nextLine().toUpperCase();
            System.out.println("");
            if (!type.equals("A") && !type.equals("B") && !type.equals("C")){
                System.out.println("Letra no válida. Intente de nuevo");
                pass = false;
            }
        }while(pass==false);
        
        //Ingreso del costo del tratamiento
        System.out.println("Ingrese el costo del tratamiento");
        float price = read.nextFloat();
        System.out.println("");
        
        System.out.println("El valor que debe pagar el socio tipo " + type + " es: " + discount(type,price));
    }
    
    //función para generar el descuento
    public static float discount(String type, float price){
        float priceF = 0;
        
        switch(type){
            case "A":
                priceF = (float) (price*0.5);
                break;
                
            case "B":
                priceF = (float) (price*0.75);
                break;
                
            case "C":
                priceF = price;
                break;
                
            default:
                break;
        }
        
        return priceF;
    }
    
}
