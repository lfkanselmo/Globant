
package services;

import Entities.Circle;

/**
 *
 * @author Krausser
 */
public class CircleService {
    
    //Crear nueva circunferencia
    public Circle newCircle(double r){
        return new Circle(r);
    }
    
    //Mostrar el area de la circunferencia
    public void area(Circle c){
        System.out.println("El área de la circunferencia es: " + (Math.PI * Math.pow(c.getRadio(), 2)));
    }
    
    //Mostrar el perimetro de la circunferencia
    public void perimeter(Circle c){
        System.out.println("El perimetro de la circunferencia es: " + (2 * Math.PI * c.getRadio()));
    }
    
}
