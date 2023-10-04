package com.equipo10.restaurante.Entidades;

import java.util.List;

public class Pedido {

    private int idPedido;
    private Mesa mesa;
    private Mesero mesero;
    private DetallePedido detalle;
    private double totalPedido;
    private boolean entregado;
    private boolean pagado;

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, List<Producto> productos, double totalPedido, boolean entregado, boolean pagado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.detalle = detalle;
        this.totalPedido = totalPedido;
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

    public DetallePedido getDetalle() {
        return detalle;
    }

    public void setDetalle(DetallePedido detalle) {
        this.detalle = detalle;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
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
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", mesero=" + mesero + ", productos=" + detalle + ", totalPedido=" + totalPedido + ", entregado=" + entregado + ", pagado=" + pagado + '}';
    }

}
