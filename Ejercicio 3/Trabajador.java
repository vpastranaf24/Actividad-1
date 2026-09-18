package Actividad1_ejercicio3;

public class Trabajador {
    public static void main(String[] args) {
        double horaslaboradas, valorhora, porcentajeretencion;
        double salario_bruto, salario_neto, retefuente;

        horaslaboradas = 48;
        valorhora = 5000;
        porcentajeretencion = 12.5/100;

        salario_bruto = Calculos.calcular_salario_bruto(
            horaslaboradas, valorhora
        );

        retefuente = Calculos.calcular_retefuente(
            horaslaboradas, valorhora, porcentajeretencion
        );

        salario_neto = Calculos.calcular_salario_neto(
            salario_bruto, retefuente
        );

        System.out.println("El salario bruto es:" + salario_bruto);
        System.out.println("El valor de la retencion:" + retefuente);
        System.out.println("El salario neto es:" + salario_neto);
    }
}
