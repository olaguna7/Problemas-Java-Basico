/*
Ejercicio 17: El número armónico de orden n (Hn) es la suma de los recíprocos de los n primeros
números naturales:

Hn = 1 + 1/2 + 1/3 + ... + 1/n

Escribir un programa en Java que solicite por teclado el orden, n, de un número armónico,
calcule este último, y lo imprima con cinco decimales de precisión. Para ello, el programa
deberá comprobar que el valor n introducido cumple que n >= 1. Si no es así, volverá a solicitar
el número n hasta que se introduzca un valor correcto.
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número natural mayor o igual que 1: ");
        int numero = sc.nextInt();
        while (numero < 1) {
            System.out.println("Error. Debe introducir un número mayor o igual que 1.");
            System.out.println("Introduzca el número de nuevo: ");
            numero = sc.nextInt();
        }

        double numeroArmonico = 0;
        for (int i = 1; i <= numero; i++) {
            numeroArmonico = numeroArmonico + 1.0 / i;
        }

        System.out.println("El número armónico de orden " + numero + " es: " + numeroArmonico);
    }
}
