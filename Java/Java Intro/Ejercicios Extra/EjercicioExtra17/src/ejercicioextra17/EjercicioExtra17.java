/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
 */
package ejercicioextra17;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra17 {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       
        System.out.println("Ingrese número: ");
        int num = read.nextInt();
        
        System.out.println("¿Es " + num + " primo?: " + check(num));
    }
    
    //función para comprobar si el número es primo
    public static boolean check(int num){
        int root = Math.round((num)^(1/2));
        boolean prime = true;
        
        for (int i=2; i<root; i++){
            //comprobar si es multiplo de i
            if (root % i == 0){
                prime = false;
                return prime;
            }
        }
        
        return prime;
    }
    
}
