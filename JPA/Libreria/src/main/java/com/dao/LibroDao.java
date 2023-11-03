package com.dao;

import com.entidades.Libro;

import java.util.List;

public class LibroDao extends DAO<Libro>{
    @Override
    public List<Libro> listar() {
        open();
        jpql = "SELECT E FROM Editorial AS E";
        this.em.getTransaction().begin();
        List<Libro> result = this.em.createQuery(jpql).getResultList();
        this.em.getTransaction().commit();
        close();
        return result;
    }

    @Override
    public Libro listarPorId(Long id) {
        open();
        this.em.getTransaction().begin();
        Libro libro = this.em.find(Libro.class, id);
        this.em.getTransaction().commit();
        close();
        return libro;
    }

    @Override
    public List<Libro> listarPorNombre(String nombre) {
        open();
        jpql = "SELECT A FROM Autor AS A WHERE A.nombre=:nombre";
        this.em.getTransaction().begin();
        List<Libro> libros = this.em.createQuery(jpql).setParameter("nombre", nombre).getResultList();
        this.em.getTransaction().commit();
        close();
        return libros;
    }
}
