/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejercicioextra2;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Valor de A: ");
        int a = read.nextInt();
        System.out.println("Valor de B: ");
        int b = read.nextInt();
        System.out.println("Valor de C: ");
        int c = read.nextInt();
        System.out.println("Valor de D: ");
        int d = read.nextInt();
        System.out.println("");
        
        change(a,b,c,d);
    }
    
    //procedimiento para cambiar las posiciones
    public static void change(int a, int b, int c, int d){
        int aux = 0;
        aux = a;
        a = d;
        d = b;
        b = c;
        c = aux;
        
        System.out.print("A = ");
        System.out.println(a);
        System.out.print("B = ");
        System.out.println(b);
        System.out.print("C = ");
        System.out.println(c);
        System.out.print("D = ");
        System.out.println(d);
    }
}
