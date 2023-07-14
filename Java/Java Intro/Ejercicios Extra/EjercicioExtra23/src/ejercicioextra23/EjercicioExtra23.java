/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada. 
 */
package ejercicioextra23;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra23 {
    public static void main(String[] args) {
        int n = 20;
        String[][] wordSearch = new String[n][n];
        
        addWords(wordSearch);
        show(wordSearch);
    }
    
    //procedimiento para imprimir la matriz
    public static void show(String[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println("");
        }
    }
    
    //rellenar la matriz con letras aleatorias
    public static void ranLetterFill(String[][] matrix){
        String[] randomLetter = {"A","B","C","D","E","F","G","H","I","J","K","L",
                                 "M","N","O","P","Q","R","S","T","U","V","W","X",
                                 "Y","Z"};
        
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                //matrix[i][j] = randomLetter[(int)(Math.random()*26)].toLowerCase();
                matrix[i][j] = " ";
            }
        }
    }
    
    //Generar vector con las posiciones de las filas
    public static int[] generateV(){
        int n = 5;
        int[] vector = new int[n];
        
        //Rellenar el vector con valores aleatorios
        for (int i=0; i<n; i++){
            vector[i] = (int)(Math.random()*20);
            
            //Verificar si el vector ya tiene por lo menos un elemento
            if (i>0){
                //Comprobar que no haya elementos repetidos
                for (int j=i-1; j>=0; j--){
                    if (vector[i] == vector[j]){
                        i--;
                        break;
                    }
                }
            }
        }
        return vector;
    }
    
    
    //rellenar la matriz con las palabras ingresadas
    public static void addWords(String[][] matrix){
        Scanner read = new Scanner(System.in);
        String word;
        int z, pInit, lon;
        boolean pass;
        String[] numbers = {"0","2","3","4","5","6","7","8","9"};
        
        //rellenar la sopa de letras con letras al azar
        ranLetterFill(matrix);
        //generar posiciones aleatorias para las filas donde entraran las palabras
        int[] crowPosiVector = generateV();
                
        for (int i=0; i<5; i++){
            lon = 0;
            
            //ingreso y verificación de palabra
            do{
                pass = true;
                System.out.println("Ingrese palabra: ");
                word = read.nextLine().toUpperCase();
                System.out.println("");
                
                //Comprobar si la palabra es válida
                lon = word.length();
                if (lon>5 || lon<3){
                    System.out.println("Palabra no válida");
                    System.out.println("");
                    pass = false;
                } else{
                    for(int h=0; h<numbers.length; h++){
                        if (word.contains(numbers[h])){
                            System.out.println("Palabra no válida. No debe tener números");
                            System.out.println("");
                            pass = false;
                            break;
                        }
                    }
                }
            }while(pass==false);
            
            //generar número aleatorio para la columna de inicio de la palabra
            pInit = (int)(Math.random()*(matrix.length-5));
            
            //posisicionar palabra en la matriz
            z = 0;
            
            //acomodar las palabras caracter por caracter en las columnas
            for(int j=0; j<matrix[0].length; j++){
                //comprobar el lugar donde se va a incertar la palabra
                if (j>=pInit && j<=(pInit+(lon-1))){
                    matrix[crowPosiVector[i]][j] = word.substring(z,z+1);
                    z++;
                }
            }
            
        }
    }
    
}
