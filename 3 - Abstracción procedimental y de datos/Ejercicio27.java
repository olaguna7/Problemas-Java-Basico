/*
Ejercicio 27: Escribir un metodo que reciba como parametro un vector de enteros A y devuelva un nuevo vector B
que sea igual al vector A, pero desplazado hacia la derecha, es decir, todos sus elementos han sido desplazados
una posición hacia la derecha. Ejemplo:

A = {1, 2, 3, 4} --> B = {4, 1, 2, 3}

Nota: Téngase en cuenta que el último elemento del vector A, al ser desplazado hacia la derecha, pasa a ser
el primer elemento de B.
 */

public class Ejercicio27 {
    private static int[] desplazarDerecha(int[] numeros) {
        int[] numerosDesplazados = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {

            if (i == numeros.length - 1) {  // El numero de la ultima posicion pasa a la primera del nuevo array
                numerosDesplazados[0] = numeros[i];
            } else { // En el resto de casos, se desplaza a la derecha
                numerosDesplazados[i + 1] = numeros[i];
            }
        }

        return numerosDesplazados;
    }

    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Test 1
        int[] nums1 = {1, 2, 3, 123, 0, 4, 5};
        int[] resultado1 = desplazarDerecha(nums1);
        System.out.print("Original: ");
        imprimirArray(nums1);
        System.out.print("Desplazado a la derecha: ");
        imprimirArray(resultado1);

        // Test 2
        int[] nums2 = {10, 4, 5, 2};
        int[] resultado2 = desplazarDerecha(nums2);
        System.out.print("\nOriginal: ");
        imprimirArray(nums2);
        System.out.print("Desplazado a la derecha: ");
        imprimirArray(resultado2);
    }
}
