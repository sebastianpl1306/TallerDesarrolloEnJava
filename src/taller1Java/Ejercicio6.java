/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1Java;

import javax.swing.JOptionPane;

/**
 * 30/05/2022
 * 
 * @author sebastian pabon lopez
 * Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil, expresada
 * en kilómetros por hora, proporcione la velocidad en metros por segundo. Luego debe realiza
 * la impresión en pantalla del resultado.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        //Declaración de variables
        int velocidadVehiculo;
        float convercionVelocidad;
        
        //Solicitar la velocidad del vehiculo por Km/H
        velocidadVehiculo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la velocidad por km/h: "));
        
        //Convertir la velocidad de Km/h a Mt/s
        convercionVelocidad = velocidadVehiculo/3.6f;
        
        JOptionPane.showMessageDialog(null, "La velocidad del vehiculo es: "+convercionVelocidad+"mt/s");
    }
}
