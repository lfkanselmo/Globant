
package Entities;

import java.util.Date;

/**
 *
 * @author Krausser
 */
public class Person {
    private String name;
    private Date BornDate;

    public Person() {
    }

    public Person(String name, Date BornDate) {
        this.name = name;
        this.BornDate = BornDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBornDate() {
        return BornDate;
    }

    public void setBornDate(Date BornDate) {
        this.BornDate = BornDate;
    }
    
    

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", BornDate=" + BornDate + '}';
    }
    
    
    
}
