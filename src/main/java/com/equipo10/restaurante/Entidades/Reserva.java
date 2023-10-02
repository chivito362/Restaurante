
package com.equipo10.restaurante.Entidades;

import java.time.LocalDate;


public class Reserva {
    private int idReserva;
    private String nombreApellido;
    private String dni;
    private LocalDate fecha;
    private LocalDate hora;
    private boolean vigencia;

    public Reserva() {
    }

    public Reserva(int idReserva, String nombreApellido, String dni, LocalDate fecha, LocalDate hora, boolean vigencia) {
        this.idReserva = idReserva;
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.vigencia = vigencia;
    }
    
    
    
    public Reserva(String nombreApellido, String dni, LocalDate fecha, LocalDate hora, boolean vigencia) {
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
    
    
}
