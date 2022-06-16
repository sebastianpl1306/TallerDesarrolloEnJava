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
 * El promedio de prácticas de un curso se calcula en base a cuatro prácticas calificadas de las
 * cuales se elimina la nota menor y se promedian las tres notas más altas. Diseñe un algoritmo
 * que determine la nota eliminada y el promedio de prácticas de un estudiante.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        //Declaración de variables
        int nota1, nota2, nota3, nota4, promedioFinal;
        
        //Solicitar los datos
        nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la primera nota: "));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la segunda nota: "));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la tercera nota: "));
        nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cuarta nota: "));
        
        //Encontrar cual es la nota menor de todas
        if (nota1 <= nota2 && nota1 <= nota3 && nota1 <= nota4){
            JOptionPane.showMessageDialog(null, "La nota menor es: "+nota1);
            //calcular el promedio de las notas restantes
            promedioFinal = (nota2+nota3+nota4)/3;
            JOptionPane.showMessageDialog(null, "El promedio es: "+promedioFinal);
        }else if (nota2 <= nota1 && nota2 <= nota3 && nota2 <= nota4){
            JOptionPane.showMessageDialog(null, "La nota menor es: "+nota2);
            //calcular el promedio de las notas restantes
            promedioFinal = (nota1+nota3+nota4)/3;
            JOptionPane.showMessageDialog(null, "El promedio es: "+promedioFinal);
        }else if (nota3 <= nota1 && nota3 <= nota2 && nota3 <= nota4){
            JOptionPane.showMessageDialog(null, "La nota menor es: "+nota3);
            //calcular el promedio de las notas restantes
            promedioFinal = (nota1+nota2+nota4)/3;
            JOptionPane.showMessageDialog(null, "El promedio es: "+promedioFinal);
        }else if (nota4 <= nota1 && nota4 <= nota2 && nota4 <= nota3){
            JOptionPane.showMessageDialog(null, "La nota menor es: "+nota4);
            //calcular el promedio de las notas restantes
            promedioFinal = (nota1+nota2+nota3)/3;
            JOptionPane.showMessageDialog(null, "El promedio es: "+promedioFinal);
        }
    }
}
