/*
Ejercicio 18: Un club de baloncesto saca a la venta las entradas para el próximo partido.
El precio de las entradas varía dependiendo de la zona del pabellón que el espectador quiere ocupar.
- El precio de una entrada para la zona de los fondos es de 5 euros. Si un aficionado adquiere más de
7 entradas para esta zona, obtiene un descuento total del 6%
- El precio de una entrada para la zona central es de 12 euros. Si un aficionado adquiere más de
5 entradas para esta zona obtiene un descuento total del 5%.
- El precio de una entrada para la zona VIP es de 20 euros. Si un aficionado adquiere más de 9 entradas
para esta zona obtiene un descuento total del 4%

Diseñar una applicación que muestre un menú con las tres zonas del pabellón. El usuario deberá escoger
la zona del pabellón para la que desea adquirir entradas. A continuación, la aplicación pedirá al usuario
que introduzca el número de entradas que quiere adquirir. Posteriormente, el programa mostrará por pantalla
el importe en euros que el aficionado debe abonar.

Implementar metodos para controlar las posibles entradas erróneas
 */

import java.util.Scanner;

public class Ejercicio18 {

    final static Scanner KEYBOARD = new Scanner(System.in);

    /*
    Vamos a codificar la zona del estadio de la siguiente forma:
    Si el usuario introduce el nº 1, sera la zona de fondos
    Si el usuario introduce el nº 2, sera la zona central
    Si el usuario introduce el nº 3, sera la zona VIP
     */

    private static double calcularPrecio(int numeroEntradas, int zonaEstadio) {
        double precio;
        if (zonaEstadio == 1) {
            // El precio en la zona 1 es de 5 euros por entrada
            precio = numeroEntradas * 5;
        } else if (zonaEstadio == 2) {
            // El precio en la zona 2 es de 12 euros
            precio = numeroEntradas * 12;
        } else {
            // El precio en la zona 3 es de 20 euros
            precio = numeroEntradas * 20;
        }

        return precio;
    }

    private static double calcularDescuento(int numeroEntradas, int zonaEstadio) {
        double descuento = 0;
        if (zonaEstadio == 1 && numeroEntradas > 7) {
            descuento = 0.06;
        } else if (zonaEstadio == 2 && numeroEntradas > 5) {
            descuento = 0.05;
        } else if (zonaEstadio == 3 && numeroEntradas > 9) {
            descuento = 0.04;
        }

        return descuento;
    }

    // Metodo para controlar que se itroduzca una de las opciones correctas (numero entre 1 y 3)
    private static int introducirNumeroEntre(int limiteInferior, int limiteSuperior) {
        int numero = KEYBOARD.nextInt();

        while (numero < limiteInferior || numero > limiteSuperior) {
            System.out.println("Error. El número introducido debe estar entre " +
                    limiteInferior + " y " + limiteSuperior);
            System.out.print("Por favor, introduzca la opción de nuevo: ");
            numero = KEYBOARD.nextInt();
        }

        return numero;
    }

    private static int introducirNumeroPositivo() {
        int numero = KEYBOARD.nextInt();

        while (numero <= 0) {
            System.out.println("Error. Debe introducir un número de entradas positivo.");
            System.out.println("Introduzca de nuevo: ");
            numero = KEYBOARD.nextInt();
        }

        return numero;
    }

    public static void main(String[] args) {
        System.out.println("¿En qué zona quiere comprar las entradas?");
        System.out.println("Pulse 1 para la zona de los fondos.");
        System.out.println("Pulse 2 para la zona central");
        System.out.println("Pulse 3 para la zona VIP");

        int opcion = introducirNumeroEntre(1, 3);

        System.out.println("Introduzca el número de entradas que desea comprar: ");
        int numeroEntradas = introducirNumeroPositivo();

        double precio = calcularPrecio(numeroEntradas, 3);
        double descuento = calcularDescuento(numeroEntradas, 3);
        double precioConDescuento = precio - precio * descuento;
        System.out.printf("\nEl precio sin descuento es: %.2f €\n", precio);
        System.out.printf("Se aplicará un descuento del %.0f por ciento\n", descuento * 100);
        System.out.printf("El precio total a pagar es: %.2f €", precioConDescuento);
    }
}
