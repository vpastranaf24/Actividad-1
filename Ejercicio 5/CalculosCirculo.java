package Actividad1_ejercicio5;

import java.util.Scanner;

public class CalculosCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();

        double area = Circulo.calcularArea(radio);
        double longitud = Circulo.calcularLongitud(radio);

        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);

        scanner.close();
    }
}
