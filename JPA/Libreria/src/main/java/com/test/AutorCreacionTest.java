package com.test;

import com.entidades.Autor;
import com.servicios.AutorServicio;
import com.servicios.Servicio;

public class AutorCreacionTest {
    public static void main(String[] args) {
        Servicio s = new AutorServicio();

        s.listarTodos();
        s.listarPorNombre();
        s.listarTodos();
        s.close();
    }
}
