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
 * Desarrolle un algoritmo que permita determinar el área y volumen de un cilindro dado su
 * radio (R) y altura (H). Luego debe realiza la impresión en pantalla del resultado.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        //Declaración de variables
        float areaCilindro, volumenCilindro;
        int radioCilindro, alturaCilindro;
        
        //Solicitar los datos al usuario
        radioCilindro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio del cilindro"));
        alturaCilindro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura del cilindro"));
        
        //Calcular el area y volumen del cilindro
        areaCilindro = 2*3.1416f*radioCilindro*(radioCilindro+alturaCilindro);
        volumenCilindro = 3.1416f*(radioCilindro*radioCilindro)*alturaCilindro;
        
        //Mostrar información
        JOptionPane.showMessageDialog(null, "El area del cilindro es: "+areaCilindro);
        JOptionPane.showMessageDialog(null, "El area del cilindro es: "+volumenCilindro);
    }
}
