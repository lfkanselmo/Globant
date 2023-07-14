/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Cursos;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cursos curso = new Cursos();
    private double gananciaCursos = 0;

    //Metodo main
    public Cursos[] cursosProfe(int cantidad) {
        Cursos[] cursosProfe = new Cursos[cantidad];
        for (int i = 0; i < cursosProfe.length; i++) {
            cursosProfe[i] = crearCurso();
            System.out.println("La ganancia del curso es: " + calcularGananciaSemanal());
            gananciaCursos += calcularGananciaSemanal();
        }

        System.out.println("Las ganancias totales profe: " + gananciaCursos);

        return cursosProfe;
    }

    //Metodo para crear curso
    public Cursos crearCurso() {

        boolean pass = true;

        System.out.println("Ingrese nombre del curso");
        curso.setCursoNombre(leer.nextLine());
        System.out.println();
        
        //Comprobar cantidad horas
        System.out.println("Ingrese la cantidad de horas por día del curso");
        do {
            
            curso.setHorasDiarias(leer.nextInt());

            if (curso.getHorasDiarias() > 6 || curso.getHorasDiarias() < 1) {
                System.out.println("Número de horas no válido");
                pass = false;
            } else {
                pass = true;
            }
        } while (pass == false);

        System.out.println();

        //Comprobar cantidad de dias por semana
        System.out.println("Ingrese la cantidad de días por semana del curso");
        do {
            curso.setDiasSemanales(leer.nextInt());

            if (curso.getDiasSemanales() > 5 || curso.getDiasSemanales() < 1) {
                System.out.println("Número de días no válido");
                pass = false;
            } else {
                pass = true;
            }
        } while (pass == false);
        System.out.println();
        System.out.println("Ingrese el turno del curso: D (día) / T (tarde)");

        do {

            curso.setTurno(leer.next().toUpperCase());
            if (!curso.getTurno().equals("D") && !curso.getTurno().equals("T")) {
                System.out.println("Valor erroneo");
                pass = false;
            } else {
                pass = true;
            }
        } while (pass == false);

        System.out.println();
        
        //comprobación valor de horas
        System.out.println("Ingrese el precio por hora del curso");
        do{
            curso.setPrecioPorHora(leer.nextDouble());
            if (curso.getPrecioPorHora()<1) {
                System.out.println("Ingrese un valor positivo");
                pass = false;
            } else {
                pass = true;
            }
        }while(pass == false);
        System.out.println();
        curso.setAlumnos(cargarAlumnos());

        return curso;
    }

    //Metodo para cargar alumnos
    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];

        leer.skip("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre de alumno " + i+1);

            alumnos[i] = leer.nextLine();
            System.out.println();
        }

        return alumnos;
    }

    //Metodo para calcular la ganancia semanal
    public double calcularGananciaSemanal() {
        return curso.getDiasSemanales() * curso.getHorasDiarias() * curso.getPrecioPorHora() * 5;

    }
}
