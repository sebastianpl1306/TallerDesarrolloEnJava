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
 * Crea un array de números y otro de String de 10 posiciones donde insertaremos notas entre 0 y 10 
 * (debemos controlar que inserte una nota valida), pudiendo ser decimal la nota en el array de números, 
 * en el de Strings se insertaran los nombres de los alumnos.
 * 
 * Después, crearemos un array de String donde insertaremos el resultado de la nota con palabras.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
 
        //Tamaño del arreglo
        final int TAMANIO=10;
 
        //Creamos los arreglos para guardar la iformación de las 
        String nombres[]=new String[TAMANIO];
        double notas[]=new double[TAMANIO];
 
        //Rellenamos el array de las notas
        rellenarArregloDeAlumnos(notas, nombres);
 
        //Devuelve las notas con palabras
        String resultado[]=agregarResultadoNotas(notas);
 
        //Mostramos el resultado
        mostrarArregloEstudiantes(nombres, notas, resultado);
 
    }

    /*
    * Permite llenar el arreglo de los alumnos
    */
    public static void rellenarArregloDeAlumnos(double notas[], String nombres[]){
        for(int i=0;i<notas.length;i++){
            //Introducimos los valores de una vez, se pueden hacer en metodos separados
            nombres[i]=JOptionPane.showInputDialog("Introduce el nombre del alumno "+(i+1));
 
            double nota;
            //Validamos la nota
            do{
                String texto=JOptionPane.showInputDialog("Introduce una nota del alumno "+(i+1));
                nota=Double.parseDouble(texto);
                System.out.println(nota<=0 || nota>=10);
            }while(nota<=0 || nota>=10);
            notas[i]=nota;
        }
    }

    /*
    * Permite mostrar el arreglo de los alumnos y sus notas
    */
    public static void mostrarArregloEstudiantes(String nombres[], double notas[], String resultado[]){
        for(int i=0;i<nombres.length;i++){
            System.out.println("El alumno "+nombres[i]+" tiene una nota de "+notas[i]+", por lo que su resultado es "+resultado[i]);
        }
    }
 
    /*
    * Permite verificar el resultado basado en la calificación
    */
    public static String[] agregarResultadoNotas(double notas[]){
 
        String resultado[]=new String[notas.length];
        for(int i=0;i<notas.length;i++){
            //Convertimos la nota a entero, despues se quedara como estaba
            switch((int)notas[i]){
                case 1:
                case 2:
                case 3:
                case 4:
                    resultado[i]="Suspenso";
                    break;
                case 5:
                case 6:
                    resultado[i]="Bien";
                    break;
                case 7:
                case 8:
                    resultado[i]="Notable";
                    break;
                case 9:
                case 10:
                    resultado[i]="Sobresaliente";
                    break;
            }
        }
        return resultado;
    }
}
