/*
Ejercicio 29: Escribir un metodo que acepte una matriz monodimensional de enteros y devuelva la suma de los
valores almacenados en dicha matriz
 */

public class Ejercicio29 {
    private static int suma(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma;
    }

    public static void main(String[] args) {
        // Test 1
        int[] A1 = {1, 2, 3, 4, 5};
        System.out.println("La suma es: " + suma(A1));

        // Test 2
        int[] A2 = {100, 25, 9, 3};
        System.out.println("La suma es: " + suma(A2));
    }
}
