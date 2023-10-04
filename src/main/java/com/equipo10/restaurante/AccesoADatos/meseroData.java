/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Cometto
 */
public class meseroData {
    /* private int idMesero;
    private String nombreApellido;
    private List<Pedido> pedido;
    private Mesa mesa;
    */
    //●	Los meseros pueden listar pedidos cobrados en el día. Anular pedidos. 
    //●	Listar los pedidos que cobro un mesero en particular en el día.
    //●	Cada pedido es cobrado por un mesero y cada mesero cobra muchos pedidos.
      private Connection con = null;
      public meseroData() {
        con = Conexion.getConexion();
        }
        public void crearMozo(Mesero mesero) {

        String sql = "INSERT INTO mesero (nombreyapellido) VALUES (?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mesero.getNombreApellido());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mesero Agregado");
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero" + ex.getMessage());

        }}
        
        public List<Mesero> listarMozos() {
        List<Mesero> meseros = new ArrayList<>();
                
        if (con != null) {
            try {
                String consulta = "SELECT * FROM mesero";
                PreparedStatement statement = con.prepareStatement(consulta);
                ResultSet resultado = statement.executeQuery();
                while (resultado.next()) {
                    int idMesero = resultado.getInt("id_mesero");
                    String nombreApellido = resultado.getString("nombre_apellido");
  
                    Mesero mesero = new Mesero(idMesero, nombreApellido, new ArrayList<>(), null);
                    meseros.add(mesero);
                }
                resultado.close();
                statement.close();
                con.close();
            } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, " EXPLOTÓ" + e.getMessage());

            }
        }
        return meseros;
    }




  

    
    
    
    
}
