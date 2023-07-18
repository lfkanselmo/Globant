/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class ClienteService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private static ArrayList<Cliente> clientes = new ArrayList();

    //Metodo para registrar cliente
    public void registrarCliente(Cliente cliente) {
        int i = buscar(cliente.getId());
        if (i == -1) {
            clientes.add(cliente);
            System.out.println("Cliente agregado con exito");
            System.out.println("");
        } else {
            System.out.println("El cliente ya existe en el registro, no es posible agregarlo de nuevo");
            System.out.println("");
        }

    }

    //Metodo para obtener todos los clientes
    public void obtenerClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
        System.out.println("");
    }

    //Metodo para actualizar cliente
    public void actualizarCliente(String idAnterior, String id, String nombre, int edad, int altura, double peso, String objetivo) {
        Cliente newCliente = new Cliente(id, nombre, edad, altura, peso, objetivo);
        int i = buscar(idAnterior);

        if (i != -1) {
            clientes.remove(i);
            clientes.add(i, newCliente);
            System.out.println("Cliente actualizado con exito");
            System.out.println("");
        } else {
            System.out.println("Cliente a actualizar no existe dentro del registro. Actualización fallida");
            System.out.println("");
        }
    }

    //Metodo para eliminar cliente
    public void eliminar(String id) {
        int i = buscar(id);
        if (i != -1) {
            clientes.remove(i);
            System.out.println("Cliente con id: " + id + " eliminado con exito");
            System.out.println("");
        } else {
            System.out.println("No es posible eliminar, no existe un cliente con ese ID en el registro");
            System.out.println("");
        }
    }

    //Metodo para buscar dentro del arreglo por id
    public int buscar(String id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;

    }

}
