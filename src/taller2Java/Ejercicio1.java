/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2Java;

import javax.swing.JOptionPane;

/**
 * 14/06/2022
 * @author Sebastian Pabon Lopez
 * Crea un array de 5 posiciones de números con valores pedidos por teclado. Muestra por
 * consola el índice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores
 * y otro para mostrar
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        //Declarando arreglo numeros
        int numeros[]=new int[10];
 
        //Invocamos los metodos que permiten rellar y mostrar los numeros
        rellenarArray(numeros);
        mostrarArray(numeros);
    }
 
    /*
    * Permite llenar el arreglo con los valores dados por el usuario
    */
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto = JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    /*
    * Permite mostrar los datos que estan dentro del arreglo
    */
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}
