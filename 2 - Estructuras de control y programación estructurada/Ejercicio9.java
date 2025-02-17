/*
Ejercicio 9: Para una disolución de un ácido débil, HA, cuya constante de disociación sea Ka,
el pH viene dado por la expresión (aproximada):

pH = (1 / 2) * (p Ka - log[HA])

donde p Ka es el menos logaritmo decimal de Ka, log representa el logaritmo decimal y [HA] es
la concentración molar (moles/litro) del ácido.
Escribir un programa en Java que acepte la constante de acidez de un ácido débil y luego pregunte
por la concentración de la disolución, evaluando el pH. El programa debe solicitar un valor de
concentración tras cada cálculo hasta que el usuario indique que no desea calcular el pH de ninguna
disolución.
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de pH.");
        System.out.println("Deberás introducir la concentración de Ka y la concentración de [HA]");
        System.out.println("hasta que no quieras calcular más pH.");
        System.out.println("Para terminar, debes introducir -1 en alguna de las concentraciones.");


        double concentracionKa = 0;
        double concentracionHA = 0;
        while ((concentracionKa != -1) || (concentracionHA != -1)){
            System.out.print("Introduce el valor de Ka: ");
            concentracionKa = sc.nextDouble();
            System.out.print("Introduce el valor de [HA]: ");
            concentracionHA = sc.nextDouble();

            if ((concentracionKa != -1) && (concentracionHA != -1)) {
                double pH = 0.5 * (-Math.log10(concentracionKa) - Math.log10(concentracionHA));
                System.out.println("El pH es: " + pH);
            } else {
                break;
            }
        }

    }
}
