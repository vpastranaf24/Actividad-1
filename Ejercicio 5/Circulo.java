package Actividad1_ejercicio5;

public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularLongitud() {
        return 2 * Math.PI * radio;
    } 
}
