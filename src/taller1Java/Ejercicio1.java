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
 * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y
 * C respectivamente. El algoritmo debe indicar cuál es el mayor y cuál es el menor. Luego
 * debe realiza la impresión en pantalla del resultado.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int A,B,C;
        
        //Peticion de numeros
        A = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        B = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        C = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer numero"));
        
        //Calcular el numero mayor entre A, B y C
        if(A>=B && A>=C){
            System.out.println("Mayor: "+A);
            //Se calcula el numero menor
            if(B<C){
                System.out.println("Menor: "+B);
            }else{
                System.out.println("Menor: "+C);
            }
        }else if(B>=A && B>=C){
            System.out.println("Mayor: "+B);
            //Se calcula el numero menor
            if(A<C){
                System.out.println("Menor: "+A);
            }else{
                System.out.println("Menor: "+C);
            }
        }else if(C>=A && C>=B){
            System.out.println("Mayor: "+C);
            //Se calcula el numero menor
            if(A<B){
                System.out.println("Menor: "+A);
            }else{
                System.out.println("Menor: "+B);
            }
        }else{
            System.out.println("Iguales");
        }
    }
}
