/*
Escribir un programa que, dados dos enteros introducidos por teclado, evalúe su máximo común
divisor usando el algoritmo de Euclides implementado en un metodo. El algoritmo tal y como lo
propuso Euclides es:
a) Tómese el resto del cociente m / n
b) Si el resto es cero, entonces n es el máximo común divisor
c) Si el resto es distinto de cero, se hace m = n y n = resto
d) Se vuelve al punto primero
 */

import java.util.Scanner;

public class Ejercicio21 {

    // Suponemos que m es mayor o igual que n
    private static int algoritmoEuclides(int m, int n) {
        int resto = m % n;

        while (resto != 0) {
            m = n;
            n = resto;
            resto = m % n;
        }

        // Cuando salga del bucle while, el resto es 0. Luego mcd = n
        return n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora del mcd por el algoritmo de Euclides");
        System.out.print("Introduzca el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int numero2 = sc.nextInt();

        int resultado = 0;
        // Para poner primero el numero mayor en la funcion del algoritmo de Euclides
        if (numero1 >= numero2) {
            resultado = algoritmoEuclides(numero1, numero2);
        } else {
            resultado = algoritmoEuclides(numero2, numero1);
        }

        System.out.println("mcd(" + numero1 + " , " + numero2 + ") = " + resultado);
    }
}
