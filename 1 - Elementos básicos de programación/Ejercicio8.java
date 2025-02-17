/*
Ejercicio 8: La ecuación genérica de una parábola en el plano xy es y = ax^2 + bx + c.
Escribir un programa que lea los coeficientes (reales) a, b y c, solicite al usuario un valor
de x (a introducir también por el teclado) e imprima el valor correspondiente de y.
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el valor del coeficiente a: ");
        double a = sc.nextDouble();
        System.out.println("Escribe el valor del coeficiente b: ");
        double b = sc.nextDouble();
        System.out.println("Escribe el valor del coeficiente c: ");
        double c = sc.nextDouble();
        System.out.println("Escribe el valor de x: ");
        double x = sc.nextDouble();

        // No hay operador matemático para la potencia. a^2 = a * a
        double y = a * x * x + b * x + c;
        System.out.println("y = " + y);
    }
}
