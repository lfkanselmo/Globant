package Services;

import Entities.Figure;

/**
 *
 * @author Krausser
 */
public class Rectangle extends Figure {

    //Constructores
    public Rectangle() {
    }

    public Rectangle(double h, double base) {
        super(h, base);
    }

    //Metodo para calcular el area
    public double area() {
        return super.getBase() * super.getH();
    }

    //Metodo para calcular el perimetro
    public double perimeter() {
        return (super.getBase() * 2) + (super.getH() * 2);
    }
}
