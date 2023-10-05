
package com.equipo10.restaurante.Entidades;


public class Mesa {
    private int nroMesa;
    private int capacidad;
    private boolean estado;
    private Reserva idReserva;

    public Mesa() {
    }

    public Mesa(int nroMesa, int capacidad, boolean estado, Reserva idReserva) {
        this.nroMesa = nroMesa;
        this.capacidad = capacidad;
        this.estado = estado;
        this.idReserva = idReserva;
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
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

    public Reserva getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reserva idReserva) {
        this.idReserva = idReserva;
    }

    @Override
    public String toString() {
        return "|Nro: " + nroMesa + " |Capacidad: " + capacidad + " |Estado: " + estado + " |Reserva: " + idReserva.getNombreApellido()+"|";
    }

    
    
    
    
}
