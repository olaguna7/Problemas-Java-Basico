/*
Ejercicio 3: Escribir un metodo que, dada una cadena de caracteres, calcule la suma de todos los
los dígitos que hay en ella. Escribir un programa que, dada por línea de órdenes invoque al metodo
anterior e imprima la sunma de los dígitos de la cadena Use el metodo printf.
 */

import java.util.Scanner;

public class Ejercicio03 {
    private static int contarNumerosCadena(String cadena) {
        int numeros = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                numeros++;
            }
        }

        return numeros;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una cadena: ");
        String cadena = sc.nextLine();

        int numerosCadena = contarNumerosCadena(cadena);
        System.out.println("La cantidad de números en la cadena es: " + numerosCadena);
    }
}
