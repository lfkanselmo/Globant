
package Entities;

/**
 *
 * @author Krausser
 */
public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String type;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int year, String type) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "brand=" + brand + ", model=" + model + ", year=" + year + ", type=" + type + '}';
    }
    
    
}
