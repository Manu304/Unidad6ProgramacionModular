package src;
/*
Leer 10 valores de un array de enteros y deducir
cuál es la distancia que les separa del número
mayor. Los números ingresados en el array deben
de generarse aleatoriamente.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
    }

    public Ejercicio4(){
        final int CANTIDAD = 10;
        int [] arreglo = new int[CANTIDAD];
        arreglo = llenarArreglo(arreglo);
        System.out.println("\n---------VALORES---------\n");
        mostrarArreglo(arreglo);
        int numMayor = mayor(arreglo);
        System.out.println("\n--------DISTANCIAS--------\n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("La distancia entre el numero mayor (" + numMayor + ") y el valor #" + (i+1) + " es: " + distEntreNumero(numMayor, arreglo[i]));
        }
    }
    public static int aleatorio(int minimo, int maximo){
        int aleatorio = (int) Math.floor(Math.random()*(maximo-minimo+1)+minimo);
        return aleatorio;
    }

    public int distEntreNumero(int numMayor, int numMenor){
        int distancia = numMayor - numMenor;
        return distancia;
    }

    public int[] llenarArreglo(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio(1, 100);
        }
        return numeros;
    }

    public int mayor(int[] numeros){
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        return mayor;
    }
    public void mostrarArreglo(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El valor #" + (i+1) + " es: " + numeros[i]);
        }
    }
    
}