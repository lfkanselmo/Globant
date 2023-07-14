/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
 * dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
 * fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
 * X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
 * especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
 * de FDE, que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
 * incorrectas recibidas.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio12 {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int counterCorrect = 0, counterIncorrect = 0;
       String word;
       boolean exit = false, correct = false;
       
       do {
           System.out.println("");
           System.out.println("Ingrese cadena: ");
           word = read.nextLine().toUpperCase();
           
           //Comprobar si no se ha ingresado la secuencia de salida
           if (word.equals("&&&&&")){
               exit = true;
           } else {
               correct = check(word);
               
               //Comprobar si es correcto lo ingresado
               if (correct==true){
                   counterCorrect = counterCorrect + 1;
               } else{
                   counterIncorrect = counterIncorrect + 1;
               }
           }
       }while(exit==false);
       
        System.out.println("---------------------------------------------------");
        System.out.println("Cantidad total de CORRECTOS: " + counterCorrect);
        System.out.println("");
        System.out.println("");
        System.out.println("Cantidad total de INCORRECTOS: " + counterIncorrect);
        System.out.println("");
    }
    
    //función para comprobar si es correcto lo ingresado o no
    public static boolean check(String sentence){
        //Verificar si contiene 5 caracteres, el primero es X y el último es O
        return sentence.matches("X.{3}O");
    }
    
}
