package Services;

import Entities.Figure;

/**
 *
 * @author Krausser
 */
public class Square extends Figure {

    //constructores
    public Square() {
    }

    public Square(double h, double base) {
        super(h, base);
    }

    //Metodo para calcular el area del cuadrado
    public double area() {
        return super.getBase() * super.getH();
    }

    //Metodo para calcular el perimetro del cuadrado
    public double perimeter() {
        return (super.getBase() * 2) + (super.getH() * 2);
    }
}
