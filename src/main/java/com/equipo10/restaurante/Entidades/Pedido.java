
package com.equipo10.restaurante.Entidades;

import java.util.List;

public class Pedido {

    private int idPedido;
    private int idMesa;
    private int idMesero;
    
    
    private Mesa mesa;
    private Mesero mesero;
    private boolean entregado;
    private boolean pagado;
    private boolean estado;

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, boolean entregado, boolean pagado, boolean estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.entregado = entregado;
        this.pagado = pagado;
        this.estado = estado;
    }

    public Pedido(Mesa mesa, Mesero mesero, boolean entregado, boolean pagado, boolean estado) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.entregado = entregado;
        this.pagado = pagado;
        this.estado = estado;
    }

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }
    

    public Pedido(Mesa mesa, Mesero mesero, boolean entregado, boolean pagado) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.entregado = entregado;
        this.pagado = pagado;
    }

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, boolean entregado, boolean pagado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.entregado = entregado;
        this.pagado = pagado;
    }
    // este lo agregó Lucas
     public Pedido(int idPedido, int idMesa, int idMesero, boolean entregado, boolean pagado) {
        this.idPedido = idPedido;
        this.idMesa = idMesa;
        this.idMesero = idMesero;
        this.entregado = entregado;
        this.pagado = pagado;
    }

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", mesero=" + mesero + ", productos=" + ", totalPedido="+ ", entregado=" + entregado + ", pagado=" + pagado + '}';
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    

}
