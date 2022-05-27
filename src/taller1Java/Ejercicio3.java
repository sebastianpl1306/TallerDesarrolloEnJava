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
public class Ejercicio3 {
    public static void main(String[] args) {
        float areaCilindro, volumenCilindro;
        int radioCilindro, alturaCilindro;
        
        //radioCilindro = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el radio del cilindro"));
        //alturaCilindro = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la altura del cilindro"));
        radioCilindro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio del cilindro"));
        alturaCilindro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura del cilindro"));
        
        areaCilindro = 2*3.1416f*radioCilindro*(radioCilindro+alturaCilindro);
        volumenCilindro = 3.1416f*(radioCilindro*radioCilindro)*alturaCilindro;
        
        JOptionPane.showMessageDialog(null, "El area del cilindro es: "+areaCilindro);
        JOptionPane.showMessageDialog(null, "El area del cilindro es: "+volumenCilindro);
    }
}
