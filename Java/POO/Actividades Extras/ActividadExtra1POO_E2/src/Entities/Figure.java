
package Entities;

/**
 *
 * @author Krausser
 */
public class Figure {
    private double h;
    private double base;

    public Figure() {
    }
    
    

    public Figure(double h, double base) {
        this.h = h;
        this.base = base;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "figure{" + "h=" + h + ", base=" + base + '}';
    }
    
    
}
