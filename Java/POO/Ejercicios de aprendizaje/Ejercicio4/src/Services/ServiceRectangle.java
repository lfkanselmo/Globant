
package Services;

import Entities.Rectangle;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class ServiceRectangle {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    //metodo para crear nuevo rectangulo
    public Rectangle newRectangle(){
        double base = 0, height = 0;
        boolean pass = true;
        do{
            System.out.println("Ingrese el tamaño de la base");
            base = read.nextDouble();
            System.out.println("Ingrese la altura");
            height = read.nextDouble();
            
            //Comprobar valores validos
            if (base<1 || height<1){
                pass = false;
            }else{
                pass = true;
            }
        }while(pass == false);
        
        return new Rectangle(height, base);
    }
    
    //Metodo para calcular y mostrar la superficie del rectangulo
    public void surface(Rectangle rec){
        System.out.println("La superficie del rectángulo es: " + (rec.getBase()*rec.getHeight()));
    }
    
    //Metodo para calcular y mostrar el perimetro del rectangulo
    public void perimeter(Rectangle rec){
        System.out.println("El perimetro del rectángulo es: " + ((rec.getBase()+ rec.getHeight())*2));
    }
    
    //metodo para dibujar el rectangulo
    public void drawRectangle(Rectangle rec){
        int b = (int)(rec.getBase());
        int h = (int)(rec.getHeight());
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < b; j++) {
                if(i!=0 && i!= (h-1) && j!=0 && j!=(b-1)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
