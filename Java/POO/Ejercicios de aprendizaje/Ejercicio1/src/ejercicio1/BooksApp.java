/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. 

 */
package ejercicio1;

import ejercicio1.entities.Book;
import ejercicio1.services.ServicesBook;

/**
 *
 * @author Krausser
 */
public class BooksApp {
    public static void main(String[] args) {
        ServicesBook sb = new ServicesBook();
        Book book1 = sb.newBook();
        
        sb.showBook(book1);
    }
    
}
