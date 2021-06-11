package src;

import java.util.Scanner;

/*
Escribir un programa que genera la matriz transpuesta de
una matriz de 3 filas y 4 columnas. La matriz transpuesta
de una matriz M(m,n) se obtiene intercambiando filas
por columnas y viceversa; el resultado se tiene que
almacenar en una nueva matriz. Muestre las dos
matrices, una al lado de la otra.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        Ejercicio10 ejercicio10 = new Ejercicio10();
    }

    public Ejercicio10(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columans: ");
        int columnas = scanner.nextInt();
        int [][] matriz = crearMatriz(filas, columnas);
        System.out.println("\n-----GENERANDO MATRIZ-----");
        mostrarMatriz(matriz);
        System.out.println("\n-----MATRIZ TRASPUESTA-----");
        matriz = matrizTraspuesta(matriz);
        mostrarMatriz(matriz);
        System.out.println();
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
    public int [][] matrizTraspuesta(int [][] matrizO){
        int [][] matrizT = new int [matrizO[0].length][matrizO.length];
        for (int i = 0; i < matrizO.length; i++) {
            for (int j = 0; j < matrizO[i].length; j++) {
                matrizT[j][i] = matrizO[i][j];
            }
        }
        return matrizT;
    }
}
