/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Krausser
 */
public class Alumno {

    private String name;
    private Integer[] notes = new Integer[3];

    public Alumno() {
    }

    public Alumno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getNotes() {
        return notes;
    }

    public void setNotes(Integer[] notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Alumno{" + "name=" + name + '}';
    }

}
