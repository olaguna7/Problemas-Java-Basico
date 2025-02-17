/*
Ejercicio 16: Construir un metodo que devuelva el producto de los n primeros números enteros pares
a partir de un numero x dado.
Tanto x como n se pasarán como parámetros al metodo. suponer n mayor o igual a 1.
 */

public class Ejercicio16 {
    // Suponemos que n > 1, pues si n = 0, el producto sería 0
    private static int productoPares(int n, int x) {
        int producto = 1;

        int contadorPares = 0;
        int numero = x;

        while (contadorPares < n) {
            if (numero % 2 == 0) {
                producto = producto * numero;
                contadorPares++;
            }

            numero++;
        }

        return producto;
    }

    public static void main(String[] args) {
        // Test 1
        System.out.println(productoPares(3, 2));

        // Test 2
        System.out.println(productoPares(3, 7));
    }
}
