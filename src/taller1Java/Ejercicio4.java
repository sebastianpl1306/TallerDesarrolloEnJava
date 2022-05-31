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
        //Declaración de variables
        int numero, calcularModulo;
    
        //Petición del numero
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        
        //Calcular si es divisible entre dos
        calcularModulo = numero%2;
        
        //Comprobar si es par
        if(calcularModulo == 0){
            JOptionPane.showMessageDialog(null, "el numero es par");
        }else{
            JOptionPane.showMessageDialog(null, "el numero es inpar");
        }
    }
}
