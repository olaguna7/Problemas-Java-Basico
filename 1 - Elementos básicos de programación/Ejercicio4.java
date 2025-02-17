/*
Ejercicio 4: Implementar un programa que pida por teclado el nombre de la persona, su edad y su estatura.
La edad debe guardarse en una variable de tipo byte y la estatura en un double. Después, debe sumársele
un 2 a la edad e imprimir su resultado. También, la estatura debe ser dividida entre dos e imprimir su resultado.
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduzca su edad: ");
        byte edad = sc.nextByte();

        System.out.println("Introduzca su estatura: ");
        double estatura = sc.nextDouble();

        System.out.println("La edad + 2 es igual a: " + edad + 2);
        System.out.println("La estatura entre 2 es igual a: " + estatura / 2);

    }
}
