/*
Escribir un metodo que reciba dos vectores A y B de enteros del mismo tamaño y devuelva el sumatorio de
la multiplicación inversa de ambas matrices, es decir, multiplique el primer elemento de A por el último de
B, el segundo elemento de A por el penúltimo de B, y así sucesivamente, sumándolos todos.

Ejemplo:
A = {1, 2, 3}, B = {6, 7, 8} --> Resultado = 1 * 8 + 2 * 7 + 3 * 6 = 40
 */

public class Ejercicio28 {
    private static int multiplicarInversas(int[] vectorA, int[] vectorB) {
        int resultado = 0;

        for (int i = 0; i < vectorA.length; i++) { // Recorre el vector A de izquierda a derecha
            for (int j = vectorB.length - 1; j >= 0; j--) { // Recorre el vector B de derecha a izquierda
                resultado = resultado + vectorA[i] * vectorB[j];
            }
        }

        return resultado;
    }

    /*
    OPCIONAL: se pueden pedir por consola los elementos de cada vector, y controlar que ambos vectores
    introducidos tengan la misma longitud para ejecutar el programa
     */

    public static void main(String[] args) {
        // Test 1
        int[] A1 = {1, 2, 3, 4, 5};
        int[] B1 = {5, 4, 3, 2, 1};
        int resultado1 = multiplicarInversas(A1, B1);
        System.out.println("Resultado: " + resultado1);

        // Test 2
        int[] A2 = {3, 6, 7, 0, 1, 2};
        int[] B2 = {5, 4, 3, 2, 1, 0};
        int resultado2 = multiplicarInversas(A2, B2);
        System.out.println("Resultado: " + resultado2);
    }
}
