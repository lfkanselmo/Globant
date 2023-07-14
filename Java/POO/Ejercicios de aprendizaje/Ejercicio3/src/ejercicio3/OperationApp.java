
package ejercicio3;

import Entities.Operation;
import Services.ServiceOperation;

/**
 *
 * @author Krausser
 */
public class OperationApp {
    public static void main(String[] args) {
        ServiceOperation so = new ServiceOperation();
        Operation op = so.newOperation();
        
        System.out.println("Suma de los números " + op.getNum1() + " y " 
                + op.getNum2() + " es: " + so.sum(op.getNum1(), op.getNum2()));
        
        System.out.println("");
        System.out.println("Resta de los números " + op.getNum1() + " y " 
                + op.getNum2() + " es: " + so.subtra(op.getNum1(), op.getNum2()));
        
        System.out.println("");
        System.out.println("Multiplicación de los números " + op.getNum1() + " y " 
                + op.getNum2() + " es: " + so.multi(op.getNum1(), op.getNum2()));
        
        System.out.println("División de los números " + op.getNum1() + " y " 
                + op.getNum2() + " es: " + so.div(op.getNum1(), op.getNum2()));
        
        
    }
    
}
