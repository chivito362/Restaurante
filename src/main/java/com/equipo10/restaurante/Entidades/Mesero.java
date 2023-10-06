
package com.equipo10.restaurante.Entidades;

import java.util.List;


public class Mesero {
    private int idMesero;
    private String nombreApellido;
    private boolean estado;

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Mesero() {
    }

    public Mesero(int idMesero, String nombreApellido, boolean estado) {
        this.idMesero = idMesero;
        this.nombreApellido = nombreApellido;
        this.estado=estado;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

  
    
    
}
