
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.CategoriaData;
import com.equipo10.restaurante.AccesoADatos.MeseroData;
import com.equipo10.restaurante.Entidades.Categoria;
import com.equipo10.restaurante.Entidades.Mesero;


public class RestaurantePruebasLucas {

    public static void main(String[] args) {
       //crearMozo("Lucas Cometto");
       //crearCategoria("Pizzas"); 
       eliminarCategoria(4);
    }
   private static void crearMozo(String nombre){
    MeseroData md = new MeseroData();
    Mesero nuevoMozo = new Mesero();
    nuevoMozo.setNombreApellido(nombre);
    md.crearMozo(nuevoMozo);
    }
   private static void crearCategoria(String nombreCat){
   CategoriaData cd = new CategoriaData();
   Categoria nuevaCategoria = new Categoria();
   nuevaCategoria.setNombreCategoria(nombreCat);
   cd.crearCategoria(nuevaCategoria);
   }
    private static void eliminarCategoria(int idCategoria){
   CategoriaData cd = new CategoriaData();
   cd.eliminarCategoria(idCategoria);
   }
}
