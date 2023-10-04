
package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.ReservaData;
import com.equipo10.restaurante.Entidades.Reserva;
import java.time.LocalDate;
import java.time.LocalTime;


public class Restaurante {

    public static void main(String[] args) {
        
        ReservaData rd = new ReservaData();
        Reserva res = new Reserva(1,"Facundo Soria", 44991156, LocalDate.of(2023,7,14), LocalTime.of(20, 00), true);
        
        rd.actualizarReserva(res);
    }
}
