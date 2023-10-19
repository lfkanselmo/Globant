
package co.com.tienda.tests;

import co.com.tienda.entidades.Producto;
import co.com.tienda.persistencia.ProductoDAO;
import java.util.List;

public class ProductoDAOListarTest {
    public static void main(String[] args){
        ProductoDAO pDAO = new ProductoDAO();
        String query = "SELECT * FROM producto;";
        
        List<Producto> p = pDAO.listarProductos(query);
        
        System.out.println("Tamañó arreglo resultante: " + p.size());
        
        p.forEach((pr) -> {
            System.out.println(pr);
        });
        
        int n = 22;
        System.out.println("-------------------------------------------------");
        System.out.println("PRODUCTO CON ID: " + n);
        Producto p2 = pDAO.productoById(n);
        System.out.println(p2);
        
    }
}
