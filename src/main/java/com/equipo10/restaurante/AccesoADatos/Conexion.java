package com.equipo10.restaurante.AccesoADatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private  static final String url = "jdbc:mariadb://localhost:3306/";
    private static final String usuario = "root";
    private static final String contrasenia= "";
    private static Connection conexion;

    private Conexion() {
    } 

       // String db=restaurante;
        public static Connection getConexion (String db) {
            
           
                
                try {
                    Class.forName("org.mariadb.jdbc.Driver");
                    
                    //establecer la conexion
                    
                    return DriverManager.getConnection(url+db, usuario, contrasenia);
                            
                            } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error de driver");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error de conexion");
                }
                
            
        return null;
            
    }
        
}