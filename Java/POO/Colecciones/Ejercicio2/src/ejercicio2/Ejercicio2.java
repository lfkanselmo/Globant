/*

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.

 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> dogs = new ArrayList<String>();

        boolean pass = true;
        boolean continua = true;

        do {
            System.out.println("Ingresa raza de perro");
            dogs.add(read.nextLine().toLowerCase());

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

        show(dogs);
        
        System.out.println();
        System.out.println("Ingrese raza de perro a eliminar: ");
        String dogBreed = read.nextLine().toLowerCase();

        Iterator<String> it = dogs.iterator();
        boolean found = false;

        while(it.hasNext()){
            if (it.next().equals(dogBreed)) {
                System.out.println();
                System.out.println("Raza eliminada");
                System.out.println();
                it.remove();
                found = true;
            }
        }

        if (found == false) {
            System.out.println();
            System.out.println("Raza no encontrada");
            Collections.sort(dogs);
            show(dogs);
        } else{
            Collections.sort(dogs);
            show(dogs);
        }

    }
    
    public static void show(ArrayList<String> array){
        System.out.println("Arreglo de razas: ");
        System.out.println();
        for (String dog : array) {
            System.out.println(dog);
        }
        System.out.println();
    }

}
