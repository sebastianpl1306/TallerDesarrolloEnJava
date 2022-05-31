package taller1Java;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        //Declaración de variables
        int sumaTotal = 0;
        
        //Suma los numeros del 1 al 10
        for (int i = 0; i <= 10; i++) {
            sumaTotal = sumaTotal + i;
        }
        
        System.out.println("el total de la suma es: "+sumaTotal);
    }
}
