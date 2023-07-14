/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package ejercicioextra20;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra20 {
    public static void main(String[] args) {
        int n = 10;
        int[] vector = new int[n];
        vector = fill(vector);
        show(vector);
    }
    
    //función para rellenar vector
    public static int[] fill(int[] vector){
        for(int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*10);
        }
        
        return vector;
    }
    
    //procedimiento para mostrar el vector
    public static void show(int[] vector){
        for(int i=0; i<vector.length; i++){
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }
}
