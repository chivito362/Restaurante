/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.Categoria;
import com.equipo10.restaurante.Entidades.DetallePedido;
import com.equipo10.restaurante.Entidades.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class DetallePedidoData {
    /*nsertas el detalle del producto en la tabla pedidodetalle utilizando el ID del pedido existente en el argumento pedido*/
    private Connection con = null;
     
    public DetallePedidoData() {
        con = Conexion.getConexion("restaurante");
        }
        public void crearCategoria(Categoria categoria) {
        con=Conexion.getConexion("restaurante");
    }
public void agregarProductoAlDetalle(Pedido pedido, DetallePedido detalle) {
    String insertDetalleSQL = "INSERT INTO pedidodetalle (id_pedido, id_producto, totalpedido, cantidad) VALUES (?, ?, ?, ?)";
    try (PreparedStatement statement = con.prepareStatement(insertDetalleSQL)) {
           
            PreparedStatement insertDetalleStmt = con.prepareStatement(insertDetalleSQL);
            insertDetalleStmt.setInt(1, pedido.getIdPedido()); // Utiliza el ID del pedido existente
            insertDetalleStmt.setInt(2, detalle.getIdProducto());
            insertDetalleStmt.setDouble(3, detalle.getTotalPedido());
            insertDetalleStmt.setInt(4, detalle.getCantidad());
            insertDetalleStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
public void agregarDetallePedido(DetallePedido detalle) {
    String insertDetalleSQL = "INSERT INTO pedidoDetalle (idpedido, idproducto, cantidad, totalpedido) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(insertDetalleSQL)) {
            
            PreparedStatement insertDetalleStmt = con.prepareStatement(insertDetalleSQL);
            insertDetalleStmt.setInt(1, detalle.getIdPedido());
            insertDetalleStmt.setInt(2, detalle.getIdProducto());
            insertDetalleStmt.setInt(3, detalle.getCantidad());
            insertDetalleStmt.setDouble(4, detalle.getTotalPedido());
            insertDetalleStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
