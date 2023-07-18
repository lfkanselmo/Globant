/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Cliente;
import entities.Rutina;
import java.util.Scanner;
import services.ClienteService;
import services.RutinaService;

/**
 *
 * @author Krausser
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        ClienteService cs = new ClienteService();
        RutinaService rs = new RutinaService();
        
        Cliente cliente1 = new Cliente("1152197943", "Anselmo", 30, 170, 64, "Bajar de peso");
        Cliente cliente2 = new Cliente("1534543543", "Maria", 28, 156, 56, "tonificar");
        Cliente cliente3 = new Cliente("1543545543", "Pedro", 28, 181, 74, "tonificar");
        Cliente cliente4 = new Cliente("1534543543", "Maria", 28, 156, 56, "tonificar");
        Cliente cliente5 = new Cliente("1985432343", "Juan", 28, 160, 59, "tonificar");
        Cliente cliente6 = new Cliente("1512376633", "Gladis", 28, 160, 57, "tonificar");
        
        
        
        Rutina rutina1 = new Rutina("asdasdasd", "Tren superior", 60, 5, "Ejercicio parte superior");
        Rutina rutina2 = new Rutina("asfsadfsd", "Tren inferior", 60, 5, "Estar mamado");
        Rutina rutina3 = new Rutina("qwdncxcsd", "espalda", 60, 5, "Estar mamado");
        Rutina rutina4 = new Rutina("aotyueswd", "gluteos", 60, 5, "Estar mamado");
        Rutina rutina5 = new Rutina("aavvbergd", "cuello", 60, 5, "Estar mamado");
        Rutina rutina6 = new Rutina("asdasdasd", "Tren superior", 60, 5, "Ejercicio parte superior");
        
        cs.registrarCliente(cliente1);
        cs.registrarCliente(cliente2);
        cs.registrarCliente(cliente3);
        cs.registrarCliente(cliente4);
        cs.registrarCliente(cliente5);
        cs.registrarCliente(cliente6);
        
        rs.crearRutina(rutina1);
        rs.crearRutina(rutina2);
        rs.crearRutina(rutina3);
        rs.crearRutina(rutina4);
        rs.crearRutina(rutina5);
        rs.crearRutina(rutina6);
        
        cs.obtenerClientes();
        rs.obtenerRutinas();
        
        cs.actualizarCliente("1512376632", "3456218754", "Miguel", 25, 170, 52, "Estar mamado");
        cs.actualizarCliente("1512376633", "3456218754", "Miguel", 25, 170, 52, "Estar mamado");
        rs.actualizarRutina("asdasdatd", "asbvfxasd", "cardio", 50, 5, "correr mucho");
        rs.actualizarRutina("asdasdasd", "asbvfxasd", "cardio", 50, 5, "correr mucho");
        
        cs.obtenerClientes();
        rs.obtenerRutinas();
        
        cs.eliminar("1512376633");
        cs.eliminar("3456218754");
        rs.eliminarRutina("asdasdasd");
        rs.eliminarRutina("asbvfxasd");
        
        cs.obtenerClientes();
        rs.obtenerRutinas();        
        
    }
    
}
