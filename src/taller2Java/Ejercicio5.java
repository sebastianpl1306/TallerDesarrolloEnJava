/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2Java;

import java.util.Scanner;

/**
 * 14/06/2022
 * @author Sebastian Pabon Lopez
 * Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). Después,
 * ve pidiendo posiciones del array por teclado y si la posición es correcta, se añadirá a una
 * cadena que se mostrara al final, se dejará de insertar cuando se introduzca un -1.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        //Se inicializa el scanner
        Scanner scan = new Scanner(System.in);
 
        //Se crea el arreglo y se le asignan las mayusculas
        char palabrasMayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            palabrasMayusculas[j] = (char) i;
        }
 
        //Inicializa la variable que guarda la palabra generada
        String palabraGenerada = "";
        int eleccion = -1;
 
        //Permite solicitar al usuario x cantidad de palabras
        do {
            System.out.println("Elija un indice entre 0 y " + (palabrasMayusculas.length - 1));
            eleccion = scan.nextInt();
 
            if (!(eleccion >= 0 && eleccion <= palabrasMayusculas.length - 1)) {
                System.out.println("Error, inserte otro numero");
            } else {
                if (eleccion != -1) {
                    palabraGenerada += palabrasMayusculas[eleccion];
                }
            }
 
        } while (eleccion != -1);
 
        System.out.println(palabraGenerada);
 
    }
}
