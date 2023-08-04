/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import services.MovieService;

/**
 *
 * @author Krausser
 */
public class Main {
    public static void main(String[] args) {
        MovieService movies = new MovieService();
        
        movies.ProgramStart();
    }
    
}
