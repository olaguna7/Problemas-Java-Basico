/*
Ejercicio 17: Realizar un programa que calcule el perímetro y el área de un círculo. Después de
mostrar el resultado, el programa debe preguntar si se quiere calcular el perímetro y área de
otro círculo.
 */

import java.util.Scanner;

public class Ejercicio17 {
    final static double PI = 3.14159265358979323846;
    private static double calcularPerimetroCirculo(double radio) {
        return 2 * PI * radio;
    }

    private static double calcularAreaCirculo(double radio) {
        return PI * radio * radio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de perímetro y area de circulos.");

        boolean seguir = true;
        while (seguir) {
            System.out.print("Ingrese el radio del círculo: ");
            double radio = sc.nextDouble();

            double perimetro = calcularPerimetroCirculo(radio);
            double area = calcularAreaCirculo(radio);
            System.out.println("El perímetro del círculo es: " + perimetro);
            System.out.println("El área del círculo es: " + area);

            System.out.println("¿Quiere seguir con otro círculo? (S/N): ");
            seguir = sc.next().equals("S");
        }
    }
}
