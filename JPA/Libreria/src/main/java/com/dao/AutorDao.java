package com.dao;

import com.entidades.Autor;
import jakarta.persistence.EntityManager;

import java.util.List;

public class AutorDao implements DAO<Autor>{

    private EntityManager em;
    private String jpql;

    public AutorDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public void crear(Autor autor) {
        this.em.getTransaction().begin();
        this.em.persist(autor);
        this.em.getTransaction().commit();
    }

    @Override
    public void modificar(Autor autor) {
        this.em.getTransaction().begin();
        this.em.merge(autor);
        this.em.getTransaction().commit();
    }

    @Override
    public void eliminar(Autor autor) {
        this.em.getTransaction().begin();
        // No se elimina, se pone en estado inactivo
        this.em.merge(autor);
        this.em.getTransaction().commit();
    }

    @Override
    public List<Autor> listar() {
        jpql = "SELECT A FROM Autor AS A";
        this.em.getTransaction().begin();
        List<Autor> result = this.em.createQuery(jpql).getResultList();
        this.em.getTransaction().commit();
        return result;
    }

    @Override
    public Autor listarPorId(Long id) {
        this.em.getTransaction().begin();
        Autor autor = this.em.find(Autor.class, id);
        this.em.getTransaction().commit();
        return autor;
    }

    @Override
    public List<Autor> listarPorNombre(String nombre) {
        jpql = "SELECT A FROM Autor AS A WHERE A.nombre=:nombre";
        this.em.getTransaction().begin();
        List<Autor> nombres = this.em.createQuery(jpql).setParameter("nombre", nombre).getResultList();
        this.em.getTransaction().commit();
        return nombres;
    }
}
