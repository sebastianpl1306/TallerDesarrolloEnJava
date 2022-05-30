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
public class Ejercicio4 {
    public static void main(String[] args) {
        int numero, calcularModulo;
    
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingres un numero: "));
        
        calcularModulo = numero%2;
        
        if(calcularModulo == 0){
            JOptionPane.showMessageDialog(null, "el numero es par");
        }else{
            JOptionPane.showMessageDialog(null, "el numero es inpar");
        }
    }
}
