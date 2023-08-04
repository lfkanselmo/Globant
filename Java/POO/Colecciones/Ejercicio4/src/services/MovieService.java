/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Movie;
import java.util.ArrayList;
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
    private Movie movie;
    private boolean pass = false;

    //Metodo para iniciar el programa
    public void ProgramStart() {

        pass = false;

        System.out.println();
        System.out.println("****** BIENVENIDO ******");
        System.out.println();

        boolean badInput = false;

        do {

            if (badInput == false) {
                addMovie();
            }
            System.out.println();
            System.out.println("¿Desea agregar otra película? S/N");
            System.out.println();
            String answer = read.nextLine().toUpperCase();

            switch (answer) {
                case "S":
                    pass = false;
                    badInput = false;
                    break;

                case "N":
                    System.out.println();
                    System.out.println("****** INGRESO TERMINADO ******");
                    System.out.println();
                    pass = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Opción ingresada no válida. Intente de nuevo...");
                    System.out.println();
                    pass = false;
                    badInput = true;
                    break;
            }
        } while (pass == false);

        orderMenu();

    }

    //Metodo para desplegar menú de opciones de ordenamiento
    private void orderMenu() {
        pass = false;

        do {
            System.out.println("");
            System.out.println("¿Desea hacer algún ordenamiento? S/N");
            String answer = read.nextLine().toUpperCase();

            switch (answer) {
                case "N":
                    System.out.println();
                    System.out.println("****** MENÚ DE ORDENAMIENTO TERMINADO ******");
                    pass = true;
                    break;

                case "S":
                    do {
                        System.out.println("-------------------------------------");
                        System.out.println();
                        System.out.println("Elija una opción: ");
                        System.out.println("a. De mayor a menor por duración");
                        System.out.println("b. De menor a mayor por duración");
                        System.out.println("c. Alfabeticamente por titulo");
                        System.out.println("d. Alfabeticamente por director");
                        System.out.println("e. Mostrar las películas con una duración mayor a la ingresada");
                        System.out.println("f. Salir");
                        System.out.println();
                        String ans = read.nextLine().toLowerCase();

                        switch (ans) {
                            case "a":
                                System.out.println();
                                System.out.println("** Películas ordenadas de mayor a menor según la duración");
                                sortTimeDesc();
                                showAll();
                                pass = false;
                                break;

                            case "b":
                                System.out.println();
                                System.out.println("** Películas ordenadas de menor a mayor según la duración");
                                sortTimeAsce();
                                showAll();
                                pass = false;
                                break;

                            case "c":
                                System.out.println();
                                System.out.println("** Películas ordenadas alfabeticamente por titulo");
                                sortTitle();
                                showAll();
                                pass = false;
                                break;

                            case "d":
                                System.out.println();
                                System.out.println("** Películas ordenadas alfabeticamente por director");
                                sortDirector();
                                showAll();
                                pass = false;
                                break;

                            case "e":
                                System.out.println();
                                double num = validation();
                                showAllTime(num);
                                pass = false;
                                break;

                            case "f":
                                System.out.println();
                                System.out.println("****** MENÚ DE ORDENAMIENTO TERMINADO ******");
                                System.out.println();
                                pass = true;
                                break;

                            default:
                                System.out.println();
                                System.out.println("Opción ingresada no existe en el menú");
                                System.out.println();
                                pass = false;
                                break;
                        }
                    } while (pass == false);
                    break;

                default:
                    System.out.println("Respuesta ingresada no válida. Intente de nuevo ingresando S o N");
                    System.out.println();
                    pass = false;
                    break;

            }
        } while (pass == false);
    }

    //Función para agregar las películas
    private void addMovie() {

        movie = new Movie();

        System.out.println();
        pass = false;
        do {
            System.out.println("Ingrese titulo de la película");
            movie.setTitle(read.nextLine());

            if (!movie.getTitle().equals("")) {
                pass = true;
            } else {
                System.out.println("No se admiten titulo vacio. Ingrese algo");
            }
        } while (pass == false);
        System.out.println();
        System.out.println();
        pass = false;
        do {
            System.out.println("Ingrese el nombre del director");
            movie.setDirector(read.nextLine());

            if (!movie.getDirector().equals("")) {
                pass = true;
            } else {
                System.out.println("No se admiten director vacio. Ingrese algo");
            }
        } while (pass == false);
        System.out.println();
        System.out.println();
        pass = false;

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

            if (movie.getDuration() > 0.0) {
                pass = true;
            } else {
                System.out.println("Ingrese un valor postivo, cero horas no es una duración válida");
                pass = false;
            }

        } while (pass == false);

        movies.add(movie);

    }

    //Metodo para mostrar todas las peliculas
    private void showAll() {
        System.out.println();
        for (Movie movy : movies) {
            System.out.println(movy);
            System.out.println();
        }
        System.out.println();
    }

    //Metodo para mostrar todas las peliculas con filtro de duración
    private void showAllTime(double time) {
        System.out.println("*** Listado de todas las peliculas que duran más de "
                + time + " horas ***");
        for (Movie movy : movies) {
            if (movy.getDuration() >= time) {
                System.out.println(movy);
                System.out.println();
            }
        }
        System.out.println();
    }

    //metodo para ordenar las peliculas por su duración de menor a mayor
    private void sortTimeAsce() {
        Collections.sort(movies, new Comparator<Movie>() {

            @Override
            public int compare(Movie mov1, Movie mov2) {
                int answer = 0;
                if (mov1.getDuration() > mov2.getDuration()) {
                    answer = 1;
                } else if (mov1.getDuration() < mov2.getDuration()) {
                    answer = -1;
                }

                return answer;
            }

        });
    }

    //metodo para ordenar las peliculas por su duración de mayor a menor
    private void sortTimeDesc() {
        Collections.sort(movies, new Comparator<Movie>() {

            @Override
            public int compare(Movie mov1, Movie mov2) {
                int answer = 0;
                if (mov1.getDuration() < mov2.getDuration()) {
                    answer = 1;
                } else if (mov1.getDuration() > mov2.getDuration()) {
                    answer = -1;
                }

                return answer;
            }

        });
    }

    //metodo para ordenar las peliculas por su titulo
    private void sortTitle() {
        Collections.sort(movies, new Comparator<Movie>() {

            @Override
            public int compare(Movie mov1, Movie mov2) {
                return mov1.getTitle().compareTo(mov2.getTitle());
            }

        });
    }

    //metodo para ordenar las peliculas por su titulo
    private void sortDirector() {
        Collections.sort(movies, new Comparator<Movie>() {

            @Override
            public int compare(Movie mov1, Movie mov2) {
                return mov1.getDirector().compareTo(mov2.getDirector());
            }

        });
    }

    //Metodo para validar ingreso de números y no letras
    private double validation() {
        pass = false;
        double num;

        do {
            try {
                System.out.println("Ingrese un número de horas de duración minimo para filtrar");
                num = read.nextDouble();
                read.skip("\n");
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número. No se aceptan caracteres");
                System.out.println();
                num = 0.0;
                read.next();
            }

            if (num > 0.0) {
                pass = true;
            } else {
                System.out.println("Ingrese un valor superior a cero");
                System.out.println();
                pass = false;
            }
        } while (pass == false);

        return num;

    }
}
