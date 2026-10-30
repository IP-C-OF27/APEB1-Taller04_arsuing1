
import java.util.Scanner;

/**
 * Ejercicio 10: "El programa debe calcular el área del polígono. La figura se
 * compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
 * (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. Se 
 * pide que haga un programa que calcule el área total.
 * Por cultura general, sabemos que el área de un rectángulo se calcula 
 * multiplicando su base por su altura; el área de un triángulo rectángulo se 
 * calcula multiplicando su base por su altura, y luego dividiendo el resultado
 * entre dos; finalmente, el área de un cuadrado se calcula elevando al 
 * cuadrado la medida de uno de sus lados."
 * @author Alejandro Suing
 * @version 1.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado, altura, area_cuadrado, area_triangulos, area_rectangulo,
                area_total;
        System.out.print("Ingrese medida del lado del cuadrado: ");
        lado = tcl.nextDouble();
        System.out.print("Ingrese altura (de los triangulos y rectangulo): ");
        altura = tcl.nextDouble();
        area_cuadrado = Math.pow(lado, 2);
        area_triangulos = (lado * altura) / 2.0;
        area_rectangulo = lado * altura;
        area_total = area_cuadrado + (area_triangulos * 3) + area_rectangulo;
        System.out.println("El area del cuadrado es: " + area_cuadrado);
        System.out.println("El area del rectangulo es: " + area_rectangulo);
        System.out.println("El area del triangulo es: " + area_triangulos);
        System.out.println("El area total del poligono es: " + area_total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */
