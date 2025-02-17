/*
Crear un programa que permita contar el cambio de monedas en EE.UU. A tal efecto, considerar que en
EE.UU. un quarter es una moneda de 25 centavos de dólar, un dime es la moneda de 10 centavos,
el nickel es la moneda de 5 centavos y el penny es la moneda de 1 centavo. El programa debe pedir
el número de quarters, dimes, nickels y pennies, y devuelve el total (en dolares) a que correspondan,
imprimiéndolo con 2 decimales de precisión.
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número total de quarters: ");
        int quarters = sc.nextInt();

        System.out.println("Ingrese el número total de dimes: ");
        int dimes = sc.nextInt();

        System.out.println("Ingrese el número total de nickels: ");
        int nickels = sc.nextInt();

        System.out.println("Ingrese el número total de pennies: ");
        int pennies = sc.nextInt();

        int centavos = 25 * quarters + 10 * dimes + 5 * nickels + pennies;
        double dolares = centavos / 100.0;    // 1 dolar = 100 centavos
        System.out.printf("El total de dólares es: %.2f", dolares);
    }
}
