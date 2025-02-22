/*
Ejercicio 2: Suponer que r1 y r2 son dos números reales. Escribir el código necesario para determinar
si son iguales suponiendo que la precisión de la representación numérica es p.
Cuando la comparación se realiza con números en punto flotante .........
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precision = 0.001;

        System.out.println("Escriba el primer número real: ");
        double numero1 = sc.nextDouble();

        System.out.println("Escriba el segundo número real: ");
        double numero2 = sc.nextDouble();

        if (Math.abs(numero1 - numero2) < precision) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números son distintos");
        }

        sc.close();

    }
}
