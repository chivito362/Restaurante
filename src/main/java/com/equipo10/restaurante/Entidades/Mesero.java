
package com.equipo10.restaurante.Entidades;

import java.util.List;


public class Mesero {
    private int idMesero;
    private String nombreApellido;
    private List<Pedido> pedido;
    private Mesa mesa;

    public Mesero() {
    }

    public Mesero(int idMesero, String nombreApellido, List<Pedido> pedido, Mesa mesa) {
        this.idMesero = idMesero;
        this.nombreApellido = nombreApellido;
        this.pedido = pedido;
        this.mesa = mesa;
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

    public List<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    
}
