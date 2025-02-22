/*
Ejercicio 7: Escribir un metodo que compruebe si un año es bisiesto o no. El metodo debe recibir
como argumento un año y devolver verdadero o falso dependiendo de si el año es bisiesto o no.
De acuerdo al calendario Gregoriano, un año es bisiesto si es divisible por 4, excepto aquellos
divisibles por 100, que para ser bisiestos deben ser también divisibles por 400.
Además, hacer un programa que, dado un año, imprima si es bisiesto usando el metodo hecho anteriormente.
 */

import java.util.Scanner;

public class Ejercicio07 {
    final static Scanner KEYBOARD = new Scanner(System.in);

    private static boolean esBisiesto(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.print("Introduzca un año para comprobar si es bisiesto: ");
        int year = KEYBOARD.nextInt();

        if (esBisiesto(year)) {
            System.out.println("El año " + year + " es bisiesto");
        } else {
            System.out.println("El año " + year + " no es bisiesto");
        }
    }
}
