
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.Conexion;
import com.equipo10.restaurante.AccesoADatos.ProductoData;
import java.sql.Connection;


public class Restaurante {

    public static void main(String[] args) {
        ProductoData p=new ProductoData();
        System.out.println(p.listarProductos());
    }
}
