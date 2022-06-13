/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1Java;

import javax.swing.JOptionPane;

/**
 * 12/06/2022
 * @author Sebastian Pabon Lopez
 * A un trabajador le descuentan de su sueldo el 10% si su sueldo es menor o igual a 1000.
 * Por encima de1000 y hasta 2000 el 5% del adicional y por encima de 2000 el 3 % del adicional.
 * Calcular el descuento y sueldo neto que recibe el trabajador dado su sueldo.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        //Declaración de variables
        float sueldo, descuento, sueldoNeto;
        
        descuento = 0;
        sueldoNeto = 0;
        
        //Petición de sueldo al usuario
        sueldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su sueldo: "));
        
        //Calcular el descuento dependiendo el sueldo
        if(sueldo <= 1000){
            //Se descuenta 10%
            descuento = (sueldo * 10)/100;
            sueldoNeto = sueldo-descuento;
        }else if(sueldo > 1000 && sueldo <= 2000){
            //Se descuenta 15%
            descuento = (sueldo * 15)/100;
            sueldoNeto = sueldo-descuento;
        }else if(sueldo > 2000){
            //Se descuenta 18%
            descuento = (sueldo * 18)/100;
            sueldoNeto = sueldo-descuento;
        }
        
        //Mostrar el sueldo, descuento y sueldo neto ganado por el empleado
        JOptionPane.showMessageDialog(null, "su sueldo es: "+sueldo);
        JOptionPane.showMessageDialog(null, "se desconto: "+descuento);
        JOptionPane.showMessageDialog(null, "su sueldo neto es: "+sueldoNeto);
    }
}
