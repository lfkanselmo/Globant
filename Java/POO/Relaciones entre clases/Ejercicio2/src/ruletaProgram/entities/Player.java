/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletaProgram.entities;

/**
 *
 * @author Krausser
 */
public class Player {
    private int id;
    private String name = "Jugador";
    private boolean wet = false;

    public Player() {
    }

    public Player(int id) {
        this.id = id;
        this.name = this.name.concat(String.valueOf(id));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }

    @Override
    public String toString() {
        return "Jugador = " + name + ", ¿Mojado? = " + wet;
    }
    
    //Metodo disparo
    public boolean shoot(Gun revolver){
        this.wet = revolver.wet();
        revolver.nextBullet();
        
        return isWet();
    }
    
}
