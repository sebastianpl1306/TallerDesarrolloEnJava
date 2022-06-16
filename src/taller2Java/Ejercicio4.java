/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2Java;

/**
 * 14/06/2022
 * @author Sebastian Pabon Lopez
 * Crea un array de números de 20 posiciones, que contendrá los números del 1 al 100. Obtén
 * la suma de todos ellos y la media.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        //Declarando variables necesarias
        int sumaDeNumeros = 0;
        double numeroMedia;

        //Se crea un arreglo numeros
        int[] numeros = new int[100];

        //Se recorre el arreglo y se le asigna números y se suma
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            sumaDeNumeros += numeros[i];
        }

        //Se calcula la media y se muestra la suma y la media
        System.out.println("La suma es " + sumaDeNumeros);

        numeroMedia = (double) sumaDeNumeros / numeros.length;

        System.out.println("La media es " + numeroMedia);

    }
}
