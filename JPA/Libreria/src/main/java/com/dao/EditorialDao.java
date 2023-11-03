package com.dao;



import com.entidades.Editorial;

import java.util.List;

public class EditorialDao extends DAO<Editorial>{
    @Override
    public List<Editorial> listar() {
        open();
        jpql = "SELECT E FROM Editorial AS E";
        this.em.getTransaction().begin();
        List<Editorial> result = this.em.createQuery(jpql).getResultList();
        this.em.getTransaction().commit();
        close();
        return result;
    }

    @Override
    public Editorial listarPorId(Long id) {
        open();
        this.em.getTransaction().begin();
        Editorial editorial = this.em.find(Editorial.class, id);
        this.em.getTransaction().commit();
        close();
        return editorial;
    }

    @Override
    public List<Editorial> listarPorNombre(String nombre) {
        open();
        jpql = "SELECT A FROM Autor AS A WHERE A.nombre=:nombre";
        this.em.getTransaction().begin();
        List<Editorial> editoriales = this.em.createQuery(jpql).setParameter("nombre", nombre).getResultList();
        this.em.getTransaction().commit();
        close();
        return editoriales;
    }
}
