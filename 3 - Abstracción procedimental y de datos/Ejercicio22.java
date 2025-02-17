/*
Ejercicio 22: Dos números son amigos si cada uno de ellos es igual a la suma de los divisores del otro.
Por ejemplo, 220 y 284 son amigos, ya que:
- Suma de divisores de 284: 1 + 2 + 4 + 71 + 142 = 220
- Suma de divisores de 220: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 220
Construir un metodo que determine si dos números dados como parámetros son amigos o no.
A continuación, realizar un programa que muestre todas las parejas de números amigos menores
o iguales que n, siendo n un número introducido por teclado. El programa debe usar el método
previamente definido.
 */

import java.util.Scanner;

public class Ejercicio22 {
    private static int sumaDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }

        return suma;
    }

    private static boolean sonAmigos(int numero1, int numero2) {
        if (sumaDivisores(numero1) == sumaDivisores(numero2)) {
            return true;
        }

        return false;
    }

    private static void parejasAmigosHasta(int numero) {
        for (int i = 1; i <= numero; i++) {
            for (int j = i; j <= numero; j++) {
                if (sonAmigos(i, j)) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que determina las parejas de números amigos hasta un número n dado.");
        System.out.print("Introduzca el número n: ");
        int numero = sc.nextInt();

        System.out.println("\nLas parejas de números amigos hasta el numero " + numero + " son: ");
        parejasAmigosHasta(numero);
    }
}
