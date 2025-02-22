/*
Ejercicio 6: Escribir un programa que contenga cuatro metodos, aparte del main.
- El primero de ellos, llamado suma, debe recibir dos números enteros y devolver la suma de
esos dos números.
- El segundo metodo, también llamado suma, recibirá un número como parámetro y lo sumará a un
entero que pedirá por teclado usando la clase Scanner. Dicho metodo devolverá la suma de los
dos números.
- El tercer metodo, también llamado suma, recibirá dos cadenas y devolverá la suma del número de
caracteres de las dos cadenas.
- El cuarto metodo se llamará sumaCadenas, recibirá tres cadenas como parámetros y devolverá una
frase que sea la unión (concatenación) de esas tres cadenas.
 */

import java.util.Scanner;

public class Ejercicio06 {
    private static Scanner sc = new Scanner(System.in);

    private static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    private static int suma(int numero) {
        System.out.println("Introduzca un número: ");
        int numeroIntroducido = sc.nextInt();

        return numero + numeroIntroducido;
    }

    private static int suma(String cadena1, String cadena2) {
        return cadena1.length() + cadena2.length();
    }

    private static String sumaCadenas(String cadena1, String cadena2, String cadena3) {
        return cadena1 + " " + cadena2 + " " + cadena3;
    }

    public static void main(String[] args) {

        System.out.println("Test método 1: ");
        int resultadoMetodo1 = suma(3, 5);
        System.out.println(resultadoMetodo1);

        System.out.println("\nTest método 2");
        int resultadoMetodo2 = suma(7);
        System.out.println(resultadoMetodo2);

        System.out.println("\nTest método 3");
        int resultadoMetodo3 = suma("Programa", "Modular");
        System.out.println(resultadoMetodo3);

        System.out.println("\nTest método 4");
        String resultadoMetodo4 = sumaCadenas("Voy", "a", "aprobar");
        System.out.println(resultadoMetodo4);

    }
}
