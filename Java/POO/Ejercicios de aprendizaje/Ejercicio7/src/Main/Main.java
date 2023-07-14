package Main;

import Main.Entities.Person;
import Main.Services.PersonService;

/**
 *
 * @author Krausser
 */
public class Main {

    public static void main(String[] args) {
        PersonService ps = new PersonService();
        Person[] persons = new Person[4];
        double lowWeight = 0, idealWeight = 0, overWeight = 0, adult = 0, noAdult = 0;
        persons[0] = new Person("Anselmo", "M", 30, 74, 1.71);
        persons[1] = new Person("Luciana", "F", 12, 45, 1.50);
        persons[2] = new Person("Sandrid", "F", 29, 64, 1.59);
        persons[3] = new Person("Leisys", "F", 26, 56, 1.60);

        //peso ideal
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Persona " + i + ": ");
            idealWeight(ps.imc(persons[i]));

            //contadores por IMC
            if (ps.imc(persons[i]) == -1) {
                lowWeight++;
            } else if (ps.imc(persons[i]) == 0) {
                idealWeight++;
            } else if (ps.imc(persons[i]) == 1) {
                overWeight++;
            }
        }

        //Mayoría de edad
        for (int i = 0; i < persons.length; i++) {
            System.out.println("¿La persona " + i + " es mayor de edad?: " + ps.adult(persons[i]));

            //Contadores mayoría de edad
            if (ps.adult(persons[i]) == true) {
                adult++;
            } else {
                noAdult++;
            }
        }

        //imprimir porcentajes de personas dependiendo de su IMC
        System.out.println("Personas con peso menor al ideal: " + 100 * (lowWeight / persons.length));
        System.out.println("Personas con peso ideal: " + 100 * (idealWeight / persons.length));
        System.out.println("Personas con sobrepeso: " + 100 * (overWeight / persons.length));

        //Imprimir porcentajes de personas dependiendo de su edad
        System.out.println("Mayores de edad: " + 100 * (adult / persons.length));
        System.out.println("Menores de edad: " + 100 * (noAdult / persons.length));

    }

    //Proceso para determinar si está en su peso ideal
    public static void idealWeight(int number) {
        if (number == -1) {
            System.out.println("Está por debajo del peso ideal");
        } else if (number == 0) {
            System.out.println("Está en el peso ideal");
        } else {
            System.out.println("Está en sobrepeso");
        }
    }

}
