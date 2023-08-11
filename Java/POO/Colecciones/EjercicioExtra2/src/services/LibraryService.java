/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Book;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 507
 */
public class LibraryService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashSet<Book> library = new HashSet<Book>();
    Book book;

    //metodo para iniciar el programa
    public void startProgram() {
        System.out.println("****** BIENVENIDO ******");

        boolean stayWorking = true;
        boolean opcError = false;

        do {
            if (opcError == false) {
                System.out.println("Agregar nuevo libro: ");
                read.next();
                newBook();
            }

            System.out.println("¿Desea agregar un nuevo libro? S/N");
            String opc = read.next().toUpperCase();

            switch (opc) {
                case "S":
                    newBook();
                    stayWorking = true;
                    opcError = false;
                    break;

                case "N":
                    System.out.println("******  FIN INGRESO ******");
                    stayWorking = false;
                    break;

                default:
                    System.out.println("Opción ingresada no válida. Intente de nuevo");
                    stayWorking = true;
                    opcError = true;
                    break;
            }
        } while (stayWorking);
    }

    //Metodo para crear un nuevo libro
    private void newBook() {
        book = new Book();
        System.out.println("Ingrese el titulo del libro");
        book.setTitle(read.nextLine());
        System.out.println();
        System.out.println("Ingrese el autor del libro: ");
        book.setAutor(read.nextLine());
        book.setCopies(validation("Ingrese la cantidad de ejemplares: "));

        library.add(book);
        System.out.println("Libro agregado con éxito");
    }

    //Metodo prestamo
    private void borrowed() {
        System.out.println("Ingrese el libro que desea prestar: ");
        String bk = read.nextLine();

        Iterator<Book> it = library.iterator();
        boolean found = false;
        
        while (it.hasNext()) {

            Book aux = it.next();

            if (aux.getTitle().equalsIgnoreCase(bk)) {
                found = true;
                if (aux.getBorrowed() < aux.getCopies()) {
                    aux.setBorrowed(aux.getBorrowed() + 1);
                    System.out.println("Libro prestado con éxito");
                    System.out.println();
                    break;
                }

            } else {
                found = false;
            }

        }
        
        if (!found) {
            System.out.println("Libro solicidato no existe en la librería");
            System.out.println();
        }

    }

    //función para validar el ingreso de números
    private Integer validation(String cadena) {
        Integer num;
        boolean pass = false;

        do {
            try {
                System.out.println(cadena);
                num = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("Valor ingresado no número, intente de nuevo");
                num = -1;
                read.next();
            }

            if (num < 0) {
                pass = false;
            } else {
                pass = true;
            }
        } while (pass == false);

        return num;

    }
}
