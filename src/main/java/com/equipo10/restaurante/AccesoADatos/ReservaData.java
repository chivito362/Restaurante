
package com.equipo10.restaurante.AccesoADatos;


import com.equipo10.restaurante.Entidades.Reserva;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ReservaData {
    
    private Connection con;
    
    public ReservaData(){
        con = Conexion.getConexion();
    }
    
    public void guardarReserva(Reserva res){
        String sql = "INSERT INTO reserva (idReserva, NombreApellido, DNI, Fecha, Hora, Vigencia) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, res.getIdReserva());
            ps.setString(2,res.getNombreApellido());
            ps.setInt(3, res.getDni());
            ps.setDate(4, Date.valueOf(res.getFecha()));
            ps.setTime(5, Time.valueOf(res.getHora()));
            ps.setBoolean(6, res.isVigencia());
            int end = ps.executeUpdate();
            if(end == 1){
                JOptionPane.showMessageDialog(null, "Reserva Guardada");
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar Reserva");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva: " + ex.getMessage());
        }
    }
    
    
    //Busca en la Base de Datos una Reserva que coincida con "id",
    //y luego retorna un Objeto Reserva con todos los datos obtenidos.
    public Reserva buscarReserva(int id){
        Reserva res = new Reserva();
        String sql = "SELECT * FROM reserva WHERE idReserva = ? AND Vigencia = 1";
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            res.setIdReserva(rs.getInt("idReserva"));
            res.setNombreApellido(rs.getString("NombreApellido"));
            res.setDni(rs.getInt("DNI"));
            res.setFecha(rs.getDate("Fecha").toLocalDate());
            res.setHora(rs.getTime("Hora").toLocalTime());
            res.setVigencia(true);
            }else {
                JOptionPane.showMessageDialog(null, "No existe la Reserva");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Reserva: " + ex.getMessage());
        }
        return res;
    }
    
    
    //Retornará un ArrayList de Reservas activas.
    public List<Reserva> obtenerReservasActivas(){
        List<Reserva> listaRes = new ArrayList<>();
        Reserva res = null;

        try {
            String sql = "SELECT * FROM reserva WHERE Vigencia = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                res = buscarReserva(rs.getInt("idReserva"));
                listaRes.add(res);
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Reservas: " + ex.getMessage());
        }

        return listaRes;
    }

    
    //Retorna un ArrayList de todas las Reservas con el mismo DNI.
    public List<Reserva> obtenerReservasPorDni(int dni){
        List<Reserva> listaRes = new ArrayList<>();
        Reserva res = null;
        try{
            String sql = "SELECT * FROM reserva WHERE DNI = ? AND Vigencia = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                res = buscarReserva(rs.getInt("idReserva"));
                listaRes.add(res);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Reservas por DNI: "+ ex.getMessage());
        }
        
        return listaRes;
    }
    
    public void actualizarReserva(Reserva res){
        String sql = "UPDATE reserva SET NombreApellido = ?, DNI = ?, Fecha = ?, Hora = ? Vigencia = ? WHERE idReserva =" + res.getIdReserva();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, res.getNombreApellido());
            ps.setInt(2, res.getDni());
            ps.setDate(3, Date.valueOf(res.getFecha()));
            ps.setTime(4, Time.valueOf(res.getHora()));
            ps.setBoolean(5, res.isVigencia());
            int end = ps.executeUpdate();
            if(end == 1){
                JOptionPane.showMessageDialog(null, "Reserva modificada");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo modificar la Reserva.");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al actualizar Reserva: " + ex.getMessage());
        }
    }
    
    public void eliminarReserva(int idRes){
        String sql = "UPDATE reserva SET Vigencia = 0 WHERE idReserva = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idRes);
            int end = ps.executeUpdate();
            if(end == 1){
                JOptionPane.showMessageDialog(null, "Reserva eliminada.");
            }else{
                JOptionPane.showMessageDialog(null, "No se puedo eliminar la Reserva.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar Reserva: "+ ex.getMessage());
        }
    }
    
}
