package FichaPratica03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int n, numeroAnterior = 0, numeroAtual, count = 0, ordemCrescente = 1;

        System.out.println("Quantos números deseja inserir: ");
        n = input.nextInt();

        System.out.println("Introduza um número:");
        numeroAnterior = input.nextInt();  // Lê o primeiro número antes do loop
        count = 1;  // Configura o count para 1, já que o primeiro número foi lido

        while (count < n) {
            System.out.println("Introduza um número:");
            numeroAtual = input.nextInt();
            count++;

            if (numeroAtual < numeroAnterior) {
                ordemCrescente = 0;  // Marca como não crescente
            }
            numeroAnterior = numeroAtual;  // Atualiza o número anterior para a próxima iteração
        }

        if (ordemCrescente == 1) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }
    }
}
