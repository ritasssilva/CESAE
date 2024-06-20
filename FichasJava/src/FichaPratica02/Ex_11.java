package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        System.out.println("***** Exercício 11 *****");

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double saldo, movimento, balanco;

        // Ler o saldo
        System.out.println("Introduza saldo: ");
        saldo = input.nextDouble();
        // Ler o valor a movimentar
        System.out.println("Introduza valor a movimentar: ");
        movimento = input.nextDouble();

        // Calcular balanço da conta
        balanco = saldo + movimento;

        // Avaliar se balanço é positivo ou negativo (se movimento é válido)
        if (balanco >= 0) {
            System.out.println("Saldo Atual: " + balanco);

        } else { // Movimento inválido
            System.out.println("Operação inválida. Saldo Insuficiente. \nSaldo atual: " + saldo);
        }
    }

}
