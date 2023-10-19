
package co.com.tienda.tests;

import co.com.tienda.entidades.Fabricante;
import co.com.tienda.entidades.Producto;
import co.com.tienda.persistencia.FabricanteDAO;
import co.com.tienda.persistencia.ProductoDAO;

public class ProductoDAOCrearTest {
    public static void main(String[] args){
        ProductoDAO pd = new ProductoDAO();
        FabricanteDAO fd = new FabricanteDAO();
        
        Fabricante f = fd.fabricanteById(4);
        
        /*
        Nombre: Disco SSD 512 TB
        Precio: 130.99
        Fabricante: Samsung
        */
        
        Producto p = new Producto("Disco SSD 512 TB", 130.99, f);
        
        pd.crearProducto(p);
        
    }
}
