/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos");
        int n = read.nextInt();
        System.out.println("");
        
        //Dibujar el cuadrado
        draw(n);
    }
    
    //Proceso para dibujar el cuadrado
    public static void draw(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                //Comprobar si está ubicado en el borde
                if ((i!=0 && i!=n-1)&&(j!=0 && j!=n-1)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            //Imprimir el salto de linea
            System.out.println("");
        }
    }
    
}
