/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejercicioextra1;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos: ");
        int minutes = read.nextInt();
        System.out.println("");
        
        converter(minutes);
    }
    
    //Proceso para convertir los minutos
    public static void converter(int minutes){
        int hours = 0, days = 0, aux = minutes;
        
        //calcular cantidad de días
        if (aux>1440){
            days = aux / 1440;
            aux = aux % 1440;
        }
        
        //calcular cantidad de horas
        if (aux>60){
            hours = aux / 60;
            if (hours > 23){
                days = days + 1;
                hours = hours - 23;
            }
            aux = aux % 60;
        }
        
        //Mostrar la conversión
        System.out.println("");
        System.out.print(minutes + " minutos equivalen a ");
        //imprimir días
        if(days!=0){
            System.out.print(days + " días");
        }
        //imprimir horas
        if(hours!=0){
            System.out.print(", " + hours + " horas");
        }
        //imprimir minutos
        if(aux!=0){
            System.out.print(", " + aux + " minutos");
        } else{
            System.out.println("nada a convertir");
        }
        
        System.out.println("");
 
    }
    
}
