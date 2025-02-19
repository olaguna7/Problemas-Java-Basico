/*
Ejercicio 24: Escribir un programa que cree una matriz con los caracteres de la 'a' a 'j' y
a continuación sustituya todas las vocales que se encuentren en la matriz por el carácter @
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("a") || array[i].equals("e") || array[i].equals("i") ||
                    array[i].equals("o") || array[i].equals("u")) {
                array[i] = "@";
            }
        }

        // Imprimimos el array para comprobarlo
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
