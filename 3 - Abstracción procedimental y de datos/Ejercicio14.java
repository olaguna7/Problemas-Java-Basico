/*
Ejercicio 14: Un número se dennomina mágico cuando es divisible entre 3 y 5 y no es divisible
entre 10. Escribir un metodo que reciba como parámetros dos números e imprima los números mágicos
comprendidos entre esos dos números.
 */

public class Ejercicio14 {
    private static boolean esMagico(int numero) {
        if ((numero % 3 == 0) && (numero % 5 == 0) && (numero % 10 != 0)) {
            return true;
        }

        return false;
    }

    private static void imprimirMagicosEntre(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (esMagico(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Test 1
        System.out.println("Los números mágicos entre 3 y 100 son: ");
        imprimirMagicosEntre(3, 100);

        // Test 2
        System.out.println("\nLos números mágicos entre 90 y 225 son: ");
        imprimirMagicosEntre(90, 225);
    }
}
