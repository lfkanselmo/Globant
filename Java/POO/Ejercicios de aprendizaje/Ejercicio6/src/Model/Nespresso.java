
package Model;

import Model.Entities.CoffeeMaker;
import Model.Services.CoffeeMakerService;

/**
 *
 * @author Krausser
 */
public class Nespresso {
    public static void main(String[] args) {
        CoffeeMakerService cms = new CoffeeMakerService();
        CoffeeMaker cm1 = cms.newCoffeeMaker();
        cms.fillCoffeeMaker(cm1);
        System.out.println("Café actual: " + cm1.getCurrentCapacity());
        cms.emptyCoffeeMaker(cm1);
        cms.addCoffee(cm1);
        System.out.println("Café actual: " + cm1.getCurrentCapacity());
        cms.serveCup(cm1, 500);
    }
    
}
