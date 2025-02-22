/*
Escribir el código de un programa que admita como parámetro en la línea de órdenes un número entero n.
Si el número de parámetros no es exactamente 1, debe escribir un mensaje de error y terminar.
Si no hay error, el programa debe leer números de tipo double hasta que el usuario introduzca el 00
o hasta que se hayan leído n números. Después, se informará por pantalla del número total de datos
leídos, y de la media aritmética de los mismos.
 */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor 1 para ejecutar el programa:");
        int valorInicial = sc.nextInt();

        if (valorInicial != 1) {
            System.out.println("Error. El valor introducido no es válido.");
        } else {
            System.out.println("Escriba el número de datos que va a introducir: ");
            int numeroDatos = sc.nextInt();

            System.out.println("Puede introducir hasta " + numeroDatos + " datos, " +
                    "o bien acabar el programa introduciendo el valor 0.0");

            double sumaDatos = 0;
            int datosUsados = 0;
            for (int i = 0; i < numeroDatos; i++) {
                System.out.println("Ingrese un número real: ");
                double numeroReal = sc.nextDouble();
                if (numeroReal != 0.0) {
                    sumaDatos = sumaDatos + numeroReal;
                    datosUsados++;
                } else {
                    break;
                }
            }

            System.out.println("El número de datos leídos es: " + datosUsados);
            System.out.println("La media aritmética de los datos es: " + sumaDatos / datosUsados);
        }
    }
}
