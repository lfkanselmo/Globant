
package ejercicio1.services;

import ejercicio1.entities.Book;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class ServicesBook {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    
    public Book newBook(){
        System.out.println("Ingrese el ISBN: ");
        int isbn = read.nextInt();
        System.out.println("");
        System.out.println("Ingrese el título: ");
        String title = read.next();
        System.out.println("");
        System.out.println("Ingrese el autor: ");
        String autor = read.next();
        System.out.println("");
        System.out.println("Ingrese la cantidad de páginas: ");
        int pages = read.nextInt();
        System.out.println("");
        
        return new Book(isbn, title, autor, pages);
    }
    
    public void showBook(Book b){
        System.out.println("ISBN: " + b.getSibn());
        System.out.println("");
        System.out.println("Título: " + b.getTitle());
        System.out.println("");
        System.out.println("Autor: " + b.getAutor());
        System.out.println("");
        System.out.println("Páginas: " + b.getPages());
        System.out.println("");
    }
}
