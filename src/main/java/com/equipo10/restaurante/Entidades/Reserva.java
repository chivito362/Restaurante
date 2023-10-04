
package com.equipo10.restaurante.Entidades;

import java.time.LocalDate;


public class Reserva {
    private int idReserva;
    private String nombreApellido;
    private String dni;
    private LocalDate fechaHora;
    private boolean vigencia;

    public Reserva() {
    }

    public Reserva(int idReserva, String nombreApellido, String dni, LocalDate fecha, boolean vigencia) {
        this.idReserva = idReserva;
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.fechaHora = fecha;
        
        this.vigencia = vigencia;
    }
    
    
    
    public Reserva(String nombreApellido, String dni, LocalDate fecha, LocalDate hora, boolean vigencia) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.fechaHora = fecha;
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

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechora(LocalDate fecha) {
        this.fechaHora = fecha;
    }

     public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
    
    
}
