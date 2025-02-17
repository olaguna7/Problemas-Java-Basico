/*
Ejercicio 5: Escribir un programa que solicite al usuario su nombre y que tras leerl escriba "Hola,"
seguido del nombre leído.
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Hola, " + nombre);
    }
}
