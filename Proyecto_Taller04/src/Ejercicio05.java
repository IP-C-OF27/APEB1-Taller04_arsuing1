
import java.util.Scanner;

/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos 
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón."
 * @author Alejandro Suing
 * @version 1.0
 */

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double CPU, Teclado, Pantalla, Raton, Cost_T;
        System.out.print("Pon el valor de tu CPU: ");
        CPU = tcl.nextDouble();
        System.out.print("Pon el valor de tu Pantalla: ");
        Pantalla = tcl.nextDouble();
        System.out.print("Pon el valor de tu Raton: ");
        Raton = tcl.nextDouble();
        System.out.print("Pon el valor de tu Teclado: ");
        Teclado = tcl.nextDouble();
        Cost_T = CPU + Pantalla + Teclado + Raton;
        System.out.println("El costo total de tu computadora es: " + Cost_T);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Pon el valor de tu CPU: 200
Pon el valor de tu Pantalla: 150
Pon el valor de tu Raton: 20
Pon el valor de tu Teclado: 50
El costo total de tu computadora es: 420.0
BUILD SUCCESSFUL (total time: 10 seconds)
 */