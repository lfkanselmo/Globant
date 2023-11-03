package com.servicios;

import com.dao.AutorDao;
import com.entidades.Autor;

import java.util.List;

public class AutorServicio extends Servicio{
    AutorDao dao = new AutorDao();

    public AutorServicio() {
        super();
    }

    public void crear(){

        try {
            System.out.println();
            System.out.println("Ingrese el nombre del autor: ");
            String nombre = read.nextLine();
            Autor autor = new Autor(nombre);
            dao.crear(autor);
        } catch (Exception e) {
            System.out.println("No se pudo crear el Autor");
            System.out.println(e);
        }
    }

    @Override
    public void modificar() {
        System.out.println();
        System.out.println("Ingrese el id del autor a modificar: ");
        Long id = read.nextLong();
        read.skip("\n");
        Autor autor = dao.listarPorId(id);

        if (autor != null){
            System.out.println();
            System.out.println("Ingrese nuevo nombre: ");
            String nuevoNombre = read.nextLine();
            autor.setNombre(nuevoNombre);
            dao.modificar(autor);
        } else {
            System.out.println();
            System.out.println("No existe un Autor con el ID: " + id);
            System.out.println();
        }
    }

    @Override
    public void eliminar() {
        System.out.println();
        System.out.println("Ingrese el id del autor a eliminar: ");
        Long id = read.nextLong();
        read.skip("\n");
        Autor autor = dao.listarPorId(id);

        if(autor != null || autor.getAlta()){
            autor.setAlta(false);
            dao.eliminar(autor);
        } else {
            System.out.println();
            System.out.println("No existe un Autor con el ID: " + id);
            System.out.println();
        }
    }

    @Override
    public void listarTodos() {

        List<Autor> autores = dao.listar();

        if(!autores.isEmpty()){
            autores.forEach(autor -> System.out.println(autor.toString()));
        } else{
            System.out.println();
            System.out.println("No hay autores para mostrar");
            System.out.println();
        }
    }

    @Override
    public void listarPorId() {
        System.out.println();
        System.out.println("Ingrese el id para buscar autor: ");
        Long id = read.nextLong();
        read.skip("\n");
        Autor autor = dao.listarPorId(id);

        if (autor != null){
            System.out.println(autor);
        } else{
            System.out.println();
            System.out.println("No encontrado autor con ID: " + id);
            System.out.println();
        }

    }

    @Override
    public void listarPorNombre() {
        System.out.println();
        System.out.println("Ingrese el nombre para buscar autor: ");
        String nombre = read.nextLine();
        List<Autor> autores = dao.listarPorNombre(nombre);

        if (!autores.isEmpty()){

            autores.forEach((a) -> System.out.println(a.toString()));
        } else{
            System.out.println();
            System.out.println("No encontrado autor con nombre: " + nombre);
            System.out.println();
        }
    }
}
