/*
Ejercicio 13: Escribir un programa en Java que perminte generar números aleatorios, para simular el
lanzamiento de un dado. Para la generación de números aleatorios utilice la clase Random de Java.
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    private static int dadoAleatorio() {
        Random aleatorio = new Random();
        return Math.abs(aleatorio.nextInt()) % 6 + 1;
    }

    public static void main(String[] args) {
        System.out.print("Introduzca el número de tiradas aleatorias de un dado que quieras hacer: ");
        Scanner sc = new Scanner(System.in);
        int numeroTiradas = sc.nextInt();

        for (int i = 1; i <= numeroTiradas; i++) {
            System.out.println("Resultado tirada nº " + i + ": " + dadoAleatorio());
        }
    }
}
