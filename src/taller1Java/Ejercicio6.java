/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1Java;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
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
