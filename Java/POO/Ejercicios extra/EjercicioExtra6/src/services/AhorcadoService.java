/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class AhorcadoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ahorcado = new Ahorcado();
    String[] peliculas = {"matriz", "interstellar", "el rey leon", "el hobbit",
        "depredador", "alicia en el pais de las maravillas",
        "mi pobre angelito", "yo robot",
        "eterno resplandor de una mente sin recuerdos", "alien", "titanic"};

    //Metodo para crear un nuevo juego
    public void nuevoJuego(int cantidadIntentos) {
        int n = (int) (Math.random() * peliculas.length);
        String palabra = peliculas[n];
        ahorcado.setPalabra(palabra);
        boolean pass = true;
        do {
            if (cantidadIntentos == 0 || cantidadIntentos < 0) {
                System.out.println("Valor de intentos no válido, ingrese número positivo...");
                cantidadIntentos = read.nextInt();
                pass = false;
            } else {
                pass = true;
            }
        } while (pass == false);
        ahorcado.setcJugadas(cantidadIntentos);
    }

    //Metodo para jugar
    public void jugar() {
        char[] palabraActual = new char[ahorcado.getPalabra().length()];
        String palabra = ahorcado.getPalabra();
        for (int i = 0; i < palabraActual.length; i++) {
            if (palabra.charAt(i) == ' ') {
                palabraActual[i] = ' ';
            } else {
                palabraActual[i] = '_';
            }
        }

        System.out.println();
        System.out.println("Vamos a iniciar a jugar.");
        System.out.println();
        System.out.println("La palabra es: ");
        mostrarPalabra(palabraActual);
        String letra;
        int intentos = ahorcado.getcJugadas();

        while (String.valueOf(palabraActual).contains("_") && intentos > 0) {
            System.out.println();
            System.out.println("Ingrese letra: ");
            letra = read.next();

            if (!(letra.length() == 1)) {
                if (letra.equals(palabra)) {
                    System.out.println();
                    System.out.println("Wow lo lograste, y con intentos de sobra. BIEN HECHO!!");
                    palabraActual = agregarPalabra(palabra);
                    break;
                }
                System.out.println("Ingrese solo una letra");
                continue;
            }

            boolean acierto = false;
            for (int i = 0; i < palabraActual.length; i++) {
                if (palabra.charAt(i) == letra.charAt(0)) {
                    palabraActual[i] = letra.charAt(0);
                    acierto = true;
                }
            }

            if (acierto) {
                System.out.println("Letra encontrada");
                mostrarPalabra(palabraActual);
            } else {
                System.out.println("La letra no está en la palabra");
                intentos--;
                System.out.println("Te quedan " + intentos + " intentos...");
            }

        }

        if (String.valueOf(palabraActual).contains("_")) {
            System.out.println();
            System.out.println("Lo siento perdiste. La palabra era: ");
            System.out.println(palabra);
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Felicidades, has ganado");
            System.out.println("La palabra era: ");
            System.out.println(palabra);
        }

    }

    //Metodo para mostrar palabra
    public void mostrarPalabra(char[] palabra) {
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i]);
        }
        System.out.println();
    }

    //Metodo para agregar palabra String a vector char
    public char[] agregarPalabra(String palabra) {
        char[] vector = new char[palabra.length()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = palabra.charAt(i);
        }

        return vector;
    }
}
