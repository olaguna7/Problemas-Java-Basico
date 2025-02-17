/*
Ejercicio 13: Escribir un programa que escriba las 10 primeras potencias de 2
 */

public class Ejercicio13 {
    public static void main(String[] args) {

        int numero = 2;
        for (int i = 1; i <= 10; i++) {
            double potencia = Math.pow(numero, i);
            System.out.println("2^" + i + " = " + (int) potencia);
        }
    }
}
