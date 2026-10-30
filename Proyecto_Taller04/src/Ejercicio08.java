
import java.util.Scanner;

/**
 * Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar 
 * el valor total a pagar mensual de servicios digitales de una persona.
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify.
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Alejandro Suing
 * @version 1.0
 */

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double netflix, youtube, dropbox, spotify, total;
        int edad;
        System.out.print("Pago Netflix: ");
        netflix = tcl.nextDouble();
        System.out.print("Pago YouTube Premium: ");
        youtube = tcl.nextDouble();
        System.out.print("Pago Dropbox: ");
        dropbox = tcl.nextDouble();
        System.out.print("Pago Spotify: ");
        spotify = tcl.nextDouble();
        System.out.print("Cual es tu edad?: ");
        edad = tcl.nextInt();
        total = netflix + youtube + dropbox + spotify;
        if (edad < 30) {
            total = total - (total * 0.20);
        }
        System.out.println("El valor total a pagar mensual es: " + total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Pago Netflix: 15
Pago YouTube Premium: 10
Pago Dropbox: 7
Pago Spotify: 13
Cual es tu edad?: 18
El valor total a pagar mensual es: 36.0
BUILD SUCCESSFUL (total time: 25 seconds)
 */

