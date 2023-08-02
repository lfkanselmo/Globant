/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Movie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class MovieService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Movie> movies = new ArrayList();
    private Movie movie = new Movie();
    private boolean pass = false;

    //Menu bucle
    public void menu() {

        pass = false;

        System.out.println("****** BIENVENIDO ******");

        do {
            System.out.println();
            System.out.println("¿Desea agregar película? S/N");
            System.out.println();
            String answer = read.nextLine().toUpperCase();

            switch (answer) {
                case "S":
                    addMovie();
                    pass = false;
                    break;

                case "N":
                    System.out.println("****** PROGRAMA TERMINADO ******");
                    pass = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Opción ingresada no válida. Intente de nuevo...");
                    System.out.println();
                    pass = false;
                    break;
            }
        } while (pass == false);

    }

    //Función para agregar las películas
    private void addMovie() {

        System.out.println();
        System.out.println("Ingrese titulo de la película");
        movie.setTitle(read.nextLine());
        System.out.println();
        System.out.println();
        System.out.println("Ingrese el nombre del director");
        movie.setDirector(read.nextLine());
        System.out.println();
        System.out.println();

        do {
            try {
                System.out.println("Ingrese la duración de la película en horas");
                movie.setDuration(read.nextDouble());
                read.skip("\n");
            } catch (InputMismatchException e) {
                System.out.println("error: No ingrese cadenas de texto. " + e.getMessage());
                movie.setDuration(0.0);
                read.next();
            }

        } while (movie.getDuration() == 0.0);

        movies.add(movie);

    }

    //Metodo para mostrar todas las peliculas
    public void showAll() {
        for (Movie movy : movies) {
            System.out.println(movy);
            System.out.println();
        }
        System.out.println();
    }

    //Metodo para mostrar todas las peliculas con filtro de duración
    public void showAllTime(double time) {
        for (Movie movy : movies) {
            if (movy.getDuration() >= time) {
                System.out.println(movy);
                System.out.println();
            }
        }
        System.out.println();
    }
    
    //metodo para ordenar las peliculas por su duración
    public void sortTime(){
        
    }
}
