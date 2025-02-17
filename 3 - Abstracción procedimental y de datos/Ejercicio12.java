/*
Construir un programa que calcule los valores del exponente, e^x, el coseno, cos(x), y el seno,
sen(x), a partir de sus series.
El número de términos de la serie será el necesario para que la diferencia absoluta entre dos
valores sucesivos sea menor de 10^-3.
Úsese un metodo para cada caso, imprimiendo los distintos resultados en el método principal.
 */

public class Ejercicio12 {
    /*
    Estrategia:
    Implementar un metodo para cada una de las series, y luego usarlas para calcular el exponente,
    el seno, y el coseno con la precisión pedida.
     */

    private static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    private static double serieExponente(double x, int n) {
        double resultado = 0;

        for (int i = 0; i <= n; i++) {
            resultado = resultado + Math.pow(x, i) / factorial(i);
        }

        return resultado;
    }

    private static double calcularExponente(double x) {
        int n = 0;
        double resultado = serieExponente(x, n);
        while (Math.abs(serieExponente(x, n + 1) - serieExponente(x, n)) < 10e-3) {
            resultado = serieExponente(x, n + 1);
            n++;
        }

        return resultado;
    }

    private static double serieCoseno(double x, int n) {
        double resultado = 0;

        for (int i = 0; i <= n; i++) {
            resultado = resultado + Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
        }

        return resultado;
    }

    private static double calcularCoseno(double x) {
        int n = 0;
        double resultado = serieCoseno(x, n);
        while (Math.abs(serieCoseno(x, n + 1) - serieCoseno(x, n)) < 10e-3) {
            resultado = serieCoseno(x, n + 1);
            n++;
        }

        return resultado;
    }

    private static double serieSeno(double x, int n) {
        double resultado = 0;

        for (int i = 0; i <= n; i++) {
            resultado = resultado + Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }

        return resultado;
    }

    private static double calcularSeno(double x) {
        int n = 0;
        double resultado = serieSeno(x, n);
        while (Math.abs(serieSeno(x, n + 1) - serieSeno(x, n)) < 10e-3) {
            resultado = serieSeno(x, n + 1);
            n++;
        }

        return resultado;
    }

    public static void main(String[] args) {
        double x = 0.12345;

        // Test exponente
        double exponente = calcularExponente(x);
        System.out.println("e^" + x + " = " + exponente);
        // Test seno
        double seno = calcularSeno(x);
        System.out.println("sen(" + x + ") = " + seno);

        // Test coseno
        double coseno = calcularCoseno(x);
        System.out.println("cos(" + x + ") = " + coseno);
    }

}
