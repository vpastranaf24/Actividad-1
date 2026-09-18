package Actividad1_ejercicio4;

import java.util.Scanner;
public class CuadradoCubo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero: ");
        double numero = scanner.nextDouble();

        double cuadrado = Numero.calcularcuadrado(numero);
        double cubo = Numero.calcularcubo(numero);

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);

        scanner.close();
    }
}
