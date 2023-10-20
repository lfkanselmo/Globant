package co.com.tienda.persistencia;

import co.com.tienda.entidades.Fabricante;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FabricanteDAO extends DAO {

    // Metodo para crear fabricante
    public int crearFabricante(Fabricante fabricante) {

        try {
            query = "INSERT INTO fabricante(nombre) " + "\n"
                    + "VALUES('" + fabricante.getNombreFabricante() + "');";
            conectarBase();
            alterarBD(query);

            if (cambios > 0) {
                System.out.println("Fabricante creado con éxito");
            }

        } catch (Exception e) {
            System.out.println("No se pudo crear fabricante");
        } finally {
            desconectarBase();
        }

        return cambios;
    }

    // Metodo para listar los fabricantes
    public List<Fabricante> listarFabricantes(String queryExter) {
        List<Fabricante> fabricantes = new ArrayList<>();

        try {
            query = queryExter;

            conectarBase();
            consultarBD(query);
            resultSetToFabricanteList(rs, fabricantes);

        } catch (Exception e) {
            System.out.println("No se pudo listar los fabricantes");
        } finally {
            desconectarBase();
        }

        return fabricantes;
    }

    // Metodo para buscar un fabricante según su codigo
    public Fabricante fabricanteById(int id) {
        Fabricante fabricante = null;
        List<Fabricante> fabricantes = new ArrayList<>();

        try {
            query = "SELECT * FROM fabricante WHERE codigo = " + id + ";";
            conectarBase();
            consultarBD(query);
            resultSetToFabricanteList(rs, fabricantes);
            if (!fabricantes.isEmpty()) {
                fabricante = fabricantes.get(0);
            }

        } catch (Exception e) {
            System.out.println("No se pudo traer el Fabricante con codigo " + id);
        } finally {
            desconectarBase();
        }

        return fabricante;
    }
    
    // Metodo para buscar un fabricante según su nombre
    public Fabricante fabricanteByNombre(String nombre) {
        Fabricante fabricante = null;
        List<Fabricante> fabricantes = new ArrayList<>();

        try {
            query = "SELECT * FROM fabricante WHERE nombre = '" + nombre + "';";
            conectarBase();
            consultarBD(query);
            resultSetToFabricanteList(rs, fabricantes);
            if (!fabricantes.isEmpty()) {
                fabricante = fabricantes.get(0);
            }

        } catch (Exception e) {
            System.out.println("No se pudo traer el Fabricante con codigo " + nombre);
        } finally {
            desconectarBase();
        }

        return fabricante;
    }

    // Metodo para modificar fabricante
    public int modificarFabricante(Fabricante fabricante) {

        try {
            query = "UPDATE fabricante " + "\n"
                    + "SET nombre = '" + fabricante.getNombreFabricante() + "'" + "\n"
                    + "WHERE codigo = " + fabricante.getIdFabricante() + ";";

            conectarBase();
            alterarBD(query);
        } catch (Exception e) {
            System.out.println("No se pudo modificar el fabricante con codigo " + fabricante.getIdFabricante() + ";");
        } finally {
            desconectarBase();
        }

        return cambios;
    }

    // Metodo para eliminar fabricante
    public int eliminarFabricante(int id) {

        try {
            query = "DELETE FROM fabricante WHERE codigo = " + id + ";";
            conectarBase();
            alterarBD(query);
        } catch (Exception e) {
            System.out.println("No fue posible eliminar el fabricante con codigo " + id);
        } finally {
            desconectarBase();
        }

        return cambios;
    }

    // Metodo para sacar la información devuelta de la BD y ponerla en un ArrayList
    private void resultSetToFabricanteList(ResultSet r, List<Fabricante> fabricantes) {
        try {
            while (r.next()) {
                int idFabri = r.getInt("codigo");
                String nombreFabri = r.getString("nombre");
                fabricantes.add(new Fabricante(idFabri, nombreFabri));
            }

        } catch (SQLException e) {
            System.out.println("Algo falló con el resultSet");
        }
    }
}
