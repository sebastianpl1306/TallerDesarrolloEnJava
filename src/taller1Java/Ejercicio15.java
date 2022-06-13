/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1Java;

import javax.swing.JOptionPane;

/**
 * 12/06/2022
 * @author Sebastian Pabon Lopez
 * Hacer un programa que permita calcular la media aritmética de 10 números negativos y que
 * muestre la media aritmética en la pantalla.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        // declarando variables
        float numero, suma, media;

        //inicializacion variable
        suma  = 0;

        //Permite pedir 10 numeros al usuarios y sumarlos
        for (int i = 0;i< 10; i++) {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero negativo : "));
            if (numero < 0) {
                suma = suma + numero;
            } else {
                JOptionPane.showMessageDialog(null, "el numero no es negativo");
            }
        }

        //Calcular la media con los 10 numeros y mostrarlos por pantalla
        media  = suma / 10;
        JOptionPane.showMessageDialog (null, "la media es: "+media);   
    }
}
