package src;
/*
Hacer un programa que llene un array de 10
enteros con números aleatorios del 0 al 99, luego
de eso los muestre en pantalla y diga cuál es el
elemento mayor y cuántas veces se repite.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2 ejercicio2 =  new Ejercicio2();
    }
    final int CANTIDAD = 10;
    int[] arreglo = new int[CANTIDAD];

    public Ejercicio2(){
        llenarArreglo(arreglo);
        mostrarArreglo(arreglo);
        int numeroMayor = mayor(arreglo);
        int repetidoMayor = numeroRepetido(numeroMayor, arreglo);
        String mensajeRepeticion = "";
        if (repetidoMayor == 1) {
            mensajeRepeticion = "1 vez.";
        } else {
            mensajeRepeticion = repetidoMayor + " veces.";
        }
        System.out.println("\nEl numero mayor es: " + numeroMayor + " y se repite: " + mensajeRepeticion);
    }
    public void llenarArreglo(int[] numeros){
        for (int i = 0; i < CANTIDAD; i++) {
            numeros[i] = aleatorio(0, 99);
        }
    }

    public int mayor(int[] numeros){
        int mayor = 0;
        for (int i = 0; i < CANTIDAD; i++) {
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    public int numeroRepetido(int num, int[] numeros){
        int contadorRepetido = 0;
        for (int i = 0; i < CANTIDAD; i++) {
            if (numeros[i] == num) {
                contadorRepetido++; 
            }
        }
        return contadorRepetido;
    }

    public static int aleatorio(int minimo, int maximo){
        int aleatorio = (int) Math.floor(Math.random()*(maximo-minimo+1)+minimo);
        return aleatorio;
    }

    public void mostrarArreglo(int[] numeros){
        for (int i = 0; i < CANTIDAD; i++) {
            System.out.println("El valor #" + (i+1) + " es: " + numeros[i]);
        }
    }
}