/*
Ejercicio 9: Escribir un metodo que evalúe el factorial de un número N Además, escribir un
metodo que lea por línea de órdenes el valor de N e imprima su factorial usando el metodo anterior.
 */

import java.util.Scanner;

public class Ejercicio9 {
    final static Scanner KEYBOARD = new Scanner(System.in);

    private static int calcularFactorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    private static void imprimirFactorial() {
        System.out.print("Introduzca el número para calcular su factorial: ");
        int numero = KEYBOARD.nextInt();

        int factorial = calcularFactorial(numero);
        System.out.println(numero + "! = " + factorial);
    }

    public static void main(String[] args) {
        // Test
        imprimirFactorial();
    }
}
