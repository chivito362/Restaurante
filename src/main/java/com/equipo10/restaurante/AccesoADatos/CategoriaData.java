/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.Categoria;
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
public class CategoriaData {
   
      private Connection con = null;
      public CategoriaData() {
        con = Conexion.getConexion();
        }
        public void crearCategoria(Categoria categoria) {

        String sql = "INSERT INTO categorias (nombre,estado) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoria.getNombreCategoria());
            ps.setBoolean(2, true);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Categoría Agregada");
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Categorias" + ex.getMessage());

        }}
        
        public void eliminarCategoria(int id) {

        try {
            String sql = "UPDATE categorias SET estado = 0 WHERE idCategoria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Categoría eliminada");
            }else{
                JOptionPane.showMessageDialog(null, " Categoría no encontrada");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Categorias");
        }
    }
        
        public List<Categoria> listarCategorias() {
        List<Categoria> categorias = new ArrayList<>();
                
        if (con != null) {
            try {
                String consulta = "SELECT * FROM categorias";
                PreparedStatement statement = con.prepareStatement(consulta);
                ResultSet resultado = statement.executeQuery();
                while (resultado.next()) {
                    int idCategoria = resultado.getInt("idCategoria");
                    String nombreCat = resultado.getString("nombreCategoria");
  
                    Categoria cate = new Categoria(idCategoria, nombreCat);
                    categorias.add(cate);
                }
                resultado.close();
                statement.close();
                con.close();
            } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, " EXPLOTÓ" + e.getMessage());

            }
        }
        return categorias;
    }




  

    
    
    
    
}
