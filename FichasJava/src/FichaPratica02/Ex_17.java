package FichaPratica02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 17 *****");

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduza o saldo médio do último ano:");
        double saldoMedio = input.nextDouble();
        double credito = 0;

        // Determina o crédito com base no saldo médio
        if (saldoMedio > 6000) {
            credito = saldoMedio * 0.40;
        }
        if (saldoMedio > 4000) {
            credito = saldoMedio * 0.30;
        }
        if (saldoMedio > 2000) {
            credito = saldoMedio * 0.20;
        } else {
            credito = 0;
        }

        // Mostrar o saldo médio e o valor de crédito
        System.out.printf("Saldo médio: " + saldoMedio + " euros\n");
        if (credito == 0) {
            System.out.println("Não há crédito disponível para o saldo médio indicado.");
        } else {
            System.out.printf("Valor de crédito especial: " + credito + " euros");
        }
    }
}