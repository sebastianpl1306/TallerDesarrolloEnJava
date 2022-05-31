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
        int velocidadVehiculo;
        float convercionVelocidad;
        
        velocidadVehiculo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la velocidad por km/h: "));
        
        convercionVelocidad = velocidadVehiculo/3.6f;
        
        JOptionPane.showMessageDialog(null, "La velocidad del vehiculo es: "+convercionVelocidad+"mt/s");
    }
}
