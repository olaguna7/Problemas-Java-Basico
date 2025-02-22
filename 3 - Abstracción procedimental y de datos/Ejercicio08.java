/*
Ejercicio 8: Escribir un metodo que compruebe si un número pasado como parámetro es impar.
Si lo es, el metodo devolvera el siguiente número impar. Si el número no es impar, el metodo
devolverá el número impar anterior.
 */

public class Ejercicio08 {
    private static int esImpar(int numero) {
        if (numero % 2 != 0) { // El numero es impar
            return numero + 2;
        } else { // El numero no es impar
            return numero - 1;
        }
    }

    public static void main(String[] args) {
        // Test 1
        System.out.println(esImpar(9)); // Debe imprimir 11

        // Test 2
        System.out.println(esImpar(8)); // Debe imprimir 7
    }
}
