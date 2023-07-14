/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package ejercicioextra14;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        //ingresar la cantidad de familias
        System.out.println("Ingrese la cantidad de familias: ");
        int n = read.nextInt();
        int sum = 0;
        int totalChildren = 0;
        
        
        //Empezar a preguntar por cada familia la cantidad de hijos
        for(int i=1; i<=n; i++){
            boolean pass = false;
            int m = 0;
            
            //Ingresar el número de hijos
            do{
                System.out.println("Ingrese la cantidad de hijos de la familia " + i);
                m = read.nextInt();
                System.out.println("");
                
                //Validar que la cantidad de hijos sea positivo o cero
                if (m<0){
                    System.out.println("Número de hijos ingresados no válido");
                    System.out.println("");
                } else {
                    pass = true;
                }
            }while(pass == false);
            
            totalChildren = totalChildren + m;
            
            //Comprobar si la familia tiene hijos
            if (m!=0){
                
                //ingresar la edad de cada hijo de las familias
                for (int j=1; j<=m; j++){
                    System.out.println("Ingrese la edad del hijo " + j + " en la familia " + i);
                    sum = sum + read.nextInt();
                    System.out.println("");
                }
            }
            
            
        }
        
        //Calcular la media de edades de los hijos
        double mediaChildren = (double) (sum / totalChildren);
        System.out.println("El promedio de edad de los hijos de las familias es: " + mediaChildren);
    }
    
}
