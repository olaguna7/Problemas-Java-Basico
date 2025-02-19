/*
Ejercicio 11: Construir un programa que escriba el triángulo de Pascal con un número determinado de filas.
Dicho número se introducirá por teclado. A tal efecto, se utilizará la funcion combinatoria definida como

c(n, k) = (n!) / (k! (n - k)!)

donde k <= n.
 */

public class Ejercicio11 {
    private static int factorial(int numero) {
        int factorial = 1;

        if (numero == 0) {
            return 1;
        }

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }

    private static int numeroCombinatorio(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    /*
    El metodo tiene que imprimir algo asi (los # son huecos vacíos):
                1
                1 1
                1 2 1
                1 3 3 1
                1 4 6 4 1
                .........
     */

    private static void trianguloPascal(int filas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(numeroCombinatorio(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        trianguloPascal(5);
    }
}
