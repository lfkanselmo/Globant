/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package ejercicioextra21;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioExtra21 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int nStudent = 10;
        double note;
        double[] notes = new double[nStudent];
        
        //ingreso de las notas
        for(int i=0; i<nStudent; i++){
            double average = 0;
            boolean pass = true;
            
            //Ingreso nota primer trabajo 
            do{
                System.out.println("Ingrese la nota del primer trabajo práctico evaluativo del estudiante " + (i+1));
                note = read.nextDouble();
                
                //comprobar que la nota sea valida
                if (note>10 || note<0){
                    pass = false;
                    System.out.println("Valor de nota no válido. Ingrese de nuevo la nota");
                    System.out.println("");
                } else{
                    average = average + (note * 0.1);
                    pass = true;
                    System.out.println("");
                }
                
            }while(pass == false);
            
            //Ingreso nota segundo trabajo 
            do{
                System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo del estudiante " + (i+1));
                note = read.nextDouble();
                
                //comprobar que la nota sea valida
                if (note>10 || note<0){
                    pass = false;
                    System.out.println("Valor de nota no válido. Ingrese de nuevo la nota");
                    System.out.println("");
                } else{
                    average = average + (note * 0.15);
                    pass = true;
                    System.out.println("");
                }
                
            }while(pass == false);
            
            //Ingreso nota primer integrador 
            do{
                System.out.println("Ingrese la nota del primer integrador del estudiante " + (i+1));
                note = read.nextDouble();
                
                //comprobar que la nota sea valida
                if (note>10 || note<0){
                    pass = false;
                    System.out.println("Valor de nota no válido. Ingrese de nuevo la nota");
                    System.out.println("");
                } else{
                    average = average + (note * 0.25);
                    pass = true;
                    System.out.println("");
                }
                
            }while(pass == false);
            
            //Ingreso nota segundo integrador 
            do{
                System.out.println("Ingrese la nota del segundo integrador del estudiante " + (i+1));
                note = read.nextDouble();
                
                //comprobar que la nota sea valida
                if (note>10 || note<0){
                    pass = false;
                    System.out.println("Valor de nota no válido. Ingrese de nuevo la nota");
                    System.out.println("");
                } else{
                    average = average + (note * 0.5);
                    pass = true;
                    System.out.println("");
                }
                
            }while(pass == false);
            
            notes[i] = average;
        }
        
        count(notes);
    }
    
    //proceso para contar estudiantes aprobados
    public static void count(double[] vector){
        int approved = 0, reprobate = 0;
        //comprobación
        for(int i=0; i<vector.length; i++){
            if (vector[i]>=7){
                approved++;
            } else{
                reprobate++;
            }
        }
        
        //imprimir resultados
        System.out.println("Cantidad de estudiantes aprobados: " + approved);
        System.out.println("");
        System.out.println("Cantidad de estudiantes reprobados: " + reprobate);
        System.out.println("");
    }
    
}
