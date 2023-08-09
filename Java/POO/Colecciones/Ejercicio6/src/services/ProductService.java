/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Product;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class ProductService {

    private Product product;
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Double> products = new HashMap<String, Double>();
    private boolean found;

    //Metodo para iniciar el programa
    public void startProgram() {
        boolean exit = false;

        System.out.println();
        System.out.println("*****  BIENVENIDO *****");
        System.out.println();

        do {
            int opc = menu();
            read.skip("\n");
            System.out.println();

            switch (opc) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updatePrice();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showAllProduct();
                    break;
                case 5:
                    exit = true;
                    System.out.println();
                    System.out.println("**** PROGRAMA TERMINADO ****");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opción ingresada no válida. Intente de nuevo");
                    System.out.println();
                    break;
            }
        } while (exit == false);
    }

    //Metodo para el menú
    private int menu() {

        System.out.println("Elija la opción deseada");
        System.out.println("1. Agregar producto");
        System.out.println("2. Modificar precio de producto");
        System.out.println("3. Eliminar un producto");
        System.out.println("4. Mostrar todos los productos");
        System.out.println("5. Salir");
        System.out.println();
        return validation("");

    }

    //Metodo para agregar producto
    private void addProduct() {
        product = new Product();
        System.out.println("Ingrese el producto: ");
        product.setName(read.nextLine());
        System.out.println();
        product.setPrice((double) (validation("Ingrese el precio: ")));
        System.out.println();

        products.put(product.getName(), product.getPrice());
    }

    //metodo para actualizar el precio de un producto
    private void updatePrice() {
        System.out.println("Ingrese el producto al que le desea actualizar el precio");
        String prod = read.nextLine();
        found = false;

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(prod)) {
                entry.setValue((double) (validation("Ingrese el nuevo precio del producto " + entry.getKey())));
                found = true;
            }
        }

        if (found) {
            System.out.println();
            System.out.println("Precio del producto actualizado");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Producto no encontrado, no es posible actulizar precio");
            System.out.println();
        }
    }

    //Metodo para eliminar un producto
    private void deleteProduct() {
        System.out.println("Ingrese el producto que desea eliminar");
        String prod = read.nextLine();
        found = false;

        if (products.remove(prod) != null) {
            System.out.println("Eliminado con exito");
            System.out.println();
        } else {
            System.out.println("No fue posible elimiarlo. Producto no encontrado");
            System.out.println();
        }

    }

    //metodo para mostrar los productos
    private void showAllProduct() {
        System.out.println("Productos: ");

        for (Map.Entry<String, Double> produc : products.entrySet()) {
            System.out.println("Producto: " + produc.getKey() + ", Precio: " + produc.getValue());
        }
        System.out.println();
    }

    //Función para validar ingreso de número
    private int validation(String cadena) {
        int num = 0;
        boolean pass = false;

        do {
            try {
                System.out.println(cadena);
                num = read.nextInt();
                pass = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor ingresado no númerico. Intente de nuevo");
                pass = false;
                read.next();
            }

        } while (pass == false);

        return num;
    }
}
