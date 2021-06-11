package src;

import java.util.Scanner;

/*
Para dos arrays unidimensionales de strings de 5
elementos, solicite al usuario palabras. Después compare
si el tamaño de letras de la posición [0] del array 1 es igual
al del array 2, y escriba en pantalla indice, tamanio y si
son iguales.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Ejercicio8 ejercicio8 = new Ejercicio8();
    }

    public Ejercicio8(){
        final int CANTIDAD = 5;
        String[] palabras = new String [CANTIDAD];
        String[] palabras2 = new String [CANTIDAD];
        System.out.println("\n------INGRESANDO PALABRAS (Arreglo 1)------\n");
        palabras = llenarArreglo(palabras);
        System.out.println("\n------INGRESANDO PALABRAS (Arreglo 2)------\n");
        palabras2 = llenarArreglo(palabras2);
        System.out.println("\n------COMPARANDO CANTIDAD DE LETRAS ENTRE ARREGLOS------\n");
        compararArreglos(palabras, palabras2);
        System.out.println();
    }

    public String [] llenarArreglo(String [] arregloALlenar){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arregloALlenar.length; i++) {
            System.out.print("Ingrese una palabra para el arreglo: ");
            arregloALlenar[i] = scanner.next();
        }
        return arregloALlenar;
    }

    public void compararArreglos(String[] arreglo1, String [] arreglo2){
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i].length() == arreglo2[i].length()) {
                System.out.println("En el indice[" + i + "]" + " ambos arreglos poseen la misma cantidad de letras " + "(" + arreglo1[i].length() + " letras)");
            } else {
                System.out.println("En el indice[" + i + "]" + " los arreglos no tienen la misma cantidad de letras :(");
            }
        }
    } 
}