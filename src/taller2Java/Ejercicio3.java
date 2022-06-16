/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2Java;

import javax.swing.JOptionPane;

/**
 * 14/06/2022
 * @author Sebastian Pabon Lopez
 *  Crea un array de números de un tamaño pasado por teclado, el array contendrá números
 * aleatorios primos entre los números deseados, por último, nos indica cual es el mayor de
 * todos. Haz un método para comprobar que el número aleatorio es primo, puedes hacer
 * todos los métodos que necesites
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        //Declarando variables
        int primoMayor;
                
        //Solicitando el tamaño al usuario
        String tamañoArreglo=JOptionPane.showInputDialog("Tamaño del arreglo: ");
        int numeros[]=new int[Integer.parseInt(tamañoArreglo)];
   
        //Invocamos la función para llenar y mostrar
        rellenarNumPrimosAleatorioArray(numeros, 1, 100);
        mostrarArray(numeros);
         
        //Obtener el numero mayor
        primoMayor=mayor(numeros);
        System.out.println("El primo más grande es el "+primoMayor);
    }
   
    /*
    * Permite llenar el arreglo con numeros aleatorios
    */
    public static void rellenarNumPrimosAleatorioArray(int lista[], int a, int b){
        int i=0;
   
        //Usamos mejor un while, ya que solo aumentara cuando genere un primo
        while(i<lista.length){           
            int numero=((int)Math.floor(Math.random()*(a-b)+b));           
            if (esPrimo(numero)){              
                lista[i]=numero;               
                i++;            
            }       
        }   
    }   
    
    /*
    * Permite verificar si el numero es primo
    */
    private static boolean esPrimo (int numero){       
          
        //Un numero negativo, el 0 y el 1, son directamente no primos.
        if (numero<=1){
            return false;
        }else{
  
            //declaracion       
            int prueba;         
            int contador=0;
            //Hacemos la raiz cuadrada y lo usamos para dividir el numero original
            prueba=(int)Math.sqrt(numero);
            //Bucle que cuenta los numeros divisibles, podemos hacerlo con while
            for (;prueba>1;prueba--){
                if (numero%prueba==0){
                    contador+=1;
                }
            }
            return contador < 1;
        }
    }
   
    /*
    * Permite mostrar el arreglo
    */
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
    
    /*
    * Permite verificar el numero mayor de un arreglo
    */
    public static int mayor(int lista[]){
        int mayor=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>mayor){
                mayor=lista[i];
            }
        }
         
        return mayor;
    }
}
