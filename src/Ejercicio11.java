package src;
/*
Crea un programa en el que se pida por consola el nombre
de 6 alumnos y la nota de cada uno de ellos como valor
numérico. El resultado que debe mostrarse es el nombre
de cada alumno, su nota y su calificación como texto
(Sobresaliente, Notable, Bien o Suspenso).
*/

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Ejercicio11 ejercicio11 = new Ejercicio11();
    }

    String[] nombres, estadosAsignados;
    float [] notas;
    Scanner scanner = new Scanner(System.in);
    final String[] ESTADO = {"Sobresaliente", "Notable", "Bien", "Suspendido"};
    final int CANTIDAD = 6;

    public Ejercicio11(){
        nombres = new String [CANTIDAD];
        notas = new float [CANTIDAD];
        estadosAsignados = new String [CANTIDAD];
        System.out.println("\n-----INGRESANDO DATOS-----\n");
        for (int i = 0; i < ESTADO.length; i++) {
            
        }
        for (int i = 0; i < CANTIDAD; i++) {
            nombres[i] = pedirNombre();
            notas[i] = pedirNota();
        }
        estadosAsignados = asignarEstado(notas);
        System.out.println("\n-----CALIFICACIONES------");
        for (int i = 0; i < CANTIDAD; i++) {
            System.out.println("\nAlumno: "+nombres[i] + "\nNota: " + notas[i] + "\nEstado: " + estadosAsignados[i]);
        }
    }
    public float pedirNota(){
        float nota = (float) 0;
        do {
            System.out.print("Ingrese la nota del alumno: ");
            nota = scanner.nextFloat();
            if((nota < 0) || (nota > 10)){
                System.out.println("Ingrese una nota entre 0 y 10");
            }

        } while ((nota < 0) || (nota > 10));
        return nota;
    }

    public String pedirNombre(){
        String nombre;
            System.out.print("Ingrese el nombre del alumno: ");
            nombre = scanner.next();
        return nombre;
    }
    public String [] asignarEstado(float[] notasAlumnos){
        String [] estadosCalificados = new String [notasAlumnos.length];
        for (int i = 0; i < notasAlumnos.length; i++) {
            estadosCalificados[i] = calificar(notasAlumnos[i]);
        }
        return estadosCalificados;
    }

    public String calificar(float nota){
        String calificado = "";
        if ((nota >= 0) && (nota <= (4.99))) {
            calificado = ESTADO[3];
        } else if((nota >= 5) && (nota <= (6.99))){
            calificado = ESTADO[2];
        }else if((nota >= 7) && (nota <= (8.99))){
            calificado = ESTADO[1];
        }else if((nota >= 9) && (nota <= 10)){
            calificado = ESTADO[0];
        }
        return calificado;
    }  
}