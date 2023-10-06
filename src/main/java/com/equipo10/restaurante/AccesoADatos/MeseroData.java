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
public class MeseroData {

    private Connection con = null;

    public MeseroData() {
        con = Conexion.getConexion();
    }

    public void crearMozo(Mesero mesero) {

        String sql = "INSERT INTO mesero (nombreyapellido, estado) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mesero.getNombreApellido());
            ps.setBoolean(2, mesero.getEstado());
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Mesero Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "Algo salió mal");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero" + ex.getMessage());
        }
    }

    public void modificarMozo(Mesero mozo) {
        String consulta = "UPDATE mesero SET nombreyapellido=?,estado=? WHERE idMesero=?;";
        if (con != null) {
            try {
                PreparedStatement ps = con.prepareStatement(consulta);
                ps.setString(1, mozo.getNombreApellido());
                ps.setBoolean(2, mozo.getEstado());
                ps.setInt(3, mozo.getIdMesero());
                int fila = ps.executeUpdate();
                if (fila == 1) {
                    JOptionPane.showMessageDialog(null, "Mesero modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "Algo salió mal");
                }
                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero" + ex.getMessage());

            }
        }
    }

    public Mesero buscarMozoxId(int idMozo) {
        Mesero mozo = null;
        String consulta = "SELECT * FROM `mesero` WHERE idMesero=?";
        if (con != null) {
            try {
                PreparedStatement ps = con.prepareStatement(consulta);
                ps.setInt(1, idMozo);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    mozo = new Mesero();
                    mozo.setIdMesero(idMozo);
                    mozo.setNombreApellido(rs.getString("nombreyapellido"));
                    mozo.setEstado(rs.getBoolean("estado"));
                } else {
                    JOptionPane.showMessageDialog(null, "Mesero no encontrado");
                    ps.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero" + ex.getMessage());

            }

        }
        return mozo;
    }

    public void eliminarMozo(int idMozo) {
        if (con != null) {
            try {
                String consulta = "UPDATE mesero SET estado=0 WHERE idMesero=?";
                PreparedStatement ps = con.prepareStatement(consulta);
                ps.setInt(1, idMozo);
                int fila = ps.executeUpdate();
                if (fila == 1) {
                    JOptionPane.showMessageDialog(null, "Mesero Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Id No encontrada");

                }
                ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, " EXPLOTÓ" + e.getMessage());

            }
        }
    }

    public List<Mesero> listarMozos() {
        List<Mesero> meseros = new ArrayList<>();

        if (con != null) {
            try {
                String consulta = "SELECT * FROM mesero";
                PreparedStatement statement = con.prepareStatement(consulta);
                ResultSet resultado = statement.executeQuery();
                while (resultado.next()) {
                    int idMesero = resultado.getInt("idmesero");
                    String nombreApellido = resultado.getString("nombreyapellido");
                    boolean estado = resultado.getBoolean("estado");
                    Mesero mesero = new Mesero(idMesero, nombreApellido, estado);
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
