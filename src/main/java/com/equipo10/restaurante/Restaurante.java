
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.meseroData;
import com.equipo10.restaurante.Entidades.Mesero;


public class Restaurante {

    public static void main(String[] args) {
        String nombreMozo = "Clemente";
        meseroData md = new meseroData();
        Mesero clemente = new Mesero();
        clemente.setNombreApellido(nombreMozo);
        md.crearMozo(clemente);
        
    }
}
