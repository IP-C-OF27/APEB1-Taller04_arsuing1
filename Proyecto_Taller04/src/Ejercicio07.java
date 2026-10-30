
import java.util.Scanner;

/**
 * Ejercicio 07: "Generar un algoritmo que permita calcular y mostrar el valor 
 * a cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
 * tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Alejandro Suing
 * @version 1.0
 */

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costo_kwh, num_kwh, total;
        int edad;
        System.out.print("Ingrese el costo por kilovatio/hora: ");
        costo_kwh = tcl.nextDouble();
        System.out.print("Ingrese el numero de kilovatios consumidos: ");
        num_kwh = tcl.nextDouble();
        System.out.print("Ingrese la edad del usuario: ");
        edad = tcl.nextInt();
        total = costo_kwh * num_kwh;
        if (edad > 65) {
            total = total - (total * 0.10);
        }
        System.out.println("El valor a cancelar de la planilla es: " + total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el costo por kilovatio/hora: 3
Ingrese el numero de kilovatios consumidos: 45
Ingrese la edad del usuario: 68
El valor a cancelar de la planilla es: 121.5
BUILD SUCCESSFUL (total time: 15 seconds)
 */
