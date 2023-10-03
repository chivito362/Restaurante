
package com.equipo10.restaurante.AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion1 {
    
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "restaurante";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    private Conexion1(){}
    
    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
//connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadg27","root","");
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers! " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos " + ex.getMessage());
            }
        }
        return connection;
    }
}
