/*
Ejercicio 16: Escribir un programa que produzca la salida:
0101
011011
01110111
*/

public class Ejercicio16 {
    public static void main(String[] args) {

        /*
        Análisis:
        en la linea 1 se van intercalando hay un cero, un uno, un cero, un uno
        en la línea 2 hay un uno y dos ceros, un uno y dos ceros
        en la línea 3 hay un uno y tres ceros, un uno y tres ceros
        El número de unos en cada fila es igual al número de la fila
         */

        for (int i = 1; i <= 3; i++) {  // Hay 3 filas
            for (int j = 1; j <= 2; j++) {  // En cada fila se hace dos veces lo mismo
                System.out.print(0);
                for (int k = 1; k <= i; k++) {  //En cada fila hay "i" unos
                    System.out.print(1);
                }
            }
            System.out.println(); // Se salta a la fila siguiente
        }
    }
}
