
package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class CategoriaData {

   
      private Connection con = null;
      public CategoriaData() {
        con = Conexion.getConexion();
        }
        public void crearCategoria(Categoria categoria) {
        con=Conexion.getConexion();
    }
    
    public int obtenerIdCategoriaPorNombre(String nombreCategoria) {
        int idCategoria = -1; // Valor predeterminado en caso de no encontrar la categoría.

        String sql = "SELECT idCategoria FROM categorias WHERE nombre = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, nombreCategoria);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                idCategoria = resultSet.getInt("idCategoria");
            }
            statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en la Tabla Categoria");
        }

        return idCategoria;
    }
    
    public String obtenerNombreCategoriaPorId(int idCategoria) {
        String nombreCategoria = null; // Valor predeterminado en caso de no encontrar la categoría.

        String sql = "SELECT nombre FROM categorias WHERE idCategoria = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, idCategoria);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                nombreCategoria = resultSet.getString("nombre");
            }
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error en la Tabla Categoria");
        }

        return nombreCategoria;
    }
}
