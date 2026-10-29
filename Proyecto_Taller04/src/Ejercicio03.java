
import java.util.Scanner;

/**
 * Ejercicio 03: "Se desea desarrollar un algoritmo que permita mostrar la tabla
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el 
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 * @author Alejandro Suing
 * @version 1.0
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        System.out.print("Escribe el numero para ver la tabla: ");
        num = tcl.nextInt();
        if (num >= 2 && 6 >= num){
                System.out.println( num + " * 1 = " + (num * 1) );
                System.out.println( num + " * 2 = " + (num * 2) );
                System.out.println( num + " * 3 = " + (num * 3) );
                System.out.println( num + " * 4 = " + (num * 4) );
                System.out.println( num + " * 5 = " + (num * 5) );
                System.out.println( num + " * 6 = " + (num * 6) );
                System.out.println( num + " * 7 = " + (num * 7) );
                System.out.println( num + " * 8 = " + (num * 8) );
                System.out.println( num + " * 9 = " + (num * 9) );
                System.out.println( num + " * 10 = " + (num * 10) );
                System.out.println( num + " * 11 = " + (num * 11) );
                System.out.println( num + " * 12 = " + (num * 12) ); 
            }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Escribe el numero para ver la tabla: 2
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
2 * 10 = 20
2 * 11 = 22
2 * 12 = 24
BUILD SUCCESSFUL (total time: 4 seconds)
 */
