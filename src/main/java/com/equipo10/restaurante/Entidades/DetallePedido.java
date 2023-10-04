
package com.equipo10.restaurante.Entidades;

import java.time.LocalDate;
import java.util.List;


public class DetallePedido {
 private int idDetalle;   
 private String Cliente;
 private Mesa mesa;
 private List <Producto> productos;
 private LocalDate fecha;
 private Mesero mozo;

    public DetallePedido(String Cliente, Mesa mesa, List<Producto> productos, LocalDate fecha, Mesero mozo) {
        this.Cliente = Cliente;
        this.mesa = mesa;
        this.productos = productos;
        this.fecha = fecha;
        this.mozo = mozo;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public DetallePedido() {
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mesero getMozo() {
        return mozo;
    }

    public void setMozo(Mesero mozo) {
        this.mozo = mozo;
    }

    @Override
    public String toString() {
        return "Historial{" + "Cliente=" + Cliente + ", mesa=" + mesa + ", productos=" + productos + ", fecha=" + fecha + ", mozo=" + mozo + '}';
    }
 
 
 
        
}
