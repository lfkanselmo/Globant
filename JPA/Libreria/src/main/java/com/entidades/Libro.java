package com.entidades;

import jakarta.persistence.*;

@Entity
public class Libro {
    @Id
    private Long isbn;
    private String titulo;
    private Integer anho;
    private Integer ejemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    private Boolean alta;
    @OneToOne
    private Autor autor;
    @OneToOne
    private Editorial editorial;
}
