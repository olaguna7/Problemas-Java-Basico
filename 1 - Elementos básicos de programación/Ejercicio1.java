/*
Ejercicio 1: Escribir una aplicación Java que imprima la frase “Saber es poder”,
a) en una línea
b) cada palabra en una línea
c) dentro de una caja hecha con los caracteres ‘=’ y ‘|’
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Apartado (a)
        System.out.println("Saber es poder");

        // Apartado (b)
        System.out.println("Saber \nes \npoder");

        // Apartado (c)
        System.out.println("|=========================|");
        System.out.println("|     Saber es poder      |");
        System.out.println("|=========================|");
    }
}
