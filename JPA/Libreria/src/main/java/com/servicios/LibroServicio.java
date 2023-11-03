package com.servicios;

import com.dao.AutorDao;
import com.dao.EditorialDao;
import com.dao.LibroDao;
import com.entidades.Autor;
import com.entidades.Editorial;
import com.entidades.Libro;

public class LibroServicio extends Servicio<Libro> {

    LibroDao daoLibro = new LibroDao();
    AutorDao daoAutor = new AutorDao();
    EditorialDao daoEditorial = new EditorialDao();

    @Override
    public void crear() {
        try{
            System.out.println();
            System.out.println("Ingrese el ISBN del libro: ");
            Long isbn = read.nextLong();
            read.skip("\n");
            System.out.println();
            Libro libro = daoLibro.listarPorId(isbn);
            if (libro == null) {
                System.out.println("Ingrese el titulo del libro: ");
                String titulo = read.nextLine();
                System.out.println();
                System.out.println("Ingrese el año de publicación: ");
                Integer anhos = read.nextInt();
                System.out.println();
                System.out.println("Ingrese el número de ejemplares: ");
                Integer ejemplares = read.nextInt();
                System.out.println();
                System.out.println("Ingrese el número de ejemplares prestados: ");
                Integer ejemplaresPrestados = read.nextInt();
                System.out.println();
                Integer ejemplaresRestantes = ejemplares - ejemplaresPrestados;
                boolean alta = true;
                Autor autor = traerAutor();
                Editorial editorial = traerEditorial();
                libro = new Libro(isbn, titulo, anhos, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial);
                daoLibro.crear(libro);
            } else {
                libro.setAlta(true);
                daoLibro.modificar(libro);
            }
        }catch (Exception e){
            System.out.println("No fue posible crear el libro");
            System.out.println(e);
        }
    }

    private Editorial traerEditorial() {
        Editorial editorial = null;
        while (editorial == null) {
            System.out.println();
            System.out.println("Ingrese el ID de la editorial del libro: ");
            Long idEditorial = read.nextLong();
            editorial = daoEditorial.listarPorId(idEditorial);

            if (editorial == null) {
                System.out.println();
                System.out.println("No existe una editorial con ID: " + idEditorial);
                System.out.println();
            }
        }
        return editorial;
    }

    private Autor traerAutor() {
        Autor autor = null;
        while (autor == null) {
            System.out.println();
            System.out.println("Ingrese el ID del Autor del libro: ");
            Long idAutor = read.nextLong();
            autor = daoAutor.listarPorId(idAutor);

            if (autor == null) {
                System.out.println();
                System.out.println("No existe un autor con ID: " + idAutor);
                System.out.println();
            }
        }
        return autor;
    }


    @Override
    public void modificar() {

    }

    @Override
    public void eliminar() {
        System.out.println("Ingrese el ISBN del libro a eliminar: ");
        Long idLibro = read.nextLong();
        Libro libro = daoLibro.listarPorId(idLibro);
        if (libro != null && libro.getAlta() != false) {
            daoLibro.eliminar(libro);
        } else {
            System.out.println();
            System.out.println("No hay libro con ID: " + idLibro);
            System.out.println();
        }
    }

    @Override
    public void listarTodos() {

    }

    @Override
    public void listarPorId() {

    }

    @Override
    public void listarPorNombre() {

    }
}
