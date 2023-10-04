
package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProductoData {
   private Connection con;

    public ProductoData() {
        this.con = Conexion.getConexion("restaurante");
    }
   
   public void guardarProcuto(Producto p){
    String sql="INSERT INTO producto (Nombre, Cantidad, Precio, categoria, estado) VALUES (?,?,?,?,?)";
    
       try {
           PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, p.getNombre());
           ps.setInt(2, p.getCantidad());
           ps.setDouble(3, p.getPrecio());
           ps.setString(4, p.getCategoria());
           ps.setBoolean(5, true);
           int r=ps.executeUpdate();
           ResultSet rs=ps.getGeneratedKeys();
           if(r==1){
               p.setIdProducto(rs.getInt(1));
               JOptionPane.showMessageDialog(null, "Producto cargado");
           }
           ps.close();
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al Guardar");
       }
}
   public void eliminarProducto(int id){
       String sql="UPDATE producto SET estado=0 WHERE idProducto=?";
       try {
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1, id);
           int r=ps.executeUpdate();
           
           if(r==1){
               JOptionPane.showMessageDialog(null, "Producto eliminado");
           }else{
               JOptionPane.showMessageDialog(null, "Error al Eliminar");
           }
           ps.close();  
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al Eliminar");
       }
       
       
   }
   
   public void actualizarProducto(Producto p){
       String sql="UPDATE producto SET Nombre=?,Cantidad=?,Precio=?,categoria=?,estado=? WHERE idProducto=?";
       try {
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1, p.getNombre());
           ps.setInt(2, p.getCantidad());
           ps.setDouble(3, p.getPrecio());
           ps.setString(4, p.getCategoria());
           ps.setBoolean(5, p.isEstado());
           ps.setInt(6, p.getIdProducto());
           int r=ps.executeUpdate();

           if(r==1){
               JOptionPane.showMessageDialog(null, "Producto Actualizado");
           }else{
               JOptionPane.showMessageDialog(null, "error al Actualizar");
           }
           ps.close();
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "error al Actualizar");
       }
       
   }
   public Producto TraerProducto(int id){
       String sql="SELECT producto.*, categorias.nombre AS CateNom FROM producto, categorias WHERE producto.idCategoria = categorias.idCategoria and idProducto=?";
       try {
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs=ps.executeQuery();
           
           if(rs.next()){
               Producto p=new Producto();
               p.setNombre(rs.getString("Nombre"));
               p.setPrecio(rs.getDouble("Precio"));
               p.setCantidad(rs.getInt("CantidadenStock"));
               p.setEstado(true);
               p.setCategoria(rs.getString("CateNom"));
               return p;
           }else{
               JOptionPane.showMessageDialog(null, "No existe el producto");
           }
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al traer el producto");
       }
       return null;
   }
   public List<Producto> listarProductos(){
       ArrayList<Producto> productos=new ArrayList<>();
       String sql="SELECT producto.*, categorias.nombre AS CateNom FROM producto, categorias WHERE producto.idCategoria = categorias.idCategoria";
      try {
           PreparedStatement ps=con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           
           while(rs.next()){
               Producto p=new Producto();
               p.setNombre(rs.getString("Nombre"));
               p.setPrecio(rs.getDouble("Precio"));
               p.setCantidad(rs.getInt("CantidadenStock"));
               p.setEstado(true);
               p.setCategoria(rs.getString("CateNom"));
               productos.add(p);
           }
           return productos;
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al traer el producto");
       }
       return null;
       
   }
   
}
