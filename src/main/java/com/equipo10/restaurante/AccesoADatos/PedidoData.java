/*
package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PedidoData {
    private Connection con=null;

    public PedidoData() {
        con = Conexion.getConexion();
    }

  public void agregarPedido(Pedido pedido) {

        String sql = "INSERT INTO pedido (idMesa, idMesero, idProducto, totalPedido, Entregado, Pagado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setInt(2,pedido.getMesero().getIdMesero());
            ps.setArray(3, pedido.getProductos().t);
            ps.setDouble(4, pedido.getTotalPedido());
            ps.setBoolean(5, pedido.isEntregado());
            ps.setBoolean(6, pedido.isPagado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
            //    System.out.println(pedido.getIdpedido());
                JOptionPane.showMessageDialog(null, "Pedido añadido con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar pedido ");
        }
    }
    
}
*/