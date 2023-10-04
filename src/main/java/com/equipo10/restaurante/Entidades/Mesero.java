
package com.equipo10.restaurante.Entidades;

import java.util.List;


public class Mesero {
    private int idMesero;
    private String nombreApellido;
    

    public Mesero() {
    }

    public Mesero(int idMesero, String nombreApellido) {
        this.idMesero = idMesero;
        this.nombreApellido = nombreApellido;
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
