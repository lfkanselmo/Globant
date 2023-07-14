/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Krausser
 */
public class Ahorcado {

    private String palabra;
    private int cLetra;
    private int cJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int cLetra, int cJugadas) {
        this.palabra = palabra;
        this.cLetra = cLetra;
        this.cJugadas = cJugadas;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getcLetra() {
        return cLetra;
    }

    public void setcLetra(int cLetra) {
        this.cLetra = cLetra;
    }

    public int getcJugadas() {
        return cJugadas;
    }

    public void setcJugadas(int cJugadas) {
        this.cJugadas = cJugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", cLetra=" + cLetra + ", cJugadas=" + cJugadas + '}';
    }

}
