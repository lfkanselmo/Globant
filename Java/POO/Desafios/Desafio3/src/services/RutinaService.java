/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class RutinaService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private static ArrayList<Rutina> rutinas = new ArrayList();

    //Metodo para crear la rutina
    public void crearRutina(Rutina rutina) {
        int i = buscar(rutina.getId());
        if (i == -1) {
            rutinas.add(rutina);
            System.out.println("Rutina agregada con exito");
            System.out.println("");
        } else {
            System.out.println("La rutina ya existe, no es posible agregarla de nuevo");
            System.out.println("");
        }
    }

    //Metodo para obtener todas las rutinas
    public void obtenerRutinas() {
        for (Rutina rutina : rutinas) {
            System.out.println(rutina.toString());
        }
        System.out.println("");
    }

    //Metodo para actualizar la rutina
    public void actualizarRutina(String idAnterior, String id, String nombre, int duracion, int nivelDificultad, String descripcion) {
        //nueva rutina a ingresar
        Rutina newRutina = new Rutina(id, nombre, duracion, nivelDificultad, descripcion);

        //Comprobar si el indicativo de la rutina que será reemplazada si está en el arreglo
        int i = buscar(idAnterior);

        if (i != -1) {
            rutinas.remove(i);
            rutinas.add(i, newRutina);
            System.out.println("Rutina actualiza con exito!!");
            System.out.println("");
        } else {
            System.out.println("El identificador a reemplazar no existe dentro del arreglo");
            System.out.println("");
        }

    }

    //Metodo para elimar rutina
    public void eliminarRutina(String id) {
        int i = buscar(id);
        if (i != -1) {
            rutinas.remove(i);
            System.out.println("Rutina con id: " + id + " elimina con exito!!");
            System.out.println("");
        } else {
            System.out.println("El id ingresado no corresponde a ninguna rutina en el arreglo, no se puede eliminar");
            System.out.println("");
        }
    }

    //Metodo para buscar dentro del arreglo por id
    public int buscar(String id) {
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;

    }
}
