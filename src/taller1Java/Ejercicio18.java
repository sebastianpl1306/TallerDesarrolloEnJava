/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1Java;

import javax.swing.JOptionPane;

/**
 * 12/06/2022
 * @author Sebastian Pabon Lopez
 * Dados los datos: a, b, c, d; Elabore un
 * diagrama de flujo para cada uno de los siguientes problemas:
 * a) Hallar el mayor.
 * b) Hallar el menor.
 * c) Hallar el mayor y los menores números son iguales.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        //Petición de numeros
        int a, b, c, d, opcion;
        
        //Petición de caso a comprobar
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero c: "));
        d = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero d: "));
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**** Opciónes del menú ****\n"+"1. Hallar el mayor\n"+"2. Hallar el menor\n"+"3. Hallar el mayor y los menores números son iguales\n\n"+"Ingrese la opción: "));
        
        //Valida la opción elegida por el usuario y realiza la operación elegida
        switch (opcion) {
            case 1:
                //Permite hallar el mayor
                if(a >= b && a >= c && a >= d){
                    JOptionPane.showMessageDialog(null, "El mayor es a: "+a);
                }else if(b >= a && b >= c && b >= d){
                    JOptionPane.showMessageDialog(null, "El mayor es b: "+b);
                }else if(c >= a && c >= b && c >= d){
                    JOptionPane.showMessageDialog(null, "El mayor es c"+c);
                }else if(d >= a && d >= c && d >= b){
                    JOptionPane.showMessageDialog(null, "El mayor es d"+d);
                }
                break;
            case 2:
                //Permite hallar el menor
                if(a <= b && a <= c && a <= d){
                    JOptionPane.showMessageDialog(null, "El menor es a: "+a);
                }else if(b <= a && b <= c && b <= d){
                    JOptionPane.showMessageDialog(null, "El menor es b: "+b);
                }else if(c <= a && c <= b && c <= d){
                    JOptionPane.showMessageDialog(null, "El menor es c"+c);
                }else if(d <= a && d <= c && d <= b){
                    JOptionPane.showMessageDialog(null, "El menor es d"+d);
                }
                break;
            case 3:
                //Permite Hallar el mayor y los menores números son iguales
                if(a >= b && a >= c && a >= d){
                    if(b == c && c == d){
                        JOptionPane.showMessageDialog(null, "El mayor es a: "+a+" y el resto de numeros son iguales");
                    }else{
                        JOptionPane.showMessageDialog(null, "El mayor es a: "+a+"y los otros numeros son diferentes");
                    }
                }else if(b >= a && b >= c && b >= d){
                    if(a == c && c == d){
                        JOptionPane.showMessageDialog(null, "El mayor es b: "+b+" y el resto de numeros son iguales");
                    }else{
                        JOptionPane.showMessageDialog(null, "El mayor es b: "+b+"y los otros numeros son diferentes");
                    }
                }else if(c >= a && c >= b && c >= d){
                    if(b == a && a == d){
                        JOptionPane.showMessageDialog(null, "El mayor es c: "+c+" y el resto de numeros son iguales");
                    }else{
                        JOptionPane.showMessageDialog(null, "El mayor es c: "+c+"y los otros numeros son diferentes");
                    }
                }else if(d >= a && d >= c && d >= b){
                    if(b == c && c == a){
                        JOptionPane.showMessageDialog(null, "El mayor es d: "+d+" y el resto de numeros son iguales");
                    }else{
                        JOptionPane.showMessageDialog(null, "El mayor es d: "+d+"y los otros numeros son diferentes");
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se encontro la opción elegida");
        }
    }
}
