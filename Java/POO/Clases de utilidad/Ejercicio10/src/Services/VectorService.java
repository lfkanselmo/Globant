package Services;

/**
 *
 * @author Krausser
 */
public class VectorService {

    //Metodo para rellenar vector    
    public double[] fill() {

        int n = 50;
        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (double) (Math.random() * 10);
        }

        return vector;
    }

    //metodo para mostrar vector
    public void showVector(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
    }

    //metodo para copiar los primeros 10 valores de un vector a otro, y rellenar los demás espacios con 0.5
    public double[] copynumbers(double[] vector) {
        int m = 20;
        double[] finalVector = new double[m];

        //rellenar
        for (int i = 0; i < m; i++) {
            if (i <= 9) {
                finalVector[i] = vector[i];
            } else {
                finalVector[i] = 0.5;
            }
        }
        return finalVector;
    }
}
