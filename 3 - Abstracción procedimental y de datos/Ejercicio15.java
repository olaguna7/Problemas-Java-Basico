/*
Ejercicio 15: Sean a y b dos números enteros positivos o cero. Escribir un metodo que calcule
la potencia a^b sin usar el metodo pow() de java. Escribir un metodo main que, dados dos numeros
a y b leidos por linea de ordenes, calcule la potencia a^b usando el metodo escrito anteriormente.
Solo se calculará la potencia si tanto a como b son multiplos de 2.
 */

import java.util.Scanner;

public class Ejercicio15 {
    final static Scanner KEYBOARD = new Scanner(System.in);

    private static int potencia(int a, int b) {
        int resultado = a;
        for (int i = 2; i <= b; i++) {
            resultado = resultado * a;
        }

        return resultado;
    }

    // Pide un número hasta que sea mayor o igual que cero y múltiplo de 2
    private static int introducirNumeroCorrecto() {
        int numero = KEYBOARD.nextInt();

        while ((numero % 2 != 0) || (numero < 0)) {
            if (numero % 2 == 0) {
                System.out.println("El número no es múltiplo de 2. Ingrese el número de nuevo: ");
                numero = KEYBOARD.nextInt();
            } else if (numero < 0) {
                System.out.println("El número debe ser positivo. Ingrese el número de nuevo: ");
                numero = KEYBOARD.nextInt();
            }
        }

        return numero;
    }

    public static void main(String[] args) {
        System.out.println("Calculadora de potencias a^b");
        System.out.println("Introduzca el valor de a: ");
        int a = introducirNumeroCorrecto();
        System.out.println("Introduzca el valor de b: ");
        int b = introducirNumeroCorrecto();

        System.out.println(a + "^" + b + " = " + potencia(a, b));
    }
}
