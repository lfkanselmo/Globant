package com.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public abstract class DAO<T> {

    protected EntityManagerFactory factory;
    protected EntityManager em;
    protected String jpql;

    protected void open() {
        if(!factory.isOpen()){
            factory = Persistence.createEntityManagerFactory("libreria");
        }
        if(!em.isOpen()){
            this.em = factory.createEntityManager();
        }
    }

    protected void close() {
        if(em.isOpen()){
            this.em.close();
        }
        if(factory.isOpen()){
            this.factory.close();
        }
    }

    public void crear(T tipo) throws Exception {
       try{
           open();
           this.em.getTransaction().begin();
           this.em.persist(tipo);
           this.em.getTransaction().commit();
       }catch (Exception e){
           em.getTransaction().rollback();
           throw new Exception(e);
       }finally {
           close();
       }
    }

    ;

    public void modificar(T tipo) {
        open();
        this.em.getTransaction().begin();
        this.em.merge(tipo);
        this.em.getTransaction().commit();
        close();
    }

    ;

    public void eliminar(T tipo) {
        open();
        this.em.getTransaction().begin();
        // No se elimina, se pone en estado inactivo
        this.em.merge(tipo);
        this.em.getTransaction().commit();
        close();
    }

    ;

    public abstract List<T> listar();

    public abstract T listarPorId(Long id);

    public abstract List<T> listarPorNombre(String nombre);


}
