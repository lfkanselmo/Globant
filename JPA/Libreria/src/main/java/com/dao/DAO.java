package com.dao;

import java.util.List;

public interface DAO<T> {

    void crear(T tipo);
    void modificar(T tipo);
    void eliminar(T tipo);
    List<T> listar();
    T listarPorId(Long id);

    List<T> listarPorNombre(String nombre);
}
