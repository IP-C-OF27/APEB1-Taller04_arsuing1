
import java.util.Scanner;

/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de 
 * una persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final y 
 * un porcentaje de asistencia. La regla institucional establece que:
    * La asistencia mínima debe alcanzarse para ser evaluado
    * Existe una nota mínima en el examen final, y
    * La nota final se calcula combinando evaluación continua y examen final.
 * La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, 
      y mostrar la nota final redondeada a un decimal."
 * @author Alejandro Suing
 * @version 1.0
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double eva_cont, ex_fin, nota_final;
        int asistencia;
        System.out.print("Ingrese la calificacion de evaluacion continua: ");
        eva_cont = tcl.nextDouble();
        System.out.print("Ingrese la calificacion del examen final: ");
        ex_fin = tcl.nextDouble();
        System.out.print("Ingrese el porcentaje de asistencia (ej. 80): ");
        asistencia = tcl.nextInt();
        if (asistencia < 75 || ex_fin < 4.0) {
            System.out.println("Estado: Reprobado (No cumple asistencia minima "
                    + "o nota minima en examen)");
        } else {
            nota_final = (eva_cont + ex_fin) / 2.0;
            nota_final = Math.round(nota_final * 10.0) / 10.0;
            if (nota_final >= 7.0) {
                System.out.println("Estado: Aprobado | Nota final: " 
                        + nota_final);
            } else if (nota_final >= 4.0) {
                System.out.println("Estado: Supletorio | Nota final: " 
                        + nota_final);
            } else {
                System.out.println("Estado: Reprobado | Nota final: " 
                        + nota_final);
            }
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la calificacion de evaluacion continua: 7
Ingrese la calificacion del examen final: 8,5
Ingrese el porcentaje de asistencia (ej. 80): 75
Estado: Aprobado | Nota final: 7.8
BUILD SUCCESSFUL (total time: 9 seconds)
 */
