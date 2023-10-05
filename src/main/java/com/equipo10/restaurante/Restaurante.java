
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.ProductoData;
import com.equipo10.restaurante.Entidades.Categoria;
import com.equipo10.restaurante.Entidades.Producto;


public class Restaurante {

    public static void main(String[] args) {
        

        //Pruebas Producto
        ProductoData p=new ProductoData();
        Producto prod=new Producto("Milanesa napolitana", 1, 1500, Categoria.MINUTA, true);
        
        //Guardar producto
        p.guardarProcuto(prod);
        //System.out.println("Lis");
        //System.out.println(p.listarProductos());
        //System.out.println("-------------");

    }
}