/*
 */
package dogsProgram.entities;

/**
 *
 * @author Krausser
 */
public class Dog {
    private String dogName;
    private String breed;
    private int dogAge;
    private double size;

    public Dog() {
    }

    public Dog(String dogName, String breed, int dogAge, double size) {
        this.dogName = dogName;
        this.breed = breed;
        this.dogAge = dogAge;
        this.size = size;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Nombre = " + dogName + ", Raza = " + breed + ", Edad = " + dogAge + ", Tamaño = " + size;
    }
    
    
    
}
