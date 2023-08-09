/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Country;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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

            System.out.println("¿Desea ingresar otro país? S/N");
            String answer = read.nextLine().toLowerCase();

            switch (answer) {
                case "n":
                    System.out.println("****** INGRESO TERMINADO ******");
                    exit = true;
                    break;

                case "s":
                    pass = false;
                    exit = false;
                    break;

                default:
                    System.out.println("Opción ingresada no válida");
                    pass = true;
                    exit = false;
                    break;
            }

        } while (exit == false);

        showAll();
        showAllOrder();
        deleteCountry();

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

        countries.add(country);
    }

    //metodo para mostrar todos los países
    private void showAll() {
        for (Country country : countries) {
            System.out.println(country.toString());
        }

        System.out.println();
    }

    //Metodo para mostrar todos los paises ordenados
    private void showAllOrder() {
        List<Country> countriesList = new ArrayList<Country>(countries);
        Collections.sort(countriesList, new Comparator<Country>() {
            @Override
            public int compare(Country c1, Country c2) {
                return c1.getName().compareTo(c2.getName());
            }

        });

        for (Country country : countriesList) {
            System.out.println(country.toString());
        }
    }

    //Metodo para buscar un pais y eliminarlo
    private void deleteCountry() {
        Iterator<Country> it = countries.iterator();
        System.out.println();
        System.out.println("Ingrese pais a eliminar");
        String co = read.nextLine();
        boolean found = false;

        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(co)) {
                it.remove();
                found = true;
                break;
            }

        }
        
        if (found) {
                System.out.println(co + " eliminado");
                showAll();
            } else{
                System.out.println("País no encontrado");
            }
    }
}
