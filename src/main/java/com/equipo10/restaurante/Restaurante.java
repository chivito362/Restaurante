package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.Conexion;
import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.Vistas.Login;

public class Restaurante {

    public static void main(String[] args) {
        Login vw=new  Login();
        vw.setVisible(true);
        vw.setLocationRelativeTo(null);
    }
}
