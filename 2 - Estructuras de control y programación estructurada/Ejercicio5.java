/*
Desarrollar un programa que analice los resultados (calificaciones) de exámenes.
El programa deberá:
- Aceptar una serie de puntuaciones
- Evaluar la media
- Determinar la nota máxima
- Mostrar la media y la nota máxima
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> notas = new ArrayList<>();
        // Se leen notas hasta que el usuario introduzca el valor -1
        double nota = 0;  // Inicializamos la variable nota

        while (nota != -1) {
            System.out.println("Introduzca nota (para terminar introduzca un -1): ");
            nota = sc.nextDouble();
            notas.add(nota);
        }

        // La última nota añadida siempre será un -1 para terminar el programa
        // Eliminamos ese elemento
        notas.remove(notas.size() - 1);

        // Calcular la nota media
        // Determinar la nota máxima
        double sumaNotas = 0;
        double notaMaxima = notas.get(0);
        for (int i = 0; i < notas.size(); i++) {
            sumaNotas = sumaNotas + notas.get(i);

            if (notas.get(i) >= notaMaxima) {
                notaMaxima = notas.get(i);
            }
        }

        // La nota media será la suma de notas entre el número de notas que tengamos
        double notaMedia = sumaNotas / notas.size();

        System.out.println("Nota media = " + notaMedia);
        System.out.println("Nota máxima = " + notaMaxima);

    }
}
