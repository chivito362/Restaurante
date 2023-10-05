
package com.equipo10.restaurante.Entidades;

import java.util.List;

public class Pedido {

    private int idPedido;
    private Mesa mesa;
    private Mesero mesero;
    private boolean entregado;
    private boolean pagado;

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

}
