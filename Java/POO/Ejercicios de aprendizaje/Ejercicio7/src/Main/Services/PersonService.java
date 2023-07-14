package Main.Services;

import java.util.Scanner;
import Main.Entities.Person;

/**
 *
 * @author Krausser
 */
public class PersonService {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    /*---------------Metodo para crear una nueva persona----------------------*/
    public Person newPerson() {
        Person p = new Person();
        System.out.println("Ingrese el nombre de la persona");
        p.setName(read.next());
        System.out.println("Ingrese la edad de la persona");
        p.setAge(read.nextInt());
        boolean pass = true;
        //Comprobar valores correctos del sexo
        do {
            System.out.println("Ingrese el sexo de la persona");
            p.setSex(read.next().toUpperCase());
            if (!(p.getSex().equals("M")) && !(p.getSex().equals("F")) && !(p.getSex().equals("O"))) {
                System.out.println("Valor ingresado no válido");
                pass = false;
            } else {
                pass = true;
            }
        } while (pass == false);

        System.out.println("Ingrese la altura de la persona");
        p.setHeight(read.nextDouble());
        System.out.println("Ingrese el peso de la persona");
        p.setWeight(read.nextDouble());

        return p;

    }

    /*------------Metodo para calcular el IMC---------------------------------*/
    public int imc(Person p) {
        //Calculo IMC peso / altura^2
        double imc = p.getWeight() / (Math.pow(p.getHeight(), 2));

        //Comprobar el valor del IMC
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }
    
    //Metodo para saber si la persona es mayor de edad.
    public boolean adult(Person p){
        boolean adult = false;
        //Comprobar si la persona tiene más de 18 años
        if (p.getAge()>=18) {
            adult = true;
        }
        return adult;
    }
    
}
