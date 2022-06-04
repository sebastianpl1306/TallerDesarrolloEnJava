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
public class Ejercicio12 {
    public static void main(String[] args) {
        //Declarando
        int valorCompra, descuento, valorFinal;
        String mensajeCompra;
        
        //Solicitando datos de la compra
        valorCompra = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de la compra"));
        
        //Evalua si se aplica un descuento y el tipo de descuento
        if(valorCompra > 100){
            descuento = (valorCompra*10)/100;
            valorFinal = valorCompra - descuento;
            mensajeCompra = "total: $"+valorCompra
                    +"\n descuento: $"+descuento+" -10%"
                    +"\n subTotal: $"+valorFinal;
            JOptionPane.showMessageDialog(null, mensajeCompra);
        }else if(valorCompra > 50 && valorCompra <=100){
            descuento = (valorCompra*2)/100;
            valorFinal = valorCompra - descuento;
            mensajeCompra = "total: $"+valorCompra
                    +"\n descuento: $"+descuento+" -2%"
                    +"\n subTotal: $"+valorFinal;
            JOptionPane.showMessageDialog(null, mensajeCompra);
        }else{
            mensajeCompra = "total: $"+valorCompra
                    +"\n descuento: $"+0
                    +"\n subTotal: $"+valorCompra;
            JOptionPane.showMessageDialog(null, mensajeCompra);
        }
    }
}
