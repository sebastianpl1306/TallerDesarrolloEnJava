/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2Java;

import javax.swing.JOptionPane;

/**
 * 14/06/2022
 *
 * @author Sebastian Pabon Lopez
 * Crea dos arrays de números con una posición pasado por teclado.
 * Uno de ellos estará rellenado con números aleatorios y el otro apuntara al
 * array anterior, después crea un nuevo array con el primer array (usa de nuevo
 * new con el primer array) con el mismo tamaño que se ha pasado por teclado,
 * rellenalo de nuevo con números aleatorios. Después, crea un método que tenga
 * como parámetros, los dos arrays y devuelva uno nuevo con la multiplicación de
 * la posición 0 del array1 con el del array2 y así sucesivamente. Por último,
 * muestra el contenido de cada array
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        //Indicamos el tamaño de los array
        int tamanioDelArreglo = Integer.parseInt(JOptionPane.showInputDialog("Introduce un tamaño"));

        //Se crean los arreglos
        int arreglo1[] = new int[tamanioDelArreglo], arreglo2[];

        //LLenar el primer arreglo
        rellenarNumeroAleatorioArreglo(arreglo1, 10, 100);

        //Asignamos al arreglo2 el arreglo1
        arreglo2 = arreglo1;

        //se crea un nuevo arreglo usando el creado anteriormente
        arreglo1 = new int[tamanioDelArreglo];

        //Se llena el nuevo arreglo
        rellenarNumeroAleatorioArreglo(arreglo1, 10, 100);

        //Contiene el array con el resultado de multiplicar los valores de los arrays
        int array3[] = multiplicador(arreglo1, arreglo2);

        //Mostramos el contenido de los arrays
        System.out.println("Array1");
        mostrarArray(arreglo1);

        System.out.println("Array2");
        mostrarArray(arreglo2);

        System.out.println("Array3");
        mostrarArray(array3);

        //Llamamos al recolector de basura
        System.gc();

    }

    /*
    * Permite llenar con numeros aleatorios el arreglo
    */
    public static void rellenarNumeroAleatorioArreglo(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            //Generamos un número entre los parametros pasados
            lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    /*
    * Nos permite mostrar por consola el arreglo
    */
    public static void mostrarArray(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }

    /*
    * Nos permite multiplicar y añadirlo a un arreglo
    */
    public static int[] multiplicador(int array1[], int array2[]) {
        int array3[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] * array2[i];
        }
        return array3;
    }
}
