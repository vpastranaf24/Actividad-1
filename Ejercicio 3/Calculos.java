package Actividad1_ejercicio3;

public class Calculos {
    
    public static double calcular_salario_bruto(
        double horaslaboradas, double valorhora
    ) {
        double salario_bruto = horaslaboradas * valorhora;
        return salario_bruto;
    }

    public static double calcular_retefuente(
        double horaslaboradas,
        double valorhora,
        double porcentajeretencion
    ) {
        double retefuente =
            (horaslaboradas * valorhora) * porcentajeretencion;
        return retefuente;
    }

    public static double calcular_salario_neto(
        double salario_bruto, double retefuente
    ) {
        double salario_neto = salario_bruto - retefuente;
        return salario_neto;
    }
}
