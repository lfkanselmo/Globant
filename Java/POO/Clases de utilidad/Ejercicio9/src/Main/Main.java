package Main;

import Entities.Mathematic;
import Services.MathService;

/**
 *
 * @author Krausser
 */
public class Main {

    public static void main(String[] args) {
        MathService ms = new MathService();
        double num1 = Math.random() * 10.5;
        double num2 = Math.random() * 10.5;
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        Mathematic math = new Mathematic(num1, num2);
        System.out.println("El mayor es: " + ms.higher(math));
        System.out.println("El menor es: " + ms.minor(math));
        System.out.println("La potencia es: " + ms.pow(math));
        System.out.println("La raiz es: " + ms.root(math));
    }

}
