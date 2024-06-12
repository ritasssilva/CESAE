package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        System.out.println("***** Exercício 11 *****");

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double saldo, movimento, balanco;

        //Ler variáveis
        System.out.println("Introduza saldo médio: ");
        saldo = input.nextDouble();
        System.out.println("Introduza valor a movimentar: ");
        movimento = input.nextDouble();

        //calcular balanço da conta
        balanco = saldo + movimento;

        //Avaliar se balanço é positivo ou negativo
        if (balanco >= 0) {
            System.out.println("Saldo Atual: " + balanco);

        } else {
            System.out.println("Operação inválida. Saldo Insuficiente. \nSaldo atual: " + saldo);
        }
    }

}
