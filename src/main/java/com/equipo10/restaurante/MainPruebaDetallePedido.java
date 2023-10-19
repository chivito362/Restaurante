/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.DetallePedidoData;
import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.Entidades.DetallePedido;
import com.equipo10.restaurante.Entidades.Pedido;

/**
 *
 * @author Lucas
 */
public class MainPruebaDetallePedido {
    
    public static void main(String[] args) {
        PedidoData pedidoData = new PedidoData();
        DetallePedidoData detallePedidoData = new DetallePedidoData();
        // Supongamos que tenemos un pedido existente con ID 1
        Pedido pedidoExistente = new Pedido(1,121, 7, false,false); //idpedido,idmesa,idmesero,entregado,pagado (esto miralo bien)
/*aca para mi tiene que ser nro de mesa, pero hay que verlo bien*/
        // Creamos un detalle de pedido para el primer producto
        DetallePedido detalleProducto1 = new DetallePedido(1, 4, 2,3); //int idDetalle, int idPedido, int idProducto, int cantidad

        // Creamos un detalle de pedido para el segundo producto
        DetallePedido detalleProducto2 = new DetallePedido(2,5,3,5);

       
        // Agrega el pedido con los detalles a la base de datos
        pedidoData.agregarPedido(pedidoExistente);
        detallePedidoData.agregarDetallePedido(detalleProducto1);
        detallePedidoData.agregarDetallePedido(detalleProducto2);
    }
    }








