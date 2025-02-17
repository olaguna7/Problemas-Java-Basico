/*
Ejercicio 20: Construir un programa que obtenga el término n de la serie de Fibonacci.
El valor de n deberá leerse por teclado. La serie de fibonacci es una secuencia de enteros
positivos, cada uno de los cuales es la suma de los dos anteriores. Los dos primeros números
de la secuencia son 0 y 1. La serie se define como:

Fibonacci(n) = n, si n = 1
Fibonacci(n) = Fibonacci(n - 1) + Fibonacci(n - 2), si n > 1

El programa tendrá, además del metodo main, un metodo iterativo (no usar recursividad) para calcular
el término de la serie.
 */

import java.util.Scanner;

public class Ejercicio20 {

    // No se debe usar recursividad
    // El término n-ésimo es la suma del término n - 1 y del término n - 2
    // Para ello tenemos que conocer dos términos de la sucesión (los dos primeros)
    private static int fibonacci(int n) {
        int suma = 0;

        int penultimoTermino = 0;
        int ultimoTermino= 1;
        if (n == 1) {
            suma = 0;
        } else if (n == 2) {
            suma = 1;
        } else if (n > 2){
            for (int i = 2; i <= n; i++) {
                suma = penultimoTermino + ultimoTermino;

                // En la siguiente iteración, el ultimo termino pasa a ser el penultimo
                // Y el termino de esta anterior se convierte en el ultimo termino de la siguiente
                penultimoTermino = ultimoTermino;
                ultimoTermino = suma;
            }
        } else {
            suma = n;
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el término que quiere calcular de la sucesion de fibonacci: ");
        int termino = sc.nextInt();

        System.out.println("El término " + termino + " de fibonacci es: " + fibonacci(termino));

    }
}
