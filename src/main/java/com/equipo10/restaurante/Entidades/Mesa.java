
package com.equipo10.restaurante.Entidades;

import java.util.List;


public class Mesa {
    private int idMesa;
    private int capacidad;
    private boolean estado;
    private Mesero mesero;
    private Reserva reserva;
    private List<Pedido> pedidos;

    public Mesa() {
    }

    public Mesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public Mesa(int idMesa, int capacidad) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.estado = false;
    }
    
    public Mesa(int idMesa, int capacidad, boolean estado, Mesero mesero, Reserva reserva, List<Pedido> pedidos) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.estado = estado;
        this.mesero = mesero;
        this.reserva = reserva;
        this.pedidos = pedidos;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
    
    
    
}
