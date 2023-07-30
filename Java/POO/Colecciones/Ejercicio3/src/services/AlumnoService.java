/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class AlumnoService {

    Alumno alumno = new Alumno();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<Alumno> alumnos = new ArrayList();
    boolean exit = false, switchBreaker = false;

    public void inicio() {

        do {
            System.out.println("");
            System.out.println("Ingrese nombre de alumno: ");
            alumno.setName(read.nextLine());
            System.out.println("");

            System.out.println("");
            System.out.println("***************** Ingrese notas *****************");
            System.out.println("");

            Integer[] notas = new Integer[3];

            for (int i = 0; i < alumno.getNotes().length; i++) {
                System.out.println("ingrese nota: ");
                notas[i] = read.nextInt();
                if (notas[i] > 5 || notas[i] < 0) {
                    System.out.println("Nota no válida, ingrese notas entre 0 - 5");
                    i--;
                }
            }
            read.skip("\n");

            alumno.setNotes(notas);

            alumnos.add(alumno);

            do {
                System.out.println("");
                System.out.println("¿Desea agregar otro alumno?  S/N ");

                switch (read.nextLine().toLowerCase()) {
                    case "n":
                        System.out.println("");
                        System.out.println("Ingreso de estudiantes finalizado...");
                        System.out.println("");
                        exit = true;
                        switchBreaker = true;
                        break;

                    case "s":
                        System.out.println("");
                        exit = false;
                        switchBreaker = true;
                        break;

                    default:
                        System.out.println();
                        System.out.println("Valor ingresado no válido");
                        switchBreaker = false;
                        break;
                }
            } while (switchBreaker == false);

        } while (exit == false);

    }

    public void notaFinal(String alumnoName) {

        boolean found = false;

        for (Alumno alumno : alumnos) {
            if (alumno.getName().equals(alumnoName)) {
                System.out.println("La nota final del estudiante "
                        + alumno.getName() + " es: " + calculoNota(alumno.getNotes()));
                found = true;
                break;
            }
        }
        
        if (found == false) {
            System.out.println("No existe ese alumno en la lista");
        }
    }

    private double calculoNota(Integer[] notes) {

        Double sum = 0.0;
        for (Integer note : notes) {
            sum += note;
        }

        return sum / notes.length;
    }
}
