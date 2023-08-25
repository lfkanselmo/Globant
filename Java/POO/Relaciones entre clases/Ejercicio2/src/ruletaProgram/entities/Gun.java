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
public class Gun {

    private int currentPosition;
    private int bulletPosition;

    public Gun() {
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public int getBulletPosition() {
        return bulletPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    @Override
    public String toString() {
        return "Posición actual = " + currentPosition + ", Posición del agua = " + bulletPosition;
    }

    //Metodo llenar el revolver
    public void fillGun() {
        currentPosition = (int) (Math.random() * 8 + 1);
        bulletPosition = (int) (Math.random() * 8 + 1);
    }
    
    //metodo mojar
    public boolean wet(){
        return currentPosition == bulletPosition;
    }
    
    //metodo siguiente chorro
    public void nextBullet(){
        if (currentPosition != 8) {
            currentPosition = currentPosition + 1;
        } else{
            currentPosition = 1;
        }
    }

}
