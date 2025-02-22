/*
Ejercicio 6: Realizar un programa que, dado un número entero introducido por línea de órdenes,
calcule y visualice por pantalla la suma y el número de sus cifras y además muestre el resultado
de invertir el orden de sus cifras.
 */

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número entero n: ");
        int n = sc.nextInt();

        /*
        NOTA: Al hacer la división de un número entre 10 consecutivamente, nos van saliendo los números
        en orden inverso. Ejemplo: numero 213

        Al dividir 213 entre 10, el cociente es 21 y EL RESTO ES 3 <- Tercer numero
        Al dividir 21 entre 10, el cociente es 2 y EL RESTO ES 1 <- Segundo numero
        Al dividir 2 entre 10, el cociente es 0 y EL RESTO ES 2 <- Primer numero
        Se divide n entre 10 hasta que n sea igual a 0, y se van imprimiendo los números al revés (los restos)
         */
        int sumaCifras = 0;
        System.out.println("El número " + n + " al revés es: ");

        while (n != 0) {
            int resto = n % 10;
            System.out.print(resto);
            n = n / 10;
            sumaCifras = sumaCifras + resto;
        }

        System.out.println("\nLa suma de sus cifras es: " + sumaCifras);
    }
}
