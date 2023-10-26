package co.com.tienda.persistencia;

import co.com.tienda.entidades.Fabricante;
import co.com.tienda.entidades.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO extends DAO {

    private final FabricanteDAO fDAO = new FabricanteDAO();

    // Metodo para crear un producto
    public int crearProducto(Producto producto) {

        try {
            query = "INSERT INTO producto(nombre,precio,codigo_fabricante)" + "\n"
                    + "VALUES('" + producto.getNombreProducto() + "',"
                    + producto.getPrecioProducto() + ","
                    + producto.getFabricante().getIdFabricante() + ");";

            conectarBase();
            alterarBD(query);


        } catch (Exception e) {
            System.out.println("No se pudo crear el producto");
        } finally {
            desconectarBase();
        }

        return cambios;
    }

    // Metodo para listar todos los productos
    public List<Producto> listarProductos(String queryExter) {

        List<Producto> productos = new ArrayList<>();

        try {
            query = queryExter;
            conectarBase();
            consultarBD(query);
            resultSetToProductoList(rs, productos);
        } catch (Exception e) {
            System.out.println("No se puedo listar correctamente");
        } finally {
            desconectarBase();
        }

        return productos;

    }

    // Metodo para traer un producto por su codigo
    public Producto productoById(int id) {
        Producto producto = null;
        List<Producto> productos = new ArrayList<>();

        try {
            query = "SELECT * FROM producto WHERE codigo = " + id + ";";
            conectarBase();
            consultarBD(query);
            resultSetToProductoList(rs, productos);
            if (!productos.isEmpty()) {
                producto = productos.get(0);
            }
        } catch (Exception e) {
            System.out.println("no se pudo traer el Producto con codigo " + id);
        } finally {
            desconectarBase();
        }

        return producto;
    }

    // Metodo para modificar producto
    public int modificarProducto(Producto producto) {

        try {
            query = "UPDATE producto" +
                    " SET nombre = '" + producto.getNombreProducto() + "'," +
                    " precio = " + producto.getPrecioProducto() + "," +
                    " codigo_fabricante = " + producto.getFabricante().getIdFabricante() +
                    " WHERE codigo = " + producto.getIdProducto() + ";";

            conectarBase();
            alterarBD(query);
        } catch (Exception e) {
            System.out.println("No se pudo moficar el producto con codigo " + producto.getIdProducto());
        } finally {
            desconectarBase();
        }

        return cambios;
    }

    // Metodo para eliminar productos
    public int eliminarProducto(int id) {
        try {
            query = "DELETE FROM producto WHERE codigo = " + id + ";";
            conectarBase();
            alterarBD(query);
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el producto");
        } finally {
            desconectarBase();
        }

        return cambios;
    }

    // Metodo para sacar la información devuelta de la BD y ponerla en un ArrayList
    private void resultSetToProductoList(ResultSet r, List<Producto> productos) {

        try {
            while (r.next()) {
                int idProd = r.getInt("codigo");
                String nombreProd = r.getString("nombre");
                double precioProd = r.getDouble("precio");
                int codFabri = r.getInt("codigo_fabricante");
                Fabricante fabri = fDAO.fabricanteById(codFabri);

                productos.add(new Producto(idProd, nombreProd, precioProd, fabri));

            }
        } catch (SQLException ex) {
            System.out.println("El resultSet no funcionó");
            System.out.println(ex);
        }

    }

}
