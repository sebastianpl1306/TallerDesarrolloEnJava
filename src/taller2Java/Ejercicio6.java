/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2Java;

import javax.swing.JOptionPane;

/**
 * 14/06/2022
 *
 * @author Sebastian Pabon Lopez 
 * Pide al usuario por teclado una frase y pasa
 * sus caracteres a un array de caracteres. Puedes hacer con o sin métodos de
 * String
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        //Solicitud de la frase al usuario
        String frase = JOptionPane.showInputDialog(null, "Escriba una frase: ");

        //arreglo de caracteres
        char arregloDeCaracteres[] = new char[frase.length()];

        //Se recorre cada letra de la frase y lo incorporamos en el arreglo y posteriormente se muestra
        for (int i = 0; i < frase.length(); i++) {
            arregloDeCaracteres[i] = frase.charAt(i);
            System.out.println(arregloDeCaracteres[i]);
        }

    }
}
