package com.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Boolean alta;

    public Autor() {
    }

    public Autor(String nombre) {
        this.nombre = nombre;
        this.alta = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "[" + "\n" +
                "id: " + id + "\n" +
                ", nombre: '" + nombre + "\n" +
                ", alta: " + alta + "]";
    }
}
