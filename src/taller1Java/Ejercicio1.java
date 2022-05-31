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
public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int A,B,C;
        
        //Peticion de numeros
        A = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        B = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        C = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        
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
