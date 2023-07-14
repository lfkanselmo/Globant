
package ejercicio4;

import Entities.Rectangle;
import Services.ServiceRectangle;

/**
 *
 * @author Krausser
 */
public class RectangleApp {
    public static void main(String[] args) {
        ServiceRectangle sr = new ServiceRectangle();
        Rectangle rec = sr.newRectangle();
        sr.surface(rec);
        sr.perimeter(rec);
        sr.drawRectangle(rec);
    }
    
}
