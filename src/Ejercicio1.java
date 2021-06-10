package src;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 =  new Ejercicio1();
    }
    final int CANTIDAD = 5;
    int[] elementos = new int[CANTIDAD];

    public Ejercicio1(){
        for (int i = 0; i < CANTIDAD; i++) {
            pedirValor(i);
        }
        System.out.println("");
        for (int i = 0; i < CANTIDAD; i++) {
            mostrarValor(i);
        }

        System.out.println("\nEl promedio de los valores ingresados es: " + this.calculoPromedio());
    }

    public void pedirValor(int num){
        System.out.print("Ingrese el valor #" + num + ": ");
        Scanner scanner = new Scanner(System.in);
        elementos[num] = scanner.nextInt();
    }

    public void mostrarValor(int num){
        System.out.println("El valor en el indice " + "[" + num + "]" + " es: " + elementos[num]);
    }

    public float calculoPromedio(){
        int suma = 0;
        for (int i = 0; i < CANTIDAD; i++) {
            suma += elementos[i];
        }
        float promedio = (float) suma/CANTIDAD;
        return promedio;
    }  
}