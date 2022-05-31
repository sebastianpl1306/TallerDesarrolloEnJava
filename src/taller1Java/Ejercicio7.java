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
public class Ejercicio7 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
        
        if(numero1 <= numero2 && numero1 <= numero3){
            JOptionPane.showMessageDialog(null, "El numero menor: "+numero1);
        }else if(numero2 <= numero1 && numero2 <= numero3){
            JOptionPane.showMessageDialog(null, "El numero menor: "+numero2);
        }else{
            JOptionPane.showMessageDialog(null, "El numero menor: "+numero3);
        }
    }
}
