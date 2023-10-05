
package com.equipo10.restaurante.Entidades;

import java.util.List;


public class Categoria {
    private int idCategoria;
    private String nombreCategoria;
    private boolean estado;


    public Categoria() {
    }

    public Categoria(int idCategoria, String nombreCategoria, boolean estado) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.estado = true;
    }
     public Categoria(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
