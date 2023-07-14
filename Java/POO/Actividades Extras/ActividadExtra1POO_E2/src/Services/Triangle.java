
package Services;

import Entities.Figure;

/**
 *
 * @author Krausser
 */
public class Triangle extends Figure{

    //Constructores
    public Triangle() {
    }

    public Triangle(double h, double base) {
        super(h, base);
    }
    
    //Metodo para calcular el area
    public double area(){
        return (super.getBase()*super.getH())/2;
    }
    
    //Metodo para calcular el perimetro
    public double perimeter(){
        return super.getBase()*3;
    }
    
}
