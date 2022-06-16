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
 * Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300
 * y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado 
 * (debes controlar que se introduce un numero correcto), estos deben guardarse en un nuevo array.
 * 
 * Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números acabados en 5, 
 * podría salir 155, 25, etc.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
 
        //Indicamos el tamaño de los array
        int tamanioDelArreglo = Integer.parseInt(JOptionPane.showInputDialog("Introduce un tamaño"));
        int numeros[]=new int[tamanioDelArreglo];
 
        /*
        * Solicita un numero del 0 al 9 si no esta en ese intervalo lo vuelve a solicitar
        */
        int ultimoDigito;
        do{
            tamanioDelArreglo= Integer.parseInt(JOptionPane.showInputDialog("Introduce numero entre 0 y 9"));
            ultimoDigito=tamanioDelArreglo;
        }while(!(ultimoDigito>=0 && ultimoDigito<=9));
 
        //LLenamos todos los numeros aletarios del arreglo
        rellenarNumAleatorioArray(numeros, 1, 300);

        //Crear un arreglo que guardara los numeros terminados en el ultimo numero
        int numerosTerminados[]=numTerminadosEn(numeros, ultimoDigito);

        //Muestra el arreglo de numeros terminados en el ultimo numero
        mostrarArrayTerminadosEn(numerosTerminados);
 
    }
    
    /*
    * LLenar el arreglo de los numeros aleatorios
    */
    public static void rellenarNumAleatorioArray(int arregloDeNumerosAleatorios[], int a, int b){
        for(int i=0;i<arregloDeNumerosAleatorios.length;i++){
            //Generamos un número entre los parametros pasados
            arregloDeNumerosAleatorios[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    /*
    * Mostrar el arreglo de los numeros terminados en el ultimo numero
    */
    public static void mostrarArrayTerminadosEn(int arregloDeNumerosTerminados[]){
        for(int i=0;i<arregloDeNumerosTerminados.length;i++){
            //No incluimos las posiciones que tengan un 0
            if(arregloDeNumerosTerminados[i]!=0){
                System.out.println("El numero "+arregloDeNumerosTerminados[i]+" acaba en el numero deseado");
            }
        }
    }
 
    /*
    * Permite guardar los numeros terminados en el ultimo digito
    */
    public static int[] numTerminadosEn (int arregloDeNumeros[], int ultimo_numero){
 
        //Array que almacenara los numeros terminados en el numero pedido
        int terminadosEn[]=new int[arregloDeNumeros.length];
 
        int numeroFinal=0;
 
        for (int i=0;i<terminadosEn.length;i++){
 
            /*
             * Restamos el numero por el mismo numero sin unidades
             * Por ejemplo, 325-320=5
             */
            numeroFinal=arregloDeNumeros[i]-(arregloDeNumeros[i]/10*10);
 
            //Si el numero obtenido es el buscado, lo añadimos
            if (numeroFinal==ultimo_numero){
                terminadosEn[i]=arregloDeNumeros[i];
            }
        }
 
        return terminadosEn;
    }
}
