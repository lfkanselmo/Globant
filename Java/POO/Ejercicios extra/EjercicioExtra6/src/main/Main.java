/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import services.AhorcadoService;

/**
 *
 * @author Krausser
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        AhorcadoService juego = new AhorcadoService();
        System.out.println("Ingrese cantidad de intentos que desea: ");
        int n = read.nextInt();
        juego.nuevoJuego(n);
        juego.jugar();
    }

}
