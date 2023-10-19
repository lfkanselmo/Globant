package co.com.tienda.tests;

import co.com.tienda.persistencia.Conexion;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionTest {

    public static void main(String[] args) {
        Conexion conTest = Conexion.getInstance();

        try {
            Connection con = conTest.getConnection();
            System.out.println(con);
        } catch (Exception ex) {
            Logger.getLogger(ConexionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
