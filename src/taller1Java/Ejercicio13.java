/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1Java;

import javax.swing.JOptionPane;

/**
 * 04/06/2022
 * @author sebas
 * Politecnico Internacional
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        //Declaración de variables
        int numero1, numero2, numero3, numero4;
        
        //Solicitud de datos
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        numero4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        
        if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
            //numero1
            if(numero2 > numero3 && numero2 > numero4){
                //numero1, numero2
                if(numero3 > numero4){
                    //numero1, numero2, numero3, numero4
                    System.out.println(numero4+", "+numero3+", "+numero2+", "+numero1);
                }else{
                    //numero1, numero2, numero4, numero3
                    System.out.println(numero3+", "+numero4+", "+numero2+", "+numero1);
                }
            }else if(numero3 > numero2 && numero3 > numero4){
                //numero1, numero3
                if(numero2 > numero4){
                    //numero1, numero3, numero2, numero4
                    System.out.println(numero4+", "+numero2+", "+numero3+", "+numero1);
                }else{
                    //numero1, numero3, numero4, numero2
                    System.out.println(numero2+", "+numero4+", "+numero3+", "+numero1);
                }
            }else if(numero4 > numero2 && numero4 > numero3){
                //numero1, numero4
                if(numero2 > numero3){
                    //numero1, numero4, numero2, numero3
                    System.out.println(numero3+", "+numero2+", "+numero4+", "+numero1);
                }else{
                    //numero1, numero4, numero3, numero2
                    System.out.println(numero2+", "+numero3+", "+numero4+", "+numero1);
                }
            }
        }else if(numero2 > numero1 && numero2 > numero3 && numero2 > numero4){
            //numero 2
            if(numero1 > numero3 && numero1 > numero4){
                //numero2, numero1
                if(numero3 > numero4){
                    //numero2, numero1, numero3, numero4
                    System.out.println(numero4+", "+numero3+", "+numero1+", "+numero2);
                }else{
                    //numero2, numero1, numero4, numero3
                    System.out.println(numero3+", "+numero4+", "+numero1+", "+numero2);
                }
            }else if(numero3 > numero1 && numero3 > numero4){
                //numero2, numero3
                if(numero1 > numero4){
                    //numero2, numero3, numero1, numero4
                    System.out.println(numero4+", "+numero1+", "+numero3+", "+numero2);
                }else{
                    //numero2, numero3, numero4, numero1
                    System.out.println(numero1+", "+numero4+", "+numero3+", "+numero2);
                }
            }else if(numero4 > numero1 && numero4 > numero3){
                //numero2, numero4
                if(numero3 > numero1){
                    //numero2, numero4, numero3, numero1
                    System.out.println(numero1+", "+numero3+", "+numero4+", "+numero2);
                }else{
                    //numero2, numero4, numero1, numero3
                    System.out.println(numero3+", "+numero1+", "+numero4+", "+numero2);
                }
            }
        }else if(numero3 > numero1 && numero3 > numero2 && numero3 > numero4){
            //numero 3 mayor
            if(numero1 > numero2 && numero1 > numero4){
                //numero3, numero1
                if(numero2 > numero4){
                    //numero3, numero1, numero2, numero4
                    System.out.println(numero4+", "+numero2+", "+numero1+", "+numero3);
                }else{
                    //numero3, numero1, numero4, numero2
                    System.out.println(numero2+", "+numero4+", "+numero1+", "+numero3);
                }
            }else if(numero2 > numero1 && numero2 > numero4){
                //numero3, numero2
                if(numero1 > numero4){
                    //numero3, numero2, numero1, numero4
                    System.out.println(numero4+", "+numero1+", "+numero2+", "+numero3);
                }else{
                    //numero3, numero2, numero4, numero1
                    System.out.println(numero1+", "+numero4+", "+numero2+", "+numero3);
                }
            }else if(numero4 > numero1 && numero4 > numero2){
                //numero3, numero4
                if(numero1 > numero2){
                    //numero3, numero4, numero1, numero2
                    System.out.println(numero2+", "+numero1+", "+numero4+", "+numero3);
                }else{
                    //numero3, numero4, numero2, numero1
                    System.out.println(numero1+", "+numero2+", "+numero4+", "+numero3);
                }
            }
        }else if(numero4 > numero1 && numero4 > numero2 && numero4 > numero3){
            //numero 4 mayor
            if(numero3 > numero2 && numero3 > numero1){
                //numero4, numero3
                if(numero1 > numero2){
                    //numero4, numero3, numero1, numero2
                    System.out.println(numero2+", "+numero1+", "+numero3+", "+numero4);
                }else{
                    //numero4, numero3, numero2, numero1
                    System.out.println(numero1+", "+numero2+", "+numero3+", "+numero4);
                }
            }else if(numero2 > numero3 && numero2 > numero1){
                //numero4, numero2
                if(numero1 > numero3){
                    //numero4, numero2, numero1, numero3
                    System.out.println(numero3+", "+numero1+", "+numero2+", "+numero4);
                }else{
                    //numero4, numero2, numero3, numero1
                    System.out.println(numero1+", "+numero3+", "+numero2+", "+numero4);
                }
            }else if(numero1 > numero2 && numero1 > numero3){
                //numero4, numero1
                if(numero2 > numero3){
                    //numero4, numero1, numero2, numero3
                    System.out.println(numero3+", "+numero2+", "+numero1+", "+numero4);
                }else{
                    //numero4, numero1, numero3, numero2
                    System.out.println(numero2+", "+numero3+", "+numero1+", "+numero4);
                }
            }
        }
    }
}
