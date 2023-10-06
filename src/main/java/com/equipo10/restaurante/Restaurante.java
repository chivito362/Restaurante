
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.*;
import com.equipo10.restaurante.Entidades.*;
import java.time.LocalDate;


public class Restaurante {

    static private ReservaData rd = new ReservaData();
    public static void main(String[] args) {
        
        Reserva res1 = new Reserva(3,"Jesús Soria",43876390,LocalDate.of(2023,7,25),true);
        
        //rd.guardarReserva(res1);
//        for(Reserva cada : rd.obtenerReservas(1)){
//            System.out.println(cada.toString());
//        }
        

        
        
    }
}