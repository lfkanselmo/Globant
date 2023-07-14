package Main;

import Services.VectorService;
import java.util.Arrays;

/**
 *
 * @author Krausser
 */
public class Main {

    public static void main(String[] args) {
        VectorService vs = new VectorService();
        double[] vectorA = vs.fill();

        //mostrar el vector A
        vs.showVector(vectorA);
        System.out.println();
        //ordenar el vector A
        Arrays.sort(vectorA);
        vs.showVector(vectorA);
        System.out.println();
        double[] vectorB = vs.copynumbers(vectorA);
        vs.showVector(vectorB);

    }

}
