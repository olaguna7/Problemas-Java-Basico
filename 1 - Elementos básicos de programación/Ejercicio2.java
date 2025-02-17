/*
Ejercicio 2: Escribir un programa que lea por teclado un número real y un número entero,
calcule la división entre ambos y posteriormente obtenga el módulo entre el resultado
entero de la operación y el entero original. Dicho programa debe imprimir el valor de
la división y el del módulo por pantalla.
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número real: ");
        double numeroReal = sc.nextDouble();

        System.out.println("Escribe un número entero: ");
        int numeroEntero = sc.nextInt();

        double division = numeroReal / numeroEntero;
        int modulo = (int) numeroReal % numeroEntero;
        System.out.println("El resultado de la división " + numeroReal + "/" + numeroEntero + " es:" + division);
        System.out.println("El resultado del modulo es: " + modulo);
    }
}
