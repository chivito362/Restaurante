package com.equipo10.restaurante.AccesoADatos;

import com.equipo10.restaurante.Entidades.Mesa;
import com.equipo10.restaurante.Entidades.Reserva;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MesaData {

    private final ReservaData res = new ReservaData();
    private Connection con = null;

    public MesaData() {
        con = Conexion.getConexion("restaurante");
    }

   public void guardarMesa(Mesa mesa) {
    PreparedStatement ps;
       try {
           //JOptionPane.showMessageDialog(null, mesa.getNroMesa());
        //if (mesa.getIdMesa() >0) { //id de mesa lo estoy trayendo vacio acá está el error!!!!
            // Crear una nueva mesa
            String sql = "INSERT INTO mesa (nroMesa, capacidad, estado, idReserva) VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getNroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            if (mesa.getIdReserva() != null) {
                ps.setInt(4, mesa.getIdReserva().getIdReserva());
            } else {
                ps.setNull(4, Types.INTEGER); // Usar setNull para indicar un valor NULL
            }
       // } else {
            // Actualizar una mesa existente
       //     String sql = "UPDATE mesa SET nroMesa = ?, capacidad = ?, estado = ?, idReserva = ? WHERE idMesa = ?";
       //     ps = con.prepareStatement(sql);
       //     ps.setInt(1, mesa.getNroMesa());
       //     ps.setInt(2, mesa.getCapacidad());
        //    ps.setBoolean(3, mesa.isEstado());
        //    if (mesa.getIdReserva() != null) {
        //        ps.setInt(4, mesa.getIdReserva().getIdReserva());
        //    } else {
        //        ps.setNull(4, Types.INTEGER); // Usar setNull para indicar un valor NULL
        //    }
        //    ps.setInt(5, mesa.getIdMesa()); // Agregar la condición WHERE para la mesa existente
        //}

        int end = ps.executeUpdate();

        if (end == 1) {
            //JOptionPane.showMessageDialog(null, "Mesa guardada.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la Mesa.");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar Mesa: " + ex.getMessage());
    }
}

    //Si el parametro ingreado es == 1, retornará un List de Mesas Activas.
    //Si el parametro ingreado es == 0, retornará un List de Mesas Inactivas.
    public List<Mesa> obtenerMesas(int num) {
        List<Mesa> lista = new ArrayList<>();
        Mesa mesa = new Mesa();
        try {
            if (num == 1) {
                String sql = "SELECT * FROM mesa WHERE estado = 1";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    mesa = buscarMesa(rs.getInt(1));

                    lista.add(mesa);
                }
            } else if (num == 0) {
                String sql = "SELECT * FROM mesa WHERE estado = 0";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    mesa = buscarMesa(rs.getInt(1));

                    lista.add(mesa);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las Mesas: " + ex.getMessage());
        }
        return lista;
    }
    public List<Mesa> obtenerTodasMesas() {
        List<Mesa> lista = new ArrayList<>();
        Mesa mesa = new Mesa();
        try {
                String sql = "SELECT * FROM mesa";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    mesa = buscarMesa(rs.getInt(1));
                    lista.add(mesa);
                }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las Mesas: " + ex.getMessage());
        }
        return lista;
    }
    public void actualizarMesa(Mesa mesa) {
        try {
            String sql = "UPDATE mesa SET nroMesa = ?, capacidad = ?, estado = ?, idReserva = ? WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getNroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            if (mesa.getIdReserva() != null) {
                ps.setInt(4, mesa.getIdReserva().getIdReserva());
            } else {
                ps.setObject(4, null);
            }
            ps.setInt(5, mesa.getIdMesa());

            int end = ps.executeUpdate();
            if (end == 1) {
               // JOptionPane.showMessageDialog(null, "Mesa actualizada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la Mesa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la Mesa: " + ex.getMessage());
        }
    }

    public void eliminarMesa(Mesa mesa) {
        try {
            String sql = "UPDATE mesa SET estado = 0 WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getIdMesa());
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

    public Mesa buscarMesa(int idMesa) {
        Mesa mesa = new Mesa(0, 0, 0, true, null);
        try {
            String sql = "SELECT * FROM mesa WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                mesa.setNroMesa(rs.getInt(2));
                mesa.setCapacidad(rs.getInt(3));
                mesa.setEstado(rs.getBoolean(4));
                int idReserva = rs.getInt("idReserva");
                if (!rs.wasNull()) {
                    Reserva reserva = res.buscarReserva(idReserva);
                    mesa.setIdReserva(reserva);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Mesa: " + ex.getMessage());
        }
        return mesa;
    }
 public void actualizarMesaxNRO(Mesa mesa) {
        try {
            String sql = "UPDATE mesa SET nroMesa = ?, capacidad = ?, estado = ?, idReserva = ? WHERE nroMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getNroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            if (mesa.getIdReserva() != null) {
                ps.setInt(4, mesa.getIdReserva().getIdReserva());
            } else {
                ps.setObject(4, null);
            }
            ps.setInt(5, mesa.getIdMesa());

            int end = ps.executeUpdate();
            if (end == 1) {
                JOptionPane.showMessageDialog(null, "Mesa actualizada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la Mesa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la Mesa: " + ex.getMessage());
        }
    }

    public void eliminarMesaxNRO(Mesa mesa) {
        try {
            String sql = "UPDATE mesa SET estado = 0 WHERE nroMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getIdMesa());
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

    public Mesa buscarMesaxNRO(int idMesa) {
        Mesa mesa = new Mesa(0, 0, 0, true, null);
        try {
            String sql = "SELECT * FROM mesa WHERE nroMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                mesa.setNroMesa(rs.getInt(2));
                mesa.setCapacidad(rs.getInt(3));
                mesa.setEstado(rs.getBoolean(4));
                int idReserva = rs.getInt("idReserva");
                if (!rs.wasNull()) {
                    Reserva reserva = res.buscarReserva(idReserva);
                    mesa.setIdReserva(reserva);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Mesa: " + ex.getMessage());
        }
        return mesa;
    }
    
   public int obtenerNumeroMesaMasAlto() {
    int numeroMesaMasAlto = 0;
    try {
        String sql = "SELECT MAX(nroMesa) FROM mesa";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            numeroMesaMasAlto = rs.getInt(1);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener el número de mesa más alto: " + ex.getMessage());
    }
    
    return numeroMesaMasAlto;
}
}
