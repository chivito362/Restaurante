
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.meseroData;
import com.equipo10.restaurante.Entidades.Mesero;


public class Restaurante {

    public static void main(String[] args) {
        String nombreMozo = "Lucas";
        meseroData md = new meseroData();
        Mesero lucas = new Mesero();
        lucas.setNombreApellido(nombreMozo);
        md.crearMozo(lucas);
        
    }
}
