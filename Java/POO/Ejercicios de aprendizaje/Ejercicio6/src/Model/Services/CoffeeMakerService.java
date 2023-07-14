
package Model.Services;

import Model.Entities.CoffeeMaker;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class CoffeeMakerService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    //Metodo para crear una nueva cafetera
    public CoffeeMaker newCoffeeMaker(){
        CoffeeMaker cm = new CoffeeMaker();
        System.out.println("Ingrese la cantidad máxima de la cafetera");
        cm.setMaxCapacity(read.nextDouble());
        System.out.println("Ingrese la cantidad actual de la cafetera");
        cm.setCurrentCapacity(read.nextDouble());
        return cm;
    }
    
    //Metodo para llenar la cafetera
    public void fillCoffeeMaker(CoffeeMaker cm){
        cm.setCurrentCapacity(cm.getMaxCapacity());
    }
    
    //Metodo para servir taza
    public void serveCup(CoffeeMaker cm, double cupSize){
        if (cm.getCurrentCapacity()<cupSize) {
            double porcent = (cm.getCurrentCapacity()*100)/cupSize;
            System.out.println("No hay café suficiente. La taza se llenó un " + porcent + "%");
        } else{
            cm.setCurrentCapacity(cm.getCurrentCapacity()-cupSize);
            System.out.println("Llenado de taza exitoso");
        }
    }
    
    //Metodo para vaciar la cafetera
    public void emptyCoffeeMaker(CoffeeMaker cm){
        cm.setCurrentCapacity(0);
    }
    
    //Metodo para agregar café
    public void addCoffee(CoffeeMaker cm){
        System.out.println("ingrese la cantidad de café que desea agregar");
        double coffee = read.nextDouble();
        if ((cm.getCurrentCapacity()+ coffee)>cm.getMaxCapacity()) {
            System.out.println("Cantidad de café excede el máximo de la cafetera");
            coffee = cm.getMaxCapacity()-cm.getCurrentCapacity();
            System.out.println("Se agregarán " + coffee + " de café para llenar la cafetera");
        } else{
            cm.setCurrentCapacity(cm.getCurrentCapacity()+coffee);
            System.out.println("Adición de café exitosa");
        }
    }
}
