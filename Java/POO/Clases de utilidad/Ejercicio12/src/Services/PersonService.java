package Services;

import Entities.Person;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Krausser
 */
public class PersonService {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private Person person = new Person();

    public Person getPerson() {
        return person;
    }

    //Metodo para ingresar una nueva persona por teclado
    public void newPerson() {
        boolean pass = false;
        int year, month, day;

        System.out.println("Ingrese nombre de la persona");
        person.setName(read.nextLine());
        System.out.println();

        do {
            System.out.println("Ingrese año de nacimiento");
            year = read.nextInt();
            System.out.println("Ingrese mes de nacimento");
            month = read.nextInt();
            System.out.println("Ingrese día de nacimento");
            day = read.nextInt();

            pass = validDate(day, month, year);
            if (pass == false) {
                System.out.println("Fecha de nacimiento no válida");
                System.out.println();
            } else {
                System.out.println("Fecha aceptada");
                Date bornDate = new Date(year - 1900, month - 1, day);
                person.setBornDate(bornDate);
                System.out.println();
                pass = true;
            }

        } while (pass == false);

    }

    //Metodo calcular edad
    public int age() {
        //fecha de hoy
        Date today = new Date();

        //Resta de fechas con resultado en milisegundos
        long timeElapsed = today.getTime() - person.getBornDate().getTime();
        TimeUnit years = TimeUnit.DAYS;
        long days = years.convert(timeElapsed, TimeUnit.MILLISECONDS);
        return (int) (days / 365);
    }

    //Metodo para comprobar si una fecha es menor que
    public boolean smaller(Date date) {
        long age = person.getBornDate().getTime();
        long ageDate = date.getTime();
        
        //comprobar cual es mayor
        if (age > ageDate) {
            return true;
        } else {
            return false;
        }
    }
    
    //Metodo para motrar a la persona
    public void showPerson(){
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/YYYY");
        String date = simpleDate.format(person.getBornDate());
        System.out.println("Nombre: " + person.getName());
        System.out.println("Fecha de nacimiento: " + date);
        System.out.println("Edad: " + age());
    }

    //Función para validar la fecha
    public static boolean validDate(int day, int month, int year) {
        Date today = new Date();

        //Validar año
        if (year > today.getYear() + 1900) {
            return false;
        }

        //validar mes
        if (month > 12 || month < 1 || (month > today.getMonth() + 1 && year == today.getYear() + 1900)) {
            return false;
        }

        //validar el día
        int monthDay = monthDays(year, month);

        if (day < 1 || day > monthDay) {
            return false;
        }

        return true;
    }

    //Función para obtener cantidad de días según el mes
    public static int monthDays(int year, int month) {
        int monthDays;

        //comprobar si mes es febrero
        if (month == 2) {
            //comprobar si es año bisiesto
            if (leapYear(year)) {
                monthDays = 29;
            } else {
                monthDays = 28;
            }
        } else {
            //para otros meses
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    monthDays = 30;
                    break;
                default:
                    monthDays = 31;
                    break;
            }
        }

        return monthDays;
    }

    //Función para comprobar año bisiesto
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
