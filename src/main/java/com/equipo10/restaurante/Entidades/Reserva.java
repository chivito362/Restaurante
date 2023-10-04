
package com.equipo10.restaurante.Entidades;

import java.time.LocalDate;


public class Reserva {
    private int idReserva;
    private String nombreApellido;
    private int dni;
    private LocalDate fechaHora;
    private boolean vigencia;

    public Reserva() {
    }

    public Reserva(int idReserva, String nombreApellido, int dni, LocalDate fechaHora, boolean vigencia) {
        this.idReserva = idReserva;
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.fechaHora = fechaHora;
        this.vigencia = vigencia;
    }
    
    
    
    public Reserva(String nombreApellido, int dni, LocalDate fechaHora, boolean vigencia) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.fechaHora = fechaHora;
        this.vigencia = vigencia;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

        
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fechaHora;
    }

    public void setFecha(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return "ID: " + idReserva + " NyA: " + nombreApellido + " DNI: " + dni + " Fecha: " 
                + fechaHora.toString() + " Vigencia: " + vigencia ;
    }
    
    
    
}
