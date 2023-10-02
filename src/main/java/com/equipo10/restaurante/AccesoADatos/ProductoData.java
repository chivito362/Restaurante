
package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.Producto;
import java.sql.Connection;
import java.util.List;


public class ProductoData {
   private Connection con;

    public ProductoData() {
        this.con = Conexion.getConexion();
    }
   
   public void guardarProcuto(Producto prod){
    
}
   public void eliminarProducto(int id){
       
   }
   public void actualizarProducto(int id){
       
   }
   public Producto TraerProducto(int id){
       
   }
   public List<Producto> listarProductos(){
       
       return null;
       
   }
   
}
