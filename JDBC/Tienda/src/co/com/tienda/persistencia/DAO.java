/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tienda.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Krausser
 */
public abstract class DAO {

    protected Connection con;
    protected ResultSet rs;
    protected Statement st;
    protected String query;
    protected int cambios;
    protected Conexion conexion = Conexion.getInstance();

    protected void conectarBase() throws Exception {
        con = conexion.getConnection();
        st = null;
        rs = null;
    }

    protected void desconectarBase() {
        try {

            if (st != null) {
                st.close();
            }

            if (rs != null) {
                rs.close();
            }

            if (con != null) {
                con.close();
                con = null;
            }
        } catch (Exception e) {
            System.out.println("Error en la desconección");
        }
    }

    protected void consultarBD(String querySQL) {

        try {
            st = con.createStatement();
            rs = st.executeQuery(querySQL);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    protected void alterarBD(String querySQL) {
        try {
            cambios = 0;
            st = con.createStatement();
            cambios = st.executeUpdate(querySQL);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
