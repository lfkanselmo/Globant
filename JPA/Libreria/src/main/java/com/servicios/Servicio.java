package com.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public abstract class Servicio {
    protected final Scanner read = new Scanner(System.in);
    protected final EntityManagerFactory factory;
    protected final EntityManager em;

    public Servicio() {
        factory = Persistence.createEntityManagerFactory("libreria");
        this.em = factory.createEntityManager();
    }

    public abstract void crear();
    public abstract void modificar();
    public abstract  void eliminar();
    public abstract void listarTodos();
    public abstract void listarPorId();
    public abstract void listarPorNombre();

    public void close(){
        this.em.close();
        this.factory.close();
    }
}
