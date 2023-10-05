package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.DetallePedido;
import com.equipo10.restaurante.Entidades.Mesa;
import com.equipo10.restaurante.Entidades.Mesero;
import com.equipo10.restaurante.Entidades.Pedido;
import com.equipo10.restaurante.Entidades.Producto;
import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PedidoData {
    private Connection con=null;

  public PedidoData() {
        con = Conexion.getConexion("restaurante");
    }

  public void agregarPedido(Pedido pedido) {
      Producto producto= new Producto();

        String sql = "INSERT INTO pedido (idMesa, idMesero, Entregado, Pagado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setInt(2,pedido.getMesero().getIdMesero());
            ps.setBoolean(3, pedido.isEntregado());
            ps.setBoolean(4, pedido.isPagado());
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
  
  public void editarPedido(Pedido pedido){
  String sql = "UPDATE alumno SET mesa = ? , mesero = ?, detalle = ?, entregado= ?, pagado= ? WHERE idPedido = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setInt(2, pedido.getMesero().getIdMesero());
            ps.setBoolean(3, pedido.isEntregado());
            ps.setBoolean(4, pedido.isPagado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro pedido");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al pedido ");
        }

    }
  
  public void eliminarPedido(int id){
  try {
            String sql = "UPDATE pedido SET entregado = 0, pagado = 0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó pedido.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder al pedido");
        }
    }
  
  public Pedido buscarPedidoXMesa(int numMesa) {
        Pedido pedido = null;
        String sql = "SELECT idPedido, idMesa, idMesero, entregado, pagado FROM pedido WHERE mesa=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, numMesa);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setMesa(new Mesa (rs.getInt("idMesa")));
                pedido.setMesero(new Mesero(rs.getInt("idMesero")));
                pedido.setEntregado(rs.getBoolean("entregado"));
                pedido.setPagado(rs.getBoolean("pagado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe pedido");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a pedidos");
        }

        return pedido;
    }
  
  public List<Pedido> obtenerPedidosxMesa(int idMesa) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT mesa.* FROM pedido JOIN mesa ON (pedido.idMesa=mesa.idmesa) WHERE idmesa=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Pedido pedido=new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setMesa(new Mesa(rs.getInt("idMesa")));
                pedido.setMesero(new Mesero(rs.getInt("idMesero")));
                pedido.setEntregado(rs.getBoolean("entregado"));
                pedido.setPagado(rs.getBoolean("pagado"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion");
        }
        return pedidos;
    }
  
  public List<Pedido> listarPedido(){
  List<Pedido> pedidos=new ArrayList<>();
  String sql="SELEC * FROM pedido WHERE entregado=1";
  
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Pedido pedido=new Pedido();
            
            pedido.setIdPedido(rs.getInt("idPedido"));
            pedido.setMesa(new Mesa(rs.getInt("idMesa")));
            pedido.setMesero(new Mesero(rs.getInt("idMesero")));
            pedido.setEntregado(rs.getBoolean("Entregado"));
            pedido.setPagado(rs.getBoolean("Entregado"));
            
            pedidos.add(pedido);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a pedidos.");
        }
  
  return pedidos;
  }
}

 
