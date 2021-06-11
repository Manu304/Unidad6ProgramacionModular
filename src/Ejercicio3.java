package src;

import java.util.Scanner;

/*
Hacer una array unidimensional que acepte ocho
números enteros. Luego le pregunte al usuario
que ingrese un número a buscar, implementar
una función que busque ese número, si lo
encuentra, debe retornar un valor de verdaderos,
en caso contrario, retornar falso.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
    }
    Scanner scanner = new Scanner(System.in);
    public Ejercicio3(){
        final int CANTIDAD = 8;
        int [] arreglo = new int [CANTIDAD];
        arreglo = llenarArreglo(arreglo);
        System.out.print("\nQue valor desea buscar: ");
        int num = scanner.nextInt();
        if (buscar(num, arreglo)) {
            System.out.println("\nEl numero ha sido encontrado :)\n");
            
        } else {
            System.out.println("\nEl numero no se ha encontrado :(\n");
        }
    }

    public int[] llenarArreglo(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor #" + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    public boolean buscar(int num, int[] numeros){
        boolean correcto = false;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == num){
                correcto = true;
            }
        }
        return correcto;
    }
}