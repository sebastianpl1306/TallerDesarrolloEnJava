package taller1Java;

import javax.swing.JOptionPane;

/**
 * 12/06/2022
 * @author Sebastian Pabon Lopez
 * Dado un monto calcular el descuento. De esta forma el descuento:
 * 25% si el monto es mayor o igual a 300
 * 20% si el monto esta entre 150 y 300
 * no hay descuento si el monto el menor a 150
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        //Declaración de variables
        float montoCompra,montoCompraTotal;
        float descuento;
        
        // solicitar datos al usuario
        montoCompra=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el valor de su compra: "));
        
        // caso en donde determine y compruebe el porcentaje de descuentos de acuerdo a la compra
        if (montoCompra>=300){
            descuento=(montoCompra*25)/100;
            montoCompraTotal=montoCompra-descuento;
            JOptionPane.showMessageDialog(null,"El valor de su compra es: "+montoCompra+"\n El total de su compra es: "+montoCompraTotal+" "+"\n Su descuento es: "+descuento);
        }else if (montoCompra>=150 && montoCompra<=300){
            descuento=(montoCompra*20)/100;
            montoCompraTotal=montoCompra-descuento;
            JOptionPane.showMessageDialog(null,"El valor de su compra es: "+montoCompra+"\n El total de su compra es: "+montoCompraTotal+" "+"\n Su descuento es: "+descuento);
        }else{
            JOptionPane.showMessageDialog(null,"El valor de su compra es: "+montoCompra+" "+"No tiene descuento");
        }
    }
}
