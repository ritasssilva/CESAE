package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valorInicio, valorFim;

        // Pedir input ao utilizador
        System.out.println("Introduza um valor de início: ");
        valorInicio = input.nextInt();
        System.out.println("Introduza um valor de fim: ");
        valorFim = input.nextInt();

        // Ajustar valorInicio para o próximo múltiplo de 5, se necessário
        if (valorInicio % 5 != 0) {
            valorInicio = valorInicio + (5 - valorInicio % 5);
        }

        // Apresentar os múltiplos de 5 entre valorInicio e valorFim
        while (valorInicio <= valorFim) {
            if (valorInicio % 5 == 0) {
                System.out.println(valorInicio);
            }
            valorInicio += 5; // Incrementar de 5 em 5 para garantir múltiplos de 5
        }

    }
}