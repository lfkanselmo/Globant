package co.com.tienda.servicios;

import co.com.tienda.entidades.Fabricante;
import co.com.tienda.persistencia.FabricanteDAO;
import java.util.Scanner;

public class FabricanteService {

    private static String query;
    private static FabricanteDAO daoF = new FabricanteDAO();
    private static String nombre;
    private static int nm;
    private static final Scanner read = new Scanner(System.in);

    // Crear un fabricante
    public static void crearFabricante() {
        try {
            System.out.println("Ingrese el nombre del fabricante: ");
            nombre = read.nextLine();

            if (daoF.fabricanteByNombre(nombre) == null) {

                nm = daoF.crearFabricante(new Fabricante(nombre));
                if (nm != 0) {
                    System.out.println("Se creó " + nm + " fabricante");
                } else {
                    System.out.println("No se crearon productos");
                }

            }else{
                System.out.println("El fabricante " + nombre + " ya existe. No pudo ser creado");
            }
        } catch (Exception e) {
            System.out.println("No fue posible crear el fabricante");
            System.out.println(e);
        }
    }

    // Retornar un fabricante con su codigo
    public static Fabricante getFabricanteById(int id) {
        return daoF.fabricanteById(id);
    }

}
