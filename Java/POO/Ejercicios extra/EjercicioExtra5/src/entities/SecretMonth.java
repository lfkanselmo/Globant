package entities;

import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SecretMonth {
    private String[] months = {"enero", "febrero", "marzo",
            "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String SecretMonth;

    public SecretMonth() {
    }

    public String[] getMonths() {
        return months;
    }

    public void setMonths(String[] months) {
        this.months = months;
    }

    public String getSecretMonth() {
        return SecretMonth;
    }

    public void setSecretMonth(String secretMonth) {
        SecretMonth = secretMonth;
    }

    @Override
    public String toString() {
        return "SecretMonth{" +
                "months=" + Arrays.toString(months) +
                ", SecretMonth='" + SecretMonth + '\'' +
                '}';
    }

    //Scanner
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    //metodo para jugar
    public void play() {
        System.out.println();
        System.out.println("Iniciamos el juego de adivinanza");
        System.out.println();
        int lon = getMonths().length;
        int n = (int) (Math.random() * lon);
        setSecretMonth(months[n]);
        boolean pass = true;
        String[] badOptions;
        int l;

        //Cantidad de intentos
        System.out.println("ingrese la cantidad de intentos que desea tener");
        do {
            l = read.nextInt();
            if (l <= 0){
                System.out.println("Número de intentos no válido. Intente de nuevo...");
                pass = false;
            } else {
                pass = true;
            }
        }while(pass == false);

        //inicilizar vector para almancenar intentos erroneos
        badOptions = new String[l-1];



        show();
        String month;


        boolean correct = false;

        //Adivinar el mes
        while(l> 0){

            System.out.println();
            System.out.println("Adivine el mes secreto: ");
            do {
                month = read.next().toLowerCase();
                //checkRepeat(month);
                pass = contain(month, months);

            } while (pass == false);
            if (month.equals(getSecretMonth())) {
                System.out.println("lo lograste. El mes secreto era: " + getSecretMonth());
                l--;
                System.out.println("Número de intentos sobrantes: " + l);
                correct = true;
                break;
            } else {
                System.out.println("Errado, sigue intentando");
                badOptions[l-1] = month;
                l--;
                System.out.println("Intentos restantes: " + l);
                continue;
            }
        }

        if (correct){
            System.out.println("Bien hecho");
        } else {
            System.out.println("Lo siento, perdiste");
        }


    }

    //Metodo para mostrar meses
    public void show() {
        System.out.println("Meses validos: ");
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }

    //Metodo para revisar si contiene mes
    public boolean contain(String month, String[] monthsVector) {
        for (int i = 0; i < monthsVector.length; i++) {
            if (month.equals(monthsVector[i])) {
                return true;
            }
        }
        System.out.println("Mes ingresado no valido, intente de nuevo");
        return false;
    }
}
