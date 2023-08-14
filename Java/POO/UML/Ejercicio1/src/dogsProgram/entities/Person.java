/*
 */
package dogsProgram.entities;

/**
 *
 * @author Krausser
 */
public class Person {
   private String personName;
   private String personLastName;
   private int personAge;
   private String id;
   private Dog dog;

    public Person() {
    }

    public Person(String personName, String personLastName, int personAge, String id) {
        this.personName = personName;
        this.personLastName = personLastName;
        this.personAge = personAge;
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Nombre = " + personName + ", Apellido = " + personLastName + ", Edad = " + personAge + ", Identificación = " + id + "\n Perro = " + dog;
    }
   
   
}
