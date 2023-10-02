/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.Mesero;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        con = Conexion1.getConexion();
        }
        public void crearMozo(Mesero mesero) {

        String sql = "INSERT INTO mesero (nombre) VALUES (?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mesero.getNombreApellido());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mesero Agregado");
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero" + ex.getMessage());

        }

    }

    
    
    
    
}
