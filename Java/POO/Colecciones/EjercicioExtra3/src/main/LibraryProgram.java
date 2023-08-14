/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import services.LibraryService;

/**
 *
 * @author Krausser
 * 
 */
public class LibraryProgram {
    public static void main(String[] args) {
        LibraryService books = new LibraryService();
        
        books.startProgram();
    }
    
}
