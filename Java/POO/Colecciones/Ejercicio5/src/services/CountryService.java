/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Country;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class CountryService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private Country country;
    private boolean exit = false;
    private HashSet<Country> countries = new HashSet<Country>();

    //Metodo para iniciar
    public void start() {

        System.out.println();
        System.out.println("******** BIENVENIDO ********");
        System.out.println();

        boolean pass = false;

        do {
            if (pass == false) {
                addCountry();
            }

            System.out.println("¿Desea ingresar otro país?");
            String answer = read.nextLine().toLowerCase();

            switch (answer) {
                case "n":
                    System.out.println("****** INGRESO TERMINADO ******");
                    exit = true;
                    break;

                case "s":
                    pass = false;
                    break;

                default:
                    System.out.println("Opción ingresada no válida");
                    pass = true;
                    exit = false;
                    break;
            }

        } while (exit == false);

    }

    //Metodo para agregar paises
    private void addCountry() {
        country = new Country();
        exit = false;

        do {

            System.out.println("Ingrese país");
            country.setName(read.nextLine());

            if (!country.getName().equals("")) {
                exit = true;
            } else {

                System.out.println("No se permite valores nulos o vacios, ingrese un país");
                exit = false;
            }

        } while (exit == false);
    }
}
