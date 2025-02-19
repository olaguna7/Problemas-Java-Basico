/*
Ejercicio 30: Escribir un metodo que acepte una matriz monodimensional de enteros e imprima el numero mayor,
el menor y el numero de elementos de la matriz
 */

public class Ejercicio30 {
    // Metodo para calcular el maximo del array
    private static int maximo(int[] numeros) {
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        return maximo;
    }

    private static int minimo(int[] numeros) {
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        return minimo;
    }

    private static void caracteristicasArray(int[] numeros) {
        int maximo = maximo(numeros);
        int mimimo = minimo(numeros);
        System.out.println("El maximo en el array es el numero: " + maximo);
        System.out.println("El mimimo en el array es el numero: " + mimimo);
        System.out.println("El número de elementos en el array es: " + numeros.length + "\n");
    }

    public static void main(String[] args) {
        // Test 1
        int[] nums1 = {1, 2, 3, 4, 5};
        caracteristicasArray(nums1);

        // Test 2
        int[] nums2 = {5, 4, 3, 2, 1}; // Deben salir los mismos resultados que antes
        caracteristicasArray(nums2);

        // Test 3
        int[] nums3 = {65, 4, 2, 0, -5, 8};
        caracteristicasArray(nums3);
    }
}
