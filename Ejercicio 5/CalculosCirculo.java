package Actividad1_ejercicio5;

import java.util.Scanner;
public class CalculosCirculo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        Circulo miCirculo = new Circulo(radio);

        System.out.println("El área del círculo es: " + miCirculo.calcularArea());
        System.out.println("La longitud de la circunferencia es: " + miCirculo.calcularLongitud());

        scanner.close();
    }
}
