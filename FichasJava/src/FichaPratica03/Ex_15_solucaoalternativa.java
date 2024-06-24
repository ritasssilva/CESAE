package FichaPratica03;

import java.util.Scanner;

public class Ex_15_solucaoalternativa {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, fatorial = 1;

        System.out.println("Número para o qual pretende calcular o fatorial: ");
        numero = input.nextInt();

        int count = numero;  // Count começa com o valor de 'numero' e decrementa até 1

        // Inicia o cálculo do fatorial
        while (count > 1) {
            int multiplicador = count; // Usa o count atual como multiplicador (que define quantas vezes o "fatorial" será somado)
            int produtoParcial = 0; // Inicia um produto parcial para esta etapa de multiplicação


            // Multiplicar fatorial atual por multiplicador usando adições
            while (multiplicador > 0) {
                produtoParcial += fatorial;
                multiplicador--;
            }

            // Atualiza fatorial para o próximo ciclo
            fatorial = produtoParcial;
            count--;  // Decrementa o count para continuar o cálculo do fatorial
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

    }
}
