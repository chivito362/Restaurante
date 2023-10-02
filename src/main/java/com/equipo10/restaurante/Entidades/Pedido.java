
package com.equipo10.restaurante.Entidades;

import java.util.List;


public class Pedido {
    private int idPedido;
    private Mesa mesa;
    private Mesero mesero;
    private List<Producto> productos;
    private double totalPedido;
    private boolean entregado;
    private boolean pagado;
}
