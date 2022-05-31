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
public class Ejercicio5 {
    public static void main(String[] args) {
        //Declaración de variables
        int numero1, numero2;
        
        //Solicitar numeros al usuario
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        
        //Calcular el numero mayor y menor entre dos numeros
        if(numero1 < numero2){
            JOptionPane.showMessageDialog(null, "menor: "+numero1+"\nmayor: "+numero2);
        }else if(numero2 < numero1){
            JOptionPane.showMessageDialog(null, "menor: "+numero2+"\nmayor: "+numero1);
        }else{
            JOptionPane.showMessageDialog(null, "los numeros son iguales: "+numero1);
        }
    }
}
