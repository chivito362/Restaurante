
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.*;
import com.equipo10.restaurante.Entidades.*;
import java.time.LocalDate;
import com.equipo10.restaurante.AccesoADatos.MesaData;
import com.equipo10.restaurante.AccesoADatos.MeseroData;
import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.AccesoADatos.ProductoData;
import com.equipo10.restaurante.Entidades.Categoria;
import com.equipo10.restaurante.Entidades.Mesa;
import com.equipo10.restaurante.Entidades.Mesero;
import com.equipo10.restaurante.Entidades.Pedido;
import com.equipo10.restaurante.Entidades.Producto;


public class Restaurante {

    static private ReservaData rd = new ReservaData();
    public static void main(String[] args) {
        
        Reserva res1 = new Reserva(3,"Jesús Soria",43876390,LocalDate.of(2023,7,25),true);
        
        //rd.guardarReserva(res1);
//        for(Reserva cada : rd.obtenerReservas(1)){
//            System.out.println(cada.toString());
//        }
        

        
        

        //Pruebas Producto
        //ProductoData p=new ProductoData();
        //Producto prod=new Producto("Milanesa", 2, 1500, Categoria.MINUTA, true);
        
        //Guardar producto
        //p.guardarProcuto(prod);
        //System.out.println("Lis");
        //System.out.println(p.listarProductos());
        //System.out.println("-------------");
        
        
        
        //System.out.println(p.listarProductos());
        
        //Pedidos pruebas
        PedidoData pe=new PedidoData();
        /*MesaData md=new MesaData();
        Mesa mesa=md.buscarMesa(1);
        MeseroData mesd=new MeseroData();
        Mesero me=mesd.buscarMozoxId(1);
        
        Pedido pedido=new Pedido(mesa, me, false, false);
        pe.agregarPedido(pedido);*/
        System.out.println(pe.listarPedidoNoPagado());
    }
}