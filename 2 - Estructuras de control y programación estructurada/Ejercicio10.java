/*
Ejercicio 10: Escribir un programa que calcule el productorio de un número natural n.
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero positivo: ");
        int numero = sc.nextInt();

        int productorio = 1;
        for (int i = 1; i <= numero; i++) {
            productorio = productorio * i;
        }

        System.out.println("El productorio desde 1 hasta " + numero + " es: " + productorio);
    }
}
