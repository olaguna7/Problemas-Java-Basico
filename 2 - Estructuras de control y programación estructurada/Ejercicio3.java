/*
Escriba un programa que calcule la frecuencia, v, de oscilación de un péndulo, dada su masa m y su
longitud l. La expresión correspondiente es:

v = (1 / (2pi)) sqrt(g / l)

donde g es la aceleración normal de la gravedad en el campo gravitatorio terrestre (9,8 m/s^2).
Aunque la frecuencia es independiente de la masa, consideramos que si ésta es mayor que 1kg,
el hilo del que cuelga la misma se romperá El programa debe distinguir esta situación y calcular
la frecuencia sólo si m < 1 kg.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double G = 9.8;
        final double PI = 3.141592;

        System.out.println("Introduzca el valor de la longitud l:  ");
        double longitud = sc.nextDouble();
        System.out.println("Introduzca el valor de la masa (en kg): ");
        double masa = sc.nextDouble();

        if (masa > 1) {
            System.out.println("Se ha roto el hilo del péndulo");
        } else {
            double frecuencia = (1 / (2 * PI)) * Math.sqrt(G / longitud);
            System.out.println("La frecuencia será f = " + frecuencia);
        }

    }
}
