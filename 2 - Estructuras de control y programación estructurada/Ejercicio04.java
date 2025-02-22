/*
Escribir un programa que calcule la suma de los cuadrados comprendidos entre 1 y N, donde N es
un entero que se lee por teclado.
 */

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el valor de N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + "^2 = " + i * i);
        }
    }
}
