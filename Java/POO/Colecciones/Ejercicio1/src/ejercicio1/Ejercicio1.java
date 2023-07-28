/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 

 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> dogs = new ArrayList<String>();

        boolean pass = true;
        boolean continua = true;

        do {
            System.out.println("Ingresa raza de perro");
            dogs.add(read.nextLine());

            do {
                System.out.println("¿desea seguir ingresando? S/N");
                String answer = read.nextLine().toLowerCase();

                switch (answer) {
                    case "s":
                        pass = false;
                        break;

                    case "n":
                        pass = false;
                        continua = false;
                        break;

                    default:
                        pass = true;
                        System.out.println("Respuesta incorrecta, ingrese S o N");
                        break;
                }

            } while (pass == true);

        } while (continua == true);

        for (String dog : dogs) {
            System.out.println(dog);
        }
    }

}
