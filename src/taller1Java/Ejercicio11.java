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
 * Diseñe un algoritmo que lea tres números y los imprima de mayor a menor y de menor a mayor.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        //Declaración de variables
        int numero1, numero2, numero3;
        String ordenNumerosMayor, ordenNumerosMenor;
        
        //Solicitar los datos al usuario
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: "));
        
        //Encuentra el numero menor
        if(numero1 <= numero2 && numero1 <= numero3){
            //Encontrar el numero mayor para determinar cual es el del medio
            if(numero2 > numero3){
                ordenNumerosMayor = "**Ordenando de mayor a menor**\n";
                ordenNumerosMayor += "mayor: "+numero2+"\n";
                ordenNumerosMayor += "medio: "+numero3+"\n";
                ordenNumerosMayor += "menor: "+numero1+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMayor);
                
                ordenNumerosMenor = "**Ordenando de menor a menor**\n";
                ordenNumerosMenor += "menor: "+numero1+"\n";
                ordenNumerosMenor += "medio: "+numero3+"\n";
                ordenNumerosMenor += "mayor: "+numero2+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMenor);
            }else{
                ordenNumerosMayor = "**Ordenando de mayor a menor**\n";
                ordenNumerosMayor += "mayor: "+numero3+"\n";
                ordenNumerosMayor += "medio: "+numero3+"\n";
                ordenNumerosMayor += "menor: "+numero1+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMayor);
                
                ordenNumerosMenor = "**Ordenando de menor a menor**\n";
                ordenNumerosMenor += "menor: "+numero1+"\n";
                ordenNumerosMenor += "medio: "+numero3+"\n";
                ordenNumerosMenor += "mayor: "+numero2+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMenor);
                
                JOptionPane.showMessageDialog(null, "El numero del medio es: "+numero2);
            }
        }else if(numero2 <= numero1 && numero2 <= numero3){
            //Encontrar el numero mayor para determinar cual es el del medio
            if(numero1 > numero3){
                ordenNumerosMayor = "**Ordenando de mayor a menor**\n";
                ordenNumerosMayor += "mayor: "+numero1+"\n";
                ordenNumerosMayor += "medio: "+numero3+"\n";
                ordenNumerosMayor += "menor: "+numero2+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMayor);
                
                ordenNumerosMenor = "**Ordenando de menor a menor**\n";
                ordenNumerosMenor += "menor: "+numero1+"\n";
                ordenNumerosMenor += "medio: "+numero3+"\n";
                ordenNumerosMenor += "mayor: "+numero2+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMenor);
            }else{
                ordenNumerosMayor = "**Ordenando de mayor a menor**\n";
                ordenNumerosMayor += "mayor: "+numero3+"\n";
                ordenNumerosMayor += "medio: "+numero1+"\n";
                ordenNumerosMayor += "menor: "+numero2+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMayor);
                
                ordenNumerosMenor = "**Ordenando de menor a menor**\n";
                ordenNumerosMenor += "menor: "+numero3+"\n";
                ordenNumerosMenor += "medio: "+numero1+"\n";
                ordenNumerosMenor += "mayor: "+numero2+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMenor);
            }
        }else if(numero3 <= numero1 && numero3 <= numero2){
            //Encontrar el numero mayor para determinar cual es el del medio
            if(numero1 > numero2){
                ordenNumerosMayor = "**Ordenando de mayor a menor**\n";
                ordenNumerosMayor += "mayor: "+numero1+"\n";
                ordenNumerosMayor += "medio: "+numero2+"\n";
                ordenNumerosMayor += "menor: "+numero3+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMayor);
                
                ordenNumerosMenor = "**Ordenando de menor a menor**\n";
                ordenNumerosMenor += "menor: "+numero3+"\n";
                ordenNumerosMenor += "medio: "+numero2+"\n";
                ordenNumerosMenor += "mayor: "+numero1+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMenor);
            }else{
                ordenNumerosMayor = "**Ordenando de mayor a menor**\n";
                ordenNumerosMayor += "mayor: "+numero2+"\n";
                ordenNumerosMayor += "medio: "+numero1+"\n";
                ordenNumerosMayor += "menor: "+numero3+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMayor);
                
                ordenNumerosMenor = "**Ordenando de menor a menor**\n";
                ordenNumerosMenor += "menor: "+numero3+"\n";
                ordenNumerosMenor += "medio: "+numero1+"\n";
                ordenNumerosMenor += "mayor: "+numero2+"\n";
                JOptionPane.showMessageDialog(null, ordenNumerosMenor);
            }
        }
    }
}
