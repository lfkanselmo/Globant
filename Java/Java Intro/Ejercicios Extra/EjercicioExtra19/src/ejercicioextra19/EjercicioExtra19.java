/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package ejercicioextra19;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra19 {
    public static void main(String[] args) {
        
        int n = 5;
        
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
        fill(vector1);
        fill(vector2);
        show(vector1);
        System.out.println("");
        show(vector2);
        System.out.println("");
        
        System.out.println("¿Son iguales los vectores?: " + check(vector1, vector2));
        
    }
    
    //proceso para mostrar vector
    public static void show(int[] vector){
        for(int i=0; i<vector.length; i++){
            System.out.print("[" + vector[i] + "] ");
        }
    }
    
    //proceso para rellenar los vectores
    public static void fill(int[] vector){
        for (int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*2);
        }
    }
    
    //función para comparar los vectores
    public static boolean check(int[] vector1, int[] vector2){
        for(int i=0; i<vector1.length; i++){
            if(vector1[i] != vector2[i]){
                return false;
            }
        }
        
        return true;
    }
    
}
