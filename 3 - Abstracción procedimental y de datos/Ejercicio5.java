/*
Ejercicio 5:Diseñar e implementar en Java un programa que indique si una palabra es un palíndromo.
Para ello use un metodo llamado palíndromo. Escribir un programa principal que primero compruebe
que la cadena que se le pase al metodo palíndromo tiene menos de 15 caracteres. En caso de que la
cadena sea mayor, el programa principal indicará que no se va a comprobar si la cadena es palíndroma.
 */

import java.util.Scanner;

/*
Análisis:
Si la palabra tiene un número par de letras, por ejemplo: "paddap" (6 letras)
habría que analizar 3 pares de letras.
Si la palabra tiene un núpero impar de letras, por ejemplo: "solos" (5 letras)
habría que analizar 2 pares de letras. La letra del medio no se analizaría.
Es decir, si una palabra tiene "n" letras, tenemos que:
- si n es par, entonces hacemos un bucle de n/2 iteraciones
- si n es impar, entonces hacemos un bucle de [n/2] interaciones, siendo [] la parte entera.

No hace falta usar ninguna función parte entera, porque la división / entre ints devuelve un int.

Ejemplo: en la palabra "solos", de 5 letras, comparamos
el caracter 1 con el caracter 5
el caracter 2 con el caracter 4
 */

public class Ejercicio5 {
    private static boolean esPalindromo(String cadena) {
        int numeroCaracteresIguales = 0;
        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) == cadena.charAt(cadena.length() - 1 - i)) {
                numeroCaracteresIguales++;
            }
        }

        if (numeroCaracteresIguales == cadena.length() / 2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena para comprobar si es palíndromo: ");
        String cadena = sc.nextLine();
        cadena = cadena.toLowerCase();

        if (cadena.length() >= 15) {
            System.out.println("No se comprobará que la cadena es palíndromo.");
        } else {
            boolean esPalindromo = esPalindromo(cadena);
            if (esPalindromo) {
                System.out.println("La cadena \"" + cadena + "\" sí es palindromo");
            } else {
                System.out.println("La cadena " + cadena + " no es palindromo");
            }
        }
    }
}
