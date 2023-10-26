package co.com.tienda.view;

import co.com.tienda.servicios.FabricanteService;
import co.com.tienda.servicios.ProductoService;
import java.util.Scanner;

public class menuApp {

    private static final Scanner read = new Scanner(System.in);

    public static void startApp() {
        menu();
    }

    private static void menu() {
        System.out.println("");
        System.out.println("******** BIENVENIDO ********");
        boolean run = true;

        do {
            System.out.println();
            System.out.println("Elija una opción: ");
            System.out.println("1. Listar los nombres de los productos");
            System.out.println("2. Listar los nombres y precios de los productos");
            System.out.println("3. Listar los productos entre 2 precios");
            System.out.println("4. Listar los productos buscando por nombre");
            System.out.println("5. Listar nombre y precio de producto más barato");
            System.out.println("6. Ingresar nuevo producto");
            System.out.println("7. Ingresar nuevo fabricante");
            System.out.println("8. Editar producto");
            System.out.println("9. Salir");
            System.out.println();
            String opc = read.nextLine();

            switch (opc) {
                case "1":
                    ProductoService.listarNombreProductos();
                    run = true;
                    break;

                case "2":
                    ProductoService.listarProductosNombreYPrecio();
                    run = true;
                    break;

                case "3":
                    try {
                        System.out.println("Ingrese el primer limite de precio: ");
                        double pre1 = read.nextDouble();
                        
                        System.out.println("Ingrese el segundo limite de precio: ");
                        double pre2 = read.nextDouble();
                        

                        if (pre1 <= pre2) {
                            ProductoService.listarEntreDosPrecios(pre1, pre2);
                        } else {
                            ProductoService.listarEntreDosPrecios(pre2, pre1);
                        }

                    } catch (Exception e) {
                        System.out.println();
                        System.out.println("Debe ingresar valores apropiados");
                        System.out.println(e);
                    }
                    run = true;
                    break;

                case "4":
                    System.out.println("Ingrese nombre del producto a buscar: ");
                    String palabra = read.nextLine();
                    ProductoService.listarPorNombreBuscado(palabra);
                    run = true;
                    break;

                case "5":
                    ProductoService.listarProductoMenorPrecio();
                    run = true;
                    break;

                case "6":
                    ProductoService.crearProducto();
                    run = true;
                    break;

                case "7":
                    FabricanteService.crearFabricante();
                    run = true;
                    break;

                case "8":
                    ProductoService.modificarProducto();
                    run = true;
                    break;

                case "9":
                    System.out.println();
                    System.out.println("******** ADIOS ********");
                    run = false;
                    break;

                default:
                    System.out.println("Ingrese una opción del menú correcta");
                    run = true;
                    break;
            }

        } while (run);
    }

}
