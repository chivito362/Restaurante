/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.MesaData;
import com.equipo10.restaurante.AccesoADatos.MeseroData;
import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.Entidades.Pedido;

/**
 *
 * @author Lucas
 */
public class MainPruebaDetallePedido {

    public static void main(String[] args) {
        PedidoData pedidoData = new PedidoData();
        MesaData md = new MesaData();
        MeseroData med = new MeseroData();
        // Supongamos que tenemos un pedido existente con ID 1
        Pedido pedidoExistente = new Pedido(pedidoData.ultimo(),md.buscarMesa(9), med.buscarMozoxId(7), false,false, true);
        

       
        // Agrega el pedido con los detalles a la base de datos
        pedidoData.agregarPedido(pedidoExistente);

    }
}
