
import java.util.Scanner;

/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes."
 * @author Alejandro Suing
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costo_min, num_min, plant_tel;
        System.out.print("Ingresa el Costo de los minutos: ");
        costo_min = tcl.nextDouble();
        System.out.print("Ingresa el Numero de minutos: ");
        num_min = tcl.nextDouble();
        plant_tel = costo_min * num_min;
        System.out.println("El valor de Plnatilla del telefono de su casa es: "
        + plant_tel);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingresa el Costo de los minutos: 2
Ingresa el Numero de minutos: 80
El valor de Plnatilla del telefono de su casa es: 160.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */