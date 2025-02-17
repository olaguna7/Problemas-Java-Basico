/*
Ejercicio 19: Diseñar un programa que simule el funcionamiento de una sencilla calculadora con un
conjunto básico de operaciones. El programa consistirá básicamente, en la presentación de un menú al
usuario en el que se le indicarán las operaciones de las que dispone. Estas serán: suma, resta,
multiplicación, división y potencia de 2 operandos, que deben ser números reales.
Además existirá una opción dentro del menú para finalizar el programa. Si la opción que introduce
el usuario no es la de finalizacíón, el programa le solicitará dos datos necesarios para realizar
la operación elegida. El programa debe controlar la introducción errónea de datos, mostrando un
mensaje de error cuando esto se produzca, y ofreciendo al usuario la posibilidad de que vuelva a
introducir los datos correctamente.
 */

import java.util.Scanner;

public class Ejercicio19 {

    final static Scanner KEYBOARD = new Scanner(System.in);

    private static double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    private static double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    private static double multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    private static double division(double numero1, double numero2) {
        return numero1 / numero2;
    }

    private static double potencia(double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }

    private static void ejecutarMenu(int opcion, double numero1, double numero2) {
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = suma(numero1, numero2);
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                break;
            case 2:
                resultado = resta(numero1, numero2);
                System.out.println(numero1 + " - " + numero2 + " = " + resultado);
                break;
            case 3:
                resultado = multiplicacion(numero1, numero2);
                System.out.println(numero1 + " * " + numero2 + " = " + resultado);
                break;
            case 4:
                resultado = division(numero1, numero2);
                System.out.println(numero1 + " / " + numero2 + " = " + resultado);
                break;
            case 5:
                resultado = potencia(numero1, numero2);
                System.out.println(numero1 + "^" + numero2 + " = " + resultado);
                break;
        }

        System.out.println();
    }

    // Metodo para controlar que la opcion introducida sea correcta
    private static int introducirNumeroEntre(int limiteInferior, int limiteSuperior) {
        int numero = KEYBOARD.nextInt();

        while (numero < limiteInferior || numero > limiteSuperior) {
            System.out.println("Error. Debe introducir un número entre " + limiteInferior + " y " + limiteSuperior);
            System.out.println("Pruebe de nuevo: ");
            numero = KEYBOARD.nextInt();
        }

        return numero;
    }

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("Introduzca una opción de la calculadora: ");
            System.out.println("Opción 1: sumar dos números a + b");
            System.out.println("Opción 2: restar dos números a - b");
            System.out.println("Opción 3: multiplicar dos números a * b");
            System.out.println("Opción 4: dividir dos números a / b");
            System.out.println("Opción 5: calcular la potencia de dos números a^b");
            System.out.println("Opción 6: Terminar el programa.");

            opcion = introducirNumeroEntre(1, 6);
            if (opcion != 6) {
                System.out.print("Introduzca el primer número: ");
                double numero1 = KEYBOARD.nextDouble();
                System.out.print("Introduzca el segundo múmero: ");
                double numero2 = KEYBOARD.nextDouble();

                ejecutarMenu(opcion, numero1, numero2);
            }

        } while (opcion != 6);
    }
}
