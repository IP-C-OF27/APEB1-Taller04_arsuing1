
import java.util.Scanner;

/**
 * Ejercicio 06: "Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar."
 * @author Alejandro Suing
 * @version 1.0
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double mon_pres, int_men, pag_men;
        System.out.print("Ingrese el monto del prestamo: ");
        mon_pres = tcl.nextDouble();
        System.out.print("Ingrese el interes mensual (ej. 0,02 para 2%): ");
        int_men = tcl.nextDouble();
        pag_men = (mon_pres / 12.0) + (mon_pres * int_men);
        System.out.println("El pago mensual es: " + pag_men);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el monto del prestamo: 1000
Ingrese el interes mensual (ej. 0.02 para 2%): 0,1
El pago mensual es: 183.33333333333331
BUILD SUCCESSFUL (total time: 6 seconds)
 */
