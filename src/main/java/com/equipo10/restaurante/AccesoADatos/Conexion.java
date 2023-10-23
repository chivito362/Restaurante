
package com.equipo10.restaurante.AccesoADatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    private Conexion() {
    } 

        public static Connection getConexion (String DB) {
                try {
                    Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers! " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos " + ex.getMessage());
            }
                
            
        return connection;
            
    }
        
        public static int comprobar_acceso(String usuario){
        try {
            Connection conn=Conexion.getConexion("restologin");
            
            String sql="SELECT acceso FROM usuarios where usuario=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet resultado=ps.executeQuery();
            
            while(resultado.next()){
                return resultado.getInt("acceso");
            }
            } catch (SQLException ex) {
            ex.fillInStackTrace();
            return -1;
        }
    return -1;
}
    public static boolean comprobar_datos(String usuario,String pw){
        try {
            Connection conn=Conexion.getConexion("restologin");
            
            String sql="SELECT usuario,contrasenia,estado FROM usuarios";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet resultado=ps.executeQuery();
            
            while(resultado.next()){
                if(resultado.getString("usuario").equals(usuario)&& resultado.getInt("estado")==1){
                    if(resultado.getString("contrasenia").equals(pw)){
                        JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
                        return true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                        return false;
                    }
                }
            }
            
        } catch (SQLException ex) {
            ex.fillInStackTrace();
            return false;
        }
        JOptionPane.showMessageDialog(null, "El usuario no se encuentra Registrdo");
        return false;
    }
}
