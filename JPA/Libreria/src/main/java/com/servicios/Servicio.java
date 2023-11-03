package com.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public abstract class Servicio<T> {
    protected final Scanner read = new Scanner(System.in);

    public Servicio() {

    }

    public abstract void crear();
    public abstract void modificar();
    public abstract  void eliminar();
    public abstract void listarTodos();
    public abstract void listarPorId();
    public abstract void listarPorNombre();

}
