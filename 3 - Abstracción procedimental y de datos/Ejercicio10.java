/*
Construir un programa con dos métodos que usen el mismo identificador (nombre).
- El primer metodo determinará el máximo de dos números pasados como parámetro.
- El segundo, obtendrá el máximo de tres números pasados como parámetros.
En ambos casos, los valores numéricos se introducirán por línea de órdenes.
 */

import java.util.Scanner;

public class Ejercicio10 {
    private static int maximo(int numero1, int numero2) {
        if (numero1 >= numero2) {
            return numero1;
        }

        return numero2;
    }

    private static int maximo(int numero1, int numero2, int numero3) {
        if (numero1 >= numero2) { // n1 >= n2
            if (numero1 >= numero3) {   // n1 >= n2 y n1 >= n3
                return numero1;
            } else {    // n1 >= n2 y n1 < n3 --> n3 > n1 >= n2
                return numero3;
            }
        } else { // n1 < n2
            if (numero2 >= numero3) { // n2 >= n3 y n1 < n2 --> n2 es el maximo
                return numero2;
            } else { // n1 < n2 y n2 < n3
                return numero3;
            }
        }

        // Aclaración: se pueden eliminar algunos "elses", pero se usan para mejorar la lectura de codigo
    }

    public static void main(String[] args) {
        // Test metodo 1
        int maximoMetodo1 = maximo(1, 9);
        System.out.println("El maximo de los números 1 y 9 es: " + maximoMetodo1);

        // Test metodo 2
        int maximoMetodo2 = maximo(1, 17, 3);
        System.out.println("El maximo de los numeros 1, 17 y 3 es: " + maximoMetodo2);
    }
}
