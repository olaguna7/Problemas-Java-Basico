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
                # # # # 1 # # # #   huecos vacíos excepto en (1, 5)
                # # # 1 # 1 # # #   huecos vacíos excepto en (2, 4) y (2, 6)
                # # 1 # 2 # 1 # #   huecos vacíos excepto en (3, 3), (3, 5) y (3, 7)
                # 1 # 3 # 3 # 1 #   huecos vacíos excepto en (4, 2), (4, 4), (4, 6) y (4, 8)
                1 # 4 # 6 # 4 # 1

     */

    private static void trianguloPascal(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= 2 * filas - 1; j++) {
                if (j < filas - i + 1 || j > filas + i - 1) { // huecos de los lados derecho e izquierdo
                    System.out.print("# ");
                } else if (i % 2 != 0 && j % 2 != 0 && j >= 5 - i + 1 && j <= 5 + i - 1){
                    System.out.print(numeroCombinatorio(i, j / 2) + " ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        trianguloPascal(5);
    }
}
