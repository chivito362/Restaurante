
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.Conexion;
import java.sql.Connection;


public class Restaurante {

    public static void main(String[] args) {
        Connection conn= Conexion.getConexion("restaurante");
    }
}
