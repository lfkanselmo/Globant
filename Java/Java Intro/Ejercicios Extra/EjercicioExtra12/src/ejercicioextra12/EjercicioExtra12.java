/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
 */
package ejercicioextra12;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra12 {
    public static void main(String[] args) {
        
        String iS, jS, kS;
        
        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                for (int k=0; k<10; k++){
                    //convertir la i
                    if (i==3){
                        iS = "E";
                    } else{
                        iS = String.valueOf(i);
                    }
                    
                    //convertir la j
                    if (j==3){
                        jS = "E";
                    } else{
                        jS = String.valueOf(j);
                    }
                    
                    //convertir la k
                    if (k==3){
                        kS = "E";
                    } else{
                        kS = String.valueOf(k);
                    }
                    
                    //imprimir
                    System.out.println(iS + "-" + jS + "-" + kS);
                }
            }
        }
    }
    
}
