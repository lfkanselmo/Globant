
package ejercicio2;

import Entities.Circle;
import java.util.Scanner;
import services.CircleService;

/**
 *
 * @author Krausser
 */
public class Circumference {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        CircleService cs = new CircleService();
        System.out.println("Ingrese el radio de la circunferencia: ");
        int r = read.nextInt();
        System.out.println("");
        Circle c = cs.newCircle(r);
        
        //área
        cs.area(c);
        
        //perimetro
        cs.perimeter(c);
    }
    
}
