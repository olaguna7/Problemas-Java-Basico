/*
Ejercicio 4: Escribir un metodo que reciba como parámetro una cadena y que devuelva una nueva cadena
que corresponda a la cadena inicial invertida. Escribir un programa que imprima la cadena inicial y la
nueva en el metodo main. La cadena inicial debe leerse por línea de órdenes.
 */

import java.util.Scanner;

public class Ejercicio04 {
    private static String invertirCadena(String cadena) {
        String cadenaInvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += Character.toString(cadena.charAt(i));
        }

        return cadenaInvertida;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una cadena: ");
        String cadena = sc.nextLine();

        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }
}
