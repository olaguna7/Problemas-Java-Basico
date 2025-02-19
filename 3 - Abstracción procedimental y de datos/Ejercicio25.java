/*
Ejercicio 25: Construir un programa que obtenga la matriz suma de dos matrices: A (con dimensiones M y N)
y B (con dimensiones P y Q)
 */

public class Ejercicio25 {

    private static int[][] sumaMatrices(int[][] A, int[][] B) {
        int[][] matrizSuma = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                matrizSuma[i][j] = A[i][j] + B[i][j];
            }
        }

        return matrizSuma;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test 1: Matrices con las mismas dimensiones
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] sumaAB = sumaMatrices(A, B);
        imprimirMatriz(sumaAB);
        System.out.println();

        // Test 2: Comprobar que las matrices tienen las mismas dimensiones
        int[][] C = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        if (A.length == C.length && A[0].length == C[0].length) {
            int[][] sumaAC = sumaMatrices(A, C);
            imprimirMatriz(sumaAC);
        } else {
            System.out.println("No se pueden sumar matrices con distinto tamaño");
        }
    }
}
