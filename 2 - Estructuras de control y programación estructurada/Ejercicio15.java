/*
Ejercicio 15: Construir un programa que muestre los números impares comprendidos entre el 20 y el 40
 */

public class Ejercicio15 {
    public static void main(String[] args) {

        System.out.println("Los números impares entre el 20 y el 40 son: ");
        for (int numero = 20; numero <= 40; numero++) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
    }
}
