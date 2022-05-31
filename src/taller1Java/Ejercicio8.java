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
public class Ejercicio8 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: "));
        
        //Encuentra el numero menor
        if(numero1 <= numero2 && numero1 <= numero3){
            //Encontrar el numero mayor
            if(numero2 > numero3){
                JOptionPane.showMessageDialog(null, "El numero del medio es: "+numero3);
            }else{
                JOptionPane.showMessageDialog(null, "El numero del medio es: "+numero2);
            }
        }else if(numero2 <= numero1 && numero2 <= numero3){
            if(numero1 > numero3){
                JOptionPane.showMessageDialog(null, "El numero del medio es: "+numero3);
            }else{
                JOptionPane.showMessageDialog(null, "El numero del medio es: "+numero1);
            }
        }else if(numero3 <= numero1 && numero3 <= numero2){
            if(numero1 > numero2){
                JOptionPane.showMessageDialog(null, "El numero del medio es: "+numero3);
            }else{
                JOptionPane.showMessageDialog(null, "El numero del medio es: "+numero1);
            }
        }
        
    }
}
