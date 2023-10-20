/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.equipo10.restaurante;

/**
 *
 * @author Lucas Cometto
 */

public class ValidacionDatos {

    private static final String DNI_MODELO = "\\d{7,8}"; // Para un DNI de 7 u 8 dígitos
    private static final String NOMBRE_MODELO = "[A-Za-zÁÉÍÓÚáéíóúñÑ\\s]+"; // Para un nombre que acepte letras, espacios y acentos
    private static final String APELLIDO_MODELO = "[A-Za-zÁÉÍÓÚáéíóúñÑ\\s]+"; // Para un apellido que acepte letras, espacios y acentos
    private static final String NUMEROS_POSITIVOS ="\\d+";
    
    public static boolean validarNumeroPositivo (String numero) {
    return numero.matches (NUMEROS_POSITIVOS);
    }
    
    public static boolean validarDNI(String dni) {
        return dni.matches(DNI_MODELO);
    }

    public static boolean validarNombre(String nombre) {
        return nombre.matches(NOMBRE_MODELO);
    }

    public static boolean validarApellido(String apellido) {
        return apellido.matches(APELLIDO_MODELO);
    }
    /* if (!ValidacionDatos.validarDNI(dniString)) {
            JOptionPane.showMessageDialog(this, "Ingrese un DNI válido (8 dígitos numéricos).");
            return;
        }

        if (!ValidacionDatos.validarNombre(nombre)) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre válido (solo letras y espacios).");
            return;
        }
*/
    
}


