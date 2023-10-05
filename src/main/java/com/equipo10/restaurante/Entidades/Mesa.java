package com.equipo10.restaurante.Entidades;

public class Mesa {

    private int idMesa;
    private int nroMesa;
    private int capacidad;
    private boolean estado;
    private Reserva idReserva = new Reserva();

    /*                            IMPORTANTE
    *       AL CREAR UNA MESA SE PUEDE AGREGAR UNA RESERVA Y SI NO
    *       LO REQUIERE SE DEBE AGREGAR null EN LUGAR DE LA RESERVA" 
    */
    
    public Mesa() {
    }

    public Mesa(int idMesa, int nroMesa, int capacidad, boolean estado, Reserva idReserva) {
        this.idMesa = idMesa;
        this.nroMesa = nroMesa;
        this.capacidad = capacidad;
        this.estado = estado;
        this.idReserva = idReserva;

    }

    public Mesa(int nroMesa, int capacidad, boolean estado, Reserva idReserva) {
        this.idMesa = -1;
        this.nroMesa = nroMesa;
        this.capacidad = capacidad;
        this.estado = estado;
        this.idReserva = idReserva;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
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
        if (idReserva != null) {
            return"|ID: " + idMesa + "|Nro: " + nroMesa + "|Capacidad: " + capacidad + "|Estado: " + estado + "|Reserva: " + idReserva.getNombreApellido() + "|";
        }else{
            return"|ID: " + idMesa + "|Nro: " + nroMesa + "|Capacidad: " + capacidad + "|Estado: " + estado + "|Reserva: NO TIENE|";
        }
    }

}
