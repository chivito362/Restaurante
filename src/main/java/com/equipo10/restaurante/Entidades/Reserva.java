
package com.equipo10.restaurante.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;


public class Reserva {
    private int idReserva;
    private String nombreApellido;
    private int dni;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean vigencia;

    public Reserva() {
    }

    public Reserva(int idReserva, String nombreApellido, int dni, LocalDate fecha, LocalTime hora, boolean vigencia) {
        this.idReserva = idReserva;
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.vigencia = vigencia;
    }
    
    
    
    public Reserva(String nombreApellido, int dni, LocalDate fecha, LocalTime hora, boolean vigencia) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
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
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
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
                + fecha.toString() + " Hora: " + hora.getHour() + ":" + hora.getMinute() + " Vigencia: " + vigencia ;
    }
    
    
    
}
