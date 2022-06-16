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
 * Diseñe un algoritmo que lea tres longitudes y determine si forman o no un triángulo. Si es
 * un triángulo determine de qué tipo de triángulo se trata entre: equilátero, isósceles o
 * escaleno. Considere que para formar un triángulo se requiere que: "el lado mayor sea
 * menor que la suma de los otros dos lados".
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        //Declaración de variables
        int ladoTriangulo1, ladoTriangulo2, ladoTriangulo3;
        
        //Solicitar los lados del triangulo
        ladoTriangulo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado de un triangulo: "));
        ladoTriangulo2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado de un triangulo: "));
        ladoTriangulo3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado de un triangulo: "));
        
        //Calcular si el triangulo es equilatero, escaleno o isoseles
        //Si los tres lados son iguales es quilatero
        //Si los tres lados son diferentes es escaleno
        //Si uno de los tres lados es diferente es isoseles
        if(ladoTriangulo1 == ladoTriangulo2 && ladoTriangulo1 == ladoTriangulo3 && ladoTriangulo2 == ladoTriangulo3){
            JOptionPane.showMessageDialog(null, "El triangulo es Equilatero");
        }else if(ladoTriangulo1 != ladoTriangulo2 && ladoTriangulo1 != ladoTriangulo3 && ladoTriangulo2 != ladoTriangulo3){
            JOptionPane.showMessageDialog(null, "Este triangulo es Escaleno");
        }else if(
                (ladoTriangulo1 != ladoTriangulo2 && ladoTriangulo1 != ladoTriangulo3 && ladoTriangulo2 == ladoTriangulo3)
                || (ladoTriangulo2 != ladoTriangulo1 && ladoTriangulo2 != ladoTriangulo3 && ladoTriangulo1 == ladoTriangulo3)
                || (ladoTriangulo3 != ladoTriangulo1 && ladoTriangulo3 != ladoTriangulo2 && ladoTriangulo2 == ladoTriangulo1)
        ){
            JOptionPane.showMessageDialog(null, "Este triangulo es isóseles");
        }
    }
}
