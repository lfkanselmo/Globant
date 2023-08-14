/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class IntegerList {

    private List<Integer> list;
    Scanner read = new Scanner(System.in);

    //Metodo para ingreso de números
    public void startList() {
        list = new ArrayList<Integer>();
        System.out.println(" ****** BIENVENIDO ****** ");
        System.out.println();
        Integer num = 0;
        boolean exit = true;

        do {
            System.out.println("Ingrese entero: ");
            num = read.nextInt();

            if (num != -99) {
                list.add(num);
                System.out.println("número agregado con éxito");
                System.out.println();
            } else {
                exit = false;
                System.out.println(" ****** FIN INGRESO ****** ");
            }

        } while (exit);
    }

    //Metodo para mostrar los valores del arreglo
    public void showAll() {
        for (Integer num : list) {
            System.out.println(num);
        }
        System.out.println();
    }

    //Metodo para suma y promedio
    public void calculate() {
        Integer sum = 0;
        for (Integer num : list) {
            sum += num;
        }

        Double avr = ((double) sum / list.size());

        System.out.println("El total de la suma es: " + sum);
        System.out.println("El promedio es: " + avr);

    }

}
