
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.Conexion;
import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.Entidades.Mesa;
import com.equipo10.restaurante.Entidades.Mesero;
import com.equipo10.restaurante.Entidades.Pedido;


public class Restaurante {

    public static void main(String[] args) {
//        Pedido pedido=new Pedido(new Mesa(), new Mesero(), true, true);
//        PedidoData pd=new PedidoData();
     
        Conexion.getConexion("Restaurante");
        
//        pd.agregarPedido(pedido);
        
    }
}
