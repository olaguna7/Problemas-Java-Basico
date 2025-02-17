/*
Ejercicio 1: Escribir un programa que reciba 2 números reales por línea de órdenes, comprueba
cuál es mayor y lo imprima. Si los dos números son iguales, también lo debe indicar.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Escribe el segundo número: ");
        double numero2 = sc.nextDouble();


        if (numero1 > numero2) {
            System.out.println("El mayor número es: " + numero1);
        }
        else if (numero1 < numero2) {
            System.out.println("El mayor número es: " + numero2);
        }
        else {
            System.out.println("Los dos números son iguales");
        }

        sc.close();
    }
}
