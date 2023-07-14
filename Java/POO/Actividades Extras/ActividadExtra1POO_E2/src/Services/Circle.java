
package Services;

/**
 *
 * @author Krausser
 */
public class Circle {
    private double r;

    //Constructores
    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }
    
    //Metodo para calcular el area
    public double area(){
        return Math.PI * Math.pow(r, 2);
    }
    
    //Metodo para calcular el perimetro
    public double perimeter(){
        return Math.PI * 2 * r;
    }
}
