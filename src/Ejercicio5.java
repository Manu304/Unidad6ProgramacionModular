package src;

import java.util.Scanner;

/*
En un arreglo tenemos las notas de un grupo de alumnos de una clase
con valores Nota[0], Nota[1], ..., Nota[n – 1], establecidas entre 0 y 10. El
último dato es una bandera con valor –50. El número de notas que
contiene el arreglo no se conoce, pero se sabe que el mínimo número de
alumnos en la clase es 1 y el máximo 100. Se desea crear un programa
que determine la nota media.
a. 5, 7, 2, 3, 9, 5, 6, 8, - 50
b. 6,-50,
c. 1, 5, 4, 7, 6, 2, 7, 8, 3, 2, 9, 4, 5, 3, 6, 6, 8, 8, - 50
Para este ejercicio debe crear una función que inicializa el arreglo.
Una función para calcular el valor medio
Debe de realizar los cálculos de los tres conjuntos de notas sugeridos en la
misma ejecución del programa.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Ejercicio5 ejercicio5 = new Ejercicio5();
    }

    Scanner scanner = new Scanner(System.in);
    final int TOTAL_ALUMNOS = 100;
    int[] notas;
    //int contador = 0;
    
    public Ejercicio5 (){
        char opcion = 'S';
        do {
            System.out.println("\nBienvenido, puede calcular el promedio de notas de un maximo de 100 alumnos");
            notas = new int[TOTAL_ALUMNOS];
            System.out.println("------INGRESANDO NOTAS------");
            pedirNotas();
            float promedio = calculoPromedio(cantidadDeNotas());
            System.out.println("-----MEDIA DE LA NOTAS------");
            System.out.println("\nLa media de las notas ingresadas es: " + promedio);
            System.out.print("\nDesea ingresar otro grupo de notas? (S/N): ");
            opcion = scanner.next().toUpperCase().charAt(0);
        } while (opcion != 'N');
        System.out.println("\nVuelva poronto");
        
    }
    public void pedirNotas(){
        int notaIngresada = 0;
        int contador = 0;
        
        do {
            System.out.print("Ingrese la nota: ");
            notaIngresada = scanner.nextInt();
            if (notaIngresada != (-50)) {
                //do {
                
                    if ((notaIngresada >= 0) && (notaIngresada <= 10)) {
                        notas[contador] = notaIngresada;
                        contador++;
                    }else{
                        System.out.println("\nNO INGRESADO. La nota debe ser un valor entre 1 y 10.\n");
                    }
                //} while ((notaIngresada < 0) || (notaIngresada > 10));
            }else{
                notas[(contador+1)] = notaIngresada;  
            }
        } while (notaIngresada != (-50));
    }
    public float calculoPromedio(int totalDatos){
        int suma = 0;
        for (int i = 0; i <= totalDatos; i++) {
            suma += notas[i];
        }
        float promedio = (float) suma/(totalDatos);
        return promedio;
    }
    public int cantidadDeNotas(){
        int cantidadNota = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 0) {
                cantidadNota++;
            } else {
                break;
            }
        }
        return cantidadNota;
    }
}