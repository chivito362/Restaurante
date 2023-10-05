package com.equipo10.restaurante;

import com.equipo10.restaurante.AccesoADatos.*;
import com.equipo10.restaurante.Entidades.*;
import java.time.LocalDate;
import java.util.List;

public class Restaurante {

    static MesaData md = new MesaData();
    static ReservaData rd = new ReservaData();
    static List<Mesa> lista;

    public static void main(String[] args) {

        Reserva res1 = new Reserva(1,"Facundo Soria", 44991156, LocalDate.of(2023,7,14),  true);
        Reserva res2 = new Reserva(2,"Amilcar Arce", 44547634, LocalDate.of(2023, 3, 6), true);

        //rd.eliminarReserva(res1);
        //rd.guardarReserva(res2);
        Mesa mesa = new Mesa(6,17, 4, true, null);
        md.eliminarMesa(mesa);

        
        
        
        //System.out.println(md.buscarMesa(3).toString());
        //System.out.println(md.buscarMesa(2).toString());
        //System.out.println(md.buscarMesa(4).toString());
                
    }
}
