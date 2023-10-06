
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.CategoriaData;
import com.equipo10.restaurante.AccesoADatos.MeseroData;
import com.equipo10.restaurante.Entidades.Categoria;
import com.equipo10.restaurante.Entidades.Mesero;
import java.util.ArrayList;
import java.util.List;


public class RestaurantePruebasLucas {

    public static void main(String[] args) {
       //crearMozo("valentin barco");
       //listarMozos();
       //eliminarMozo(7);
       //crearCategoria("Pizzas"); 
       //eliminarCategoria(4);
    }
    private static void eliminarMozo(int idMozo){
    MeseroData md = new MeseroData();
    md.eliminarMozo(idMozo);
    }
    private static void crearMozo(String nombre){
    MeseroData md = new MeseroData();
    Mesero nuevoMozo = new Mesero();
    nuevoMozo.setNombreApellido(nombre);
    nuevoMozo.setEstado(true);
    md.crearMozo(nuevoMozo);
    }
   private static void listarMozos(){
   MeseroData md = new MeseroData();
   List <Mesero> listaMozo = new ArrayList<>();
   listaMozo=md.listarMozos();
   for(Mesero mozo :listaMozo){
       System.out.println("Nombre: " + mozo.getNombreApellido());
   }
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
