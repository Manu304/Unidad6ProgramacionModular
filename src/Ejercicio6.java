package src;
/*
Escribir un programa que multiplique por dos los
elementos de la siguiente matriz:
5 6 13
14 2 4
21 7 6
*/
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Ejercicio6 ejercicio6 = new Ejercicio6();
    }
    int[][] matriz;
    final int FILA = 3;
    final int COLUMNA = 3;
    Scanner scanner = new Scanner(System.in);

    public Ejercicio6(){
        matriz = new int [FILA][COLUMNA];
        matriz = llenarMatriz(matriz);
        System.out.println("\n------MATRIZ ORIGINAL-----\n");
        mostrarMatriz(matriz);
        System.out.print("\nIngrese un numero para multiplicar la matriz: ");
        int multiplicando = scanner.nextInt();
        int [][] matrizMultiplicada = multiplicarMatriz(matriz, multiplicando);
        System.out.println("\n-----NATRIZ MULTIPLICADA-----\n");
        mostrarMatriz(matrizMultiplicada);
    }
    public int[][] llenarMatriz(int[][] numerosMatriz){
        //numerosMatriz = new int [FILA] [COLUMNA];
        numerosMatriz [0] [0] = 5;
        numerosMatriz [0] [1] = 6;
        numerosMatriz [0] [2] = 13;
        numerosMatriz [1] [0] = 14;
        numerosMatriz [1] [1] = 2;
        numerosMatriz [1] [2] = 4;
        numerosMatriz [2] [0] = 21;
        numerosMatriz [2] [1] = 7;
        numerosMatriz [2] [2] = 6;
        return numerosMatriz;
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

    public int [][] multiplicarMatriz(int[][] numerosMatriz, int num){
        for (int i = 0; i < numerosMatriz.length; i++) {
            for (int k = 0; k < numerosMatriz[i].length; k++) {
                numerosMatriz[i][k] *= num;
            }
        }
        return numerosMatriz;
    }  
}