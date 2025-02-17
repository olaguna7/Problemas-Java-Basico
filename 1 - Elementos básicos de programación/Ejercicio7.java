/*
Ejercicio 7: Escribir un programa que permita convertir de unidades a docenas. El programa
deberá solicitar el número de unidades y deberá calcular el número de docenas completas
correspondientes, así como el número restante de unidades del total original.
no tiene porqué haber siempre un número exacto de docenas, por ejemplo: 14 unidades son 1 docena y 2 unidades.
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el número de unidades: ");
        int unidades = sc.nextInt();

        int numeroDocenas = unidades / 12;
        int unidadesRestantes = unidades % 12;
        System.out.println(unidades + " unidades = " + numeroDocenas + " docena(s) y " + unidadesRestantes + " unidad(es)");
    }
}
