package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MesaData {

    private final ReservaData res = new ReservaData();
    private Connection con = null;

    public MesaData() {
        con = Conexion.getConexion();
    }

    private void guardarMesa(Mesa mesa) {
        try {
            String sql = "INSERT INTO mesa (nroMesa, capacidad, estado, idReserva) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getNroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            ps.setInt(4, mesa.getIdReserva().getIdReserva());
            int end = ps.executeUpdate();
            if (end == 1) {
                JOptionPane.showMessageDialog(null, "Mesa guardada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar la Mesa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar Mesa: " + ex.getMessage());
        }
    }

    //Si el parametro ingresado es == 1, retornará un List de Mesas activas.
    //Si el parametro ingresado es == 0, retormará un List de Mesas inactivas.
    private List<Mesa> obtenerMesas(int num) {
        List<Mesa> lista = new ArrayList<>();
        Mesa mesa = null;
        try {
            if (num == 1) {
                String sql = "SELECT * FROM mesa WHERE estado = 1";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    mesa.setNroMesa(rs.getInt(1));
                    mesa.setCapacidad(rs.getInt(2));
                    mesa.setEstado(rs.getBoolean(3));
                    mesa.setIdReserva(res.buscarReserva(rs.getInt(4)));

                    lista.add(mesa);
                }
            } else if (num == 0) {
                String sql = "SELECT * FROM mesa WHERE estado = 0";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    mesa.setNroMesa(rs.getInt(1));
                    mesa.setCapacidad(rs.getInt(2));
                    mesa.setEstado(rs.getBoolean(3));
                    mesa.setIdReserva(res.buscarReserva(rs.getInt(4)));

                    lista.add(mesa);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las Mesas: " + ex.getMessage());
        }
        return lista;
    }

    private void actualizarMesa(Mesa mesa) {
        try {
            String sql = "UPDATE mesa SET capacidad = ?, estado = ?, idReserva = ? WHERE nroMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(4, mesa.getNroMesa());
            ps.setInt(1, mesa.getCapacidad());
            ps.setBoolean(2, mesa.isEstado());
            ps.setInt(3, mesa.getIdReserva().getIdReserva());
            int end = ps.executeUpdate();
            if (end == 1) {
                JOptionPane.showMessageDialog(null, "Mesa actualizada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la Mesa");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la Mesa: " + ex.getMessage());
        }
    }

    private void eliminarMesa(Mesa mesa) {
        try {
            String sql = "UPDATE mesa SET estado = 0 WHERE nroMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getNroMesa());
            int end = ps.executeUpdate();
            if (end == 1) {
                JOptionPane.showMessageDialog(null, "Mesa eliminada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la Mesa.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la Mesa: " + ex.getMessage());
        }
    }

    private void buscarMesa(int nroMesa) {
        Mesa mesa = null;

        try {
            String sql = "SELECT * FROM mesa WHERE nroMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroMesa);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mesa.setNroMesa(nroMesa);
                mesa.setCapacidad(rs.getInt(2));
                mesa.setEstado(rs.getBoolean(3));
                mesa.setIdReserva(res.buscarReserva(rs.getInt(4)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Mesa: " + ex.getMessage());
        }
    }
}
