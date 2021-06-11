package src;
/*
Hacer un array 4x3 de enteros que se llene aleatoriamente
entre [0,555]. Al final, debe mostrar la suma de todos los
números que estén en una fila par.
*/

public class Ejercicio7 {
    public static void main(String[] args) {
        Ejercicio7 ejercicio7 = new Ejercicio7();
    }

    public Ejercicio7 (){
        final int FILA = 4, COLUMNA = 3;
        int [][] matriz = new int [FILA][COLUMNA];
        matriz = llenarMatriz(matriz);
        System.out.println("\n-----MATRIZ GENERADA-----\n");
        mostrarMatriz(matriz);
        int sumaFilaPar = 0;
        System.out.println("\n------SUMA DE FILAS PAR-----\n");
        for (int i = 1; i < matriz.length; i += 2) {
            sumaFilaPar = sumaFila(matriz, i);
            System.out.println("La suma de la fila #" + (i+1) + " es: " + sumaFilaPar);
        }
        System.out.println();
    }

    public static int aleatorio(int minimo, int maximo){
        int aleatorio = (int) Math.floor(Math.random()*(maximo-minimo+1)+minimo);
        return aleatorio;
    }

    public int [][] llenarMatriz(int [][] matrizALlenar){
        for (int i = 0; i < matrizALlenar.length; i++) {
            for (int j = 0; j < matrizALlenar[i].length; j++) {
                matrizALlenar[i][j] = aleatorio(0, 555);
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

    public int sumaFila(int[][] numerosMatriz, int fila){
        int suma = 0;
        for (int i = 0; i < numerosMatriz[fila].length; i++) {
            suma += numerosMatriz[fila][i];
        }
        return suma;
    }
}