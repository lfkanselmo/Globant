package co.com.tienda.servicios;

import co.com.tienda.entidades.Fabricante;
import co.com.tienda.entidades.Producto;
import co.com.tienda.persistencia.ProductoDAO;
import java.util.List;
import java.util.Scanner;

public class ProductoService {

    private static String query;
    private static ProductoDAO daoP = new ProductoDAO();
    private static int nm;
    private static String nombre;
    private static double precio;
    private static Fabricante fabricante;
    private static final Scanner read = new Scanner(System.in);

    // Crear un producto
    public static void crearProducto() {
        try {
            System.out.println();
            System.out.println("Ingrese el nombre del producto: ");
            nombre = read.nextLine();
            System.out.println("Ingrese el precio del producto: ");
            precio = read.nextDouble();
            System.out.println("Ingrese el codigo del fabricante de este producto: ");
            int id = read.nextInt();
            fabricante = FabricanteService.getFabricanteById(id);

            if (fabricante != null) {
                nm = daoP.crearProducto(new Producto(nombre, precio, fabricante));
                if (nm != 0) {
                    System.out.println("Se creó " + nm + " producto");
                } else {
                    System.out.println("No se crearon productos");
                }
            } else {
                System.out.println("No hay fabricante con ese código, no es posible crear el Producto");
            }

        } catch (Exception e) {
            System.out.println("No es posible crear el producto");
            System.out.println();
            System.out.println(e);
        }
    }

    // Listar todos los productos
    public static void listarProductos() {
        query = "SELECT * FROM producto;";
        List<Producto> productos = daoP.listarProductos(query);

        if (!productos.isEmpty()) {
            System.out.println();
            System.out.println("********* PRODUCTOS *********");
            productos.forEach((p) -> {
                System.out.println(p);
            });
        } else {
            System.out.println("No hay productos para mostrar");
        }
    }

    // Listar productos mostrando nombre y precio
    public static void listarProductosNombreYPrecio() {
        query = "SELECT * FROM producto;";
        List<Producto> productos = daoP.listarProductos(query);

        if (!productos.isEmpty()) {
            System.out.println();
            System.out.println("********* PRODUCTOS *********");
            productos.forEach((p) -> {
                System.out.println("Nombre: " + p.getNombreProducto() + "\n"
                        + "Precio: " + p.getPrecioProducto() + "\n");
            });
        } else {
            System.out.println("No hay productos para mostrar");
        }
    }

    // Listar productos con precio comprendido entre 2 valores
    public static void listarEntreDosPrecios(int n1, int n2) {
        query = "SELECT * FROM producto "
                + "WHERE precio BETWEEN " + n1 + " AND " + n2 + ";";

        List<Producto> productos = daoP.listarProductos(query);
        if (!productos.isEmpty()) {
            System.out.println();
            System.out.println("********* PRODUCTOS CON PRECIO ENTRE " + n1 + " y " + n2 + " *********");
            productos.forEach((p) -> {
                System.out.println(p);
            });
        } else {
            System.out.println("No hay productos para mostrar");
        }
    }

    // Listar productos que contengan la palabra ingresada en el nombre
    public static void listarPorNombreBuscado(String palabra) {
        query = "SELECT * FROM producto "
                + "WHERE nombre LIKE '%" + palabra + "%';";

        List<Producto> productos = daoP.listarProductos(query);

        if (!productos.isEmpty()) {
            System.out.println();
            System.out.println("********* PRODUCTOS CON " + palabra.toUpperCase() + " EN EL NOMBRE" + " *********");
            productos.forEach((p) -> {
                System.out.println(p);
            });
        } else {
            System.out.println("No hay productos para mostrar");
        }
    }

    // Listar producto que tenga el menor precio
    public static void listarProductoMenorPrecio() {
        query = "SELECT * FROM producto "
                + "WHERE precio = (SELECT MIN(precio) FROM producto);";

        List<Producto> productos = daoP.listarProductos(query);

        if (!productos.isEmpty()) {
            System.out.println();
            System.out.println("********* PRODUCTOS CON MENOR PRECIO *********");
            productos.forEach((p) -> {
                System.out.println(p);
            });
        } else {
            System.out.println("No hay productos para mostrar");
        }
    }

    // Modificar un producto
    public static void modificarProducto() {
        System.out.println();
        System.out.println("Ingrese el codigo del producto que desea modificar: ");
        int codigo = read.nextInt();

        Producto producto = daoP.productoById(codigo);

        if (producto != null) {
            boolean run = true;
            String nombreViejo = producto.getNombreProducto().toUpperCase();
            do {
                System.out.println();
                System.out.println("PRODUCTO: " + nombreViejo);
                System.out.println();
                System.out.println("Seleccione para modificar: ");
                System.out.println("1. Nombre");
                System.out.println("2. Precio");
                System.out.println("3. Fabricante");
                System.out.println("4. Terminar la modificación");
                System.out.println();
                String opc = read.next();
                read.skip("\n");

                switch (opc) {
                    case "1":
                        try {
                            System.out.println();
                            System.out.println("Nombre actual: " + producto.getNombreProducto());
                            System.out.println("Ingrese nuevo nombre para el producto: ");
                            String nombre = read.nextLine();
                            producto.setNombreProducto(nombre);
                            System.out.println("Nombre modificado con éxtio");
                        } catch (Exception e) {
                            System.out.println("No se pudo modificar el nombre");
                            System.out.println(e);
                        }

                        run = true;
                        break;
                    case "2":

                        try {
                            System.out.println();
                            System.out.println("Precio actual: " + producto.getPrecioProducto());
                            System.out.println("Ingrese nuevo precio para el producto: ");
                            double precio = read.nextDouble();
                            read.skip("\n");
                            producto.setPrecioProducto(precio);
                            System.out.println("Precio modificado con éxtio");
                        } catch (Exception e) {
                            System.out.println("No se pudo modificar el precio");
                            System.out.println(e);
                        }

                        run = true;
                        break;

                    case "3":
                        try {
                            System.out.println();
                            System.out.println("Codigo de fabricante actual: " + producto.getFabricante().getIdFabricante());
                            System.out.println("Ingrese nuevo codigo de fabricante para el producto");
                            int codigoFa = read.nextInt();
                            read.skip("\n");
                            Fabricante f = FabricanteService.getFabricanteById(codigoFa);
                            if (f != null) {
                                producto.setFabricante(f);
                                System.out.println("Código de fabricante modificado con éxtio");
                            } else {
                                System.out.println("El fabricante con codigo " + codigoFa
                                        + " no existe. No se pudo modificar el codigo de fabricante");
                            }

                        } catch (Exception e) {
                            System.out.println("Ingreso no válido");
                            System.out.println(e);
                        }

                        run = true;
                        break;

                    case "4":
                        System.out.println("****** FIN DE MODIFICACIÓN ******");
                        System.out.println();
                        System.out.println(producto);
                        run = false;
                        break;
                    default:
                        System.out.println("Elija una opción válida");
                        run = true;
                        break;
                }
            } while (run);

            nm = daoP.modificarProducto(producto);
            if (nm != 0) {
                System.out.println("Se modificó " + nm + " producto");
            } else {
                System.out.println("No se modificaron productos");
            }

        } else {
            System.out.println("No existe un producto con el codigo ingresado...");
        }

    }

}
