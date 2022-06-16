/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2Java;

import javax.swing.JOptionPane;

/**
 * 14/06/2022
 * @author Sebastian Pabon Lopez
 * Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos
 * el array con números aleatorios entre 10 y 20, al final muestra por pantalla el valor de cada
 * posición y la suma de todos los valores. Haz un método para rellenar el array (que tenga
 * como parámetros los números entre los que tenga que generar), para mostrar el contenido
 * y la suma del array y un método privado para generar número aleatorio (lo puedes usar para
 * otros ejercicios).
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        //Solicitando el tamaño al usuario
        String tamañoArreglo=JOptionPane.showInputDialog("Tamaño del arreglo: ");
        int numeros[]=new int[Integer.parseInt(tamañoArreglo)];
 
        //Invocamos las funciones para llenar y mostrar el arreglo
        rellenarNumAleatorioArray(numeros, 0, 9);
        mostrarArray(numeros);
    }
 
    /*
    * Nos permite llenar el arreglo con todos los numeros aleatorios generados
    */
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    /*
    * Muestra los valores del arreglo
    */
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}
