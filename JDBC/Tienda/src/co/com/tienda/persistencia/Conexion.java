package co.com.tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Conexion conexion;
    private Connection con;
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    private Conexion() {

    }

    public static Conexion getInstance() {
        if (conexion == null) {
            conexion = new Conexion();
        }

        return conexion;
    }

    public Connection getConnection() throws Exception {

        try {
            Class.forName(DRIVER);
            String urlBD = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            con = DriverManager.getConnection(urlBD, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            throw e;
        }

        return con;
    }

}
