/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author 507
 */
public class Book {
    private String title;
    private String autor;
    private Integer copies;
    private Integer borrowed;

    public Book() {
    }

    public Book(String title, String autor, Integer copies) {
        this.title = title;
        this.autor = autor;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Integer getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Integer borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Titulo = " + title + ", Autor = " + autor + ", Ejemplares = " + copies + ", Prestados = " + borrowed;
    }
    
    
}
