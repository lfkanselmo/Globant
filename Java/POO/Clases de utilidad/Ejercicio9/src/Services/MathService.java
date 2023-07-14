package Services;

import Entities.Mathematic;

/**
 *
 * @author Krausser
 */
public class MathService {

    //Metodo para devolver el mayor
    public double higher(Mathematic math) {
        //Si son iguales retornar cero
        if (math.getNum1() > math.getNum2()) {
            return math.getNum1();
        } else if (math.getNum1() < math.getNum2()) {
            return math.getNum2();
        } else {
            return 0.0;
        }
    }

    //Metodo para devolver el menor
    public double minor(Mathematic math) {
        //Si son iguales retornar cero
        if (math.getNum1() > math.getNum2()) {
            return math.getNum2();
        } else if (math.getNum1() < math.getNum2()) {
            return math.getNum1();
        } else {
            return 0.0;
        }
    }

    //Metodo para calcular la potencia del número mayor elevado al menor
    public double pow(Mathematic math) {
        int higher = 0;
        int minor = 0;

        if (math.getNum1() > math.getNum2()) {
            higher = (int) (math.getNum1());
            minor = (int) (math.getNum2());

            return Math.pow(higher, minor);

        } else if (math.getNum1() < math.getNum2()) {
            higher = (int) (math.getNum2());
            minor = (int) (math.getNum1());

            return Math.pow(higher, minor);
        } else {
            return 0;
        }
    }

    //Metodo para calcula la raiz del menor valor del objeto
    public double root(Mathematic math) {
        double number = Math.abs(minor(math));
        return Math.sqrt(number);
    }

}
