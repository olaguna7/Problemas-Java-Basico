/*
Ejercicio 12:Construir un programa que devuelva los distintos n´meros primos cexistentes desde el 1
hasta un número introducido como parámetro por la línea de órdenes.
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero positivo: ");
        int numero = sc.nextInt();

        // Un número primo solo tiene dos divisores (el 1 y él mismo)
        // Para cada número 1, 2, 3, ...., n, contamos los divisores de cada uno de ellos

        System.out.println("Los números primos desde el 1 hasta el " + numero + " son: ");
        for (int i = 2; i <= numero; i++) {
            int numeroDivisores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numeroDivisores++;
                }
            }

            // Si el número de divisores es exactamente 2, será un número primo
            if (numeroDivisores == 2) {
                System.out.println(i);
            }
        }
    }
}
