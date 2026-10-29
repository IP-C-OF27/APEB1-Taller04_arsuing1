
import java.util.Scanner;

/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario."
 * @author Alejandro Suing
 * @version 1.0
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altu, area;
        System.out.print("Dame base: ");
        base = tcl.nextDouble();
        System.out.print("Dame altura: ");
        altu = tcl.nextDouble();
        area = (base * altu)/2;
        System.out.println("El area es: " + area);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Dame base: 5
Dame altura: 3
El area es: 7.5
BUILD SUCCESSFUL (total time: 3 seconds)
 */
