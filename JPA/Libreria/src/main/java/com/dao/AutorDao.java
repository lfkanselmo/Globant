package com.dao;

import com.entidades.Autor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class AutorDao extends DAO<Autor> {


    public AutorDao() {

    }

    @Override
    public List<Autor> listar() {
        open();
        jpql = "SELECT A FROM Autor AS A";
        this.em.getTransaction().begin();
        List<Autor> result = this.em.createQuery(jpql).getResultList();
        this.em.getTransaction().commit();
        close();
        return result;
    }

    @Override
    public Autor listarPorId(Long id) {
        open();
        this.em.getTransaction().begin();
        Autor autor = this.em.find(Autor.class, id);
        this.em.getTransaction().commit();
        close();
        return autor;
    }

    @Override
    public List<Autor> listarPorNombre(String nombre) {
        open();
        jpql = "SELECT A FROM Autor AS A WHERE A.nombre=:nombre";
        this.em.getTransaction().begin();
        List<Autor> nombres = this.em.createQuery(jpql).setParameter("nombre", nombre).getResultList();
        this.em.getTransaction().commit();
        close();
        System.out.println(nombres.size());
        return nombres;
    }
}
