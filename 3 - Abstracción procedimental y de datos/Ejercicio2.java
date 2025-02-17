/*
Ejercicio 2: Construir un programa que extraiga todas las apariciones de un determinado carácter
en una palabra almacenada en un String y devuelva por pantalla el String resultante. Tanto la
palabra como el carácter a eliminar serán introducidos en el programa por línea de comandos.
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena: ");
        String cadenaOriginal = sc.nextLine();

        // Convertimos a minúsculas la cadena
        cadenaOriginal = cadenaOriginal.toLowerCase();

        System.out.println("Introduzca el caracter a eliminar en la cadena: ");
        String caracter = sc.nextLine();

        // Controlamos que el usuario introduzca un único caracter (que el String sea de longitud 1)
        while (caracter.length() != 1) {
            System.out.println("Error! Vuelva a introducir únicamente un carácter: ");
            caracter = sc.nextLine();
        }
        // Convertimos a minúsculas el carácter
        caracter = caracter.toLowerCase();

        String cadenaResultante = "";
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            // Para comparar Strings se usa mejor el metodo equals()
            if (Character.toString(cadenaOriginal.charAt(i)).equals(caracter)) {
                cadenaResultante += "";
            } else{
                cadenaResultante += cadenaOriginal.charAt(i);
            }
        }

        System.out.println("\nLa cadena original era: " + cadenaOriginal);
        System.out.println("Quitando el carácter \"" + caracter + "\", la cadena es: " + cadenaResultante);

    }
}
