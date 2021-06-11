package src;

import java.util.Scanner;

/*
Escribir un programa que sume dos matrices
bidimensionales. Las matrices para que puedan sumarse
deben tener las mismas dimensiones.
*/
public class Ejercicio9 {

    public static void main(String[] args) {
        Ejercicio9 ejercicio9 = new Ejercicio9();
    }

    public Ejercicio9 (){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1, matriz2;
        int fila1 = 0, fila2 = 0, columna1 = 0, columna2 = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("\n------CREANDO MATRIZ " + (i+1) + "------\n");
            System.out.print("Ingrese el numero de filas de la matriz a generar: ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese el numero de columans de la matriz a generar: ");  
            int columna = scanner.nextInt();
            if (i == 0) {
                fila1 = fila;
                columna1 = columna;
            } else {
                fila2 = fila;
                columna2 = columna;
            } 
        }
        matriz1 = new int [fila1][columna1];
        matriz2 = new int [fila2][columna2];
        matriz1 = llenarMatriz(matriz1);
        matriz2 = llenarMatriz(matriz2);
        System.out.println("\n-----MATRIZ 1------");
        mostrarMatriz(matriz1);
        System.out.println("\n-----MATRIZ 2------");
        mostrarMatriz(matriz2);
        if ((matriz1.length == matriz2.length) && (matriz1[0].length == matriz2[0].length)) {
            System.out.println("\n-----SUMA DE MATRICES-----");
            int [][] suma = sumarMatriz(matriz1, matriz2);
            System.out.println("El resultado de la suma de matrices es: ");
            mostrarMatriz(suma);
        } else {
            System.out.println("No se pueden sumar las matrices");
            
        }
    }

    public int [][] crearMatriz(int fila, int columna){
        int [][] matriz = new int [fila][columna];
        matriz = llenarMatriz(matriz);
        return matriz;
    }

    public static int aleatorio(int minimo, int maximo){
        int aleatorio = (int) Math.floor(Math.random()*(maximo-minimo+1)+minimo);
        return aleatorio;
    }

    public int [][] llenarMatriz(int [][] matrizALlenar){
        for (int i = 0; i < matrizALlenar.length; i++) {
            for (int j = 0; j < matrizALlenar[i].length; j++) {
                matrizALlenar[i][j] = aleatorio(10, 99);
            }
        }
        return matrizALlenar;
    }
    public void mostrarMatriz(int [][] numerosMatriz){
        for (int i = 0; i < numerosMatriz.length; i++) {
            for (int k = 0; k < numerosMatriz[i].length; k++) {
                String valor = Integer.toString(numerosMatriz[i][k]);
                System.out.print(valor + "   ");
            }
            System.out.println("");
        }
    }
    public int [][] sumarMatriz (int [][] matriz1, int [][] matriz2){
        int [][] matrizSuma = new int [matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizSuma;
    }
}