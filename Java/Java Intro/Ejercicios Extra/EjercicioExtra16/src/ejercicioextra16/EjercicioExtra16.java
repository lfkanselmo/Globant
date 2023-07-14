/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ejercicioextra16;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("¿Cuántas personas desea ingresar?");
        int n = read.nextInt();
        read.skip("\n");
        
        String[][] people = new String[n][2];
        
        //Rellenar vector con los nombres y edades de N personas
        for (int i=0; i<n; i++){
            System.out.println("Ingrese nombre de persona " + (i+1));
            people[i][0] = read.nextLine();
            System.out.println("");
            System.out.println("Ingrese edad de persona " + (i+1));
            people[i][1] = read.nextLine();
            System.out.println("");
        }
        
        //Mostrar los datos de las personas y si son mayores de edad
        outerLoop:
        for (int j=0; j<n; j++){
            
            //convertir la edad de String a número
            int num = Integer.parseInt(people[j][1]);
            
            //comprobar si son mayores de edad
            if (num>18){
                System.out.println(people[j][0] + " con " + people[j][1] + " años de edad, SI es mayor de edad");
                System.out.println("");
            }else{
                System.out.println(people[j][0] + " con " + people[j][1] + " años de edad, NO es mayor de edad");
                System.out.println("");
            }
            
            //Comprobar si quiere seguir mostrando
            boolean pass = false;
            
            do{
                System.out.println("¿Quiere seguir mostrando?");
                String option = read.nextLine().toUpperCase();
                System.out.println("");
                                
                
                switch(option){
                    case "SI":
                        pass = true;
                        break;
                        
                    case "NO":
                        break outerLoop;
                        
                    default:
                        System.out.println("Ingreso no válido, vuelva a intentarlo");
                        System.out.println("");
                        pass = false;
                        break;
                }
            }while(pass == false);
        }
        
    }
    
}
