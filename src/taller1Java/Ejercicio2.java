package taller1Java;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 30/05/2022
 * 
 * @author sebastian pabon lopez
 * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos
 * entre el 1 y el 10. Luego debe realizar la impresión en pantalla de la suma de los números.
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
