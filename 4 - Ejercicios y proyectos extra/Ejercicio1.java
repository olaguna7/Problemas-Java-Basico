/*
Ejercicio 1: Escribe un metodo en Java que tome un array de enteros y determine si
hay algún par de elementos distintos del array cuyo producto sea un número par
 */

public class Ejercicio1 {
    public static boolean hayProductoPar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] * numeros[j] % 2 == 0) {
                    return true;
                }
            }
        }

        // Esto se ejecutará si no se ha encontrado ningún par de números cuyo producto sea par
        return false;
    }

    public static void main(String[] args) {
        // Test 1
        int[] numeros1 = {1, 3};
        System.out.println(hayProductoPar(numeros1));

        // Test 2
        int[] numeros2 = {1, 2, 3, 4, 5, 6};
        System.out.println(hayProductoPar(numeros2));
    }
}
