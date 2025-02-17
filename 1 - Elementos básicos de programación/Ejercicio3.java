/*
Ejercicio 3: Escribir un programa que convierta grados centígrados en fahrenheit teniendo en cuenta
que la relación es ºF = 9/5 ºC + 32. Dicho programa debe imprimir el resultado de la conversión con
4 decimales de precisión.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en ºC: ");
        double temperaturaCentigrados = sc.nextDouble();

        // Se pone el 9.0 porque si no, la división sale un int
        double temperaturaFahrenheit = (9.0 / 5) * temperaturaCentigrados + 32;
        System.out.printf("La temperatura en fahrenheit es: %.4f ºF", temperaturaFahrenheit);
    }
}
