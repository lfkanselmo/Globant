
package Model.Entities;


/**
 *
 * @author Krausser
 */
public class CoffeeMaker {
    private double currentCapacity;
    private double maxCapacity;

    public CoffeeMaker() {
    }

    public CoffeeMaker(double currentCapacity, double maxCapacity) {
        this.currentCapacity = currentCapacity;
        this.maxCapacity = maxCapacity;
    }

    public double getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

}
