package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[12];
        boolean duplicado = false;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no Array[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("\n___________________________________________\n");


        System.out.print("Número(s) repetido(s): ");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    duplicado = true;
                    System.out.print(vetor[i] + " ");
                }
            }
        }

        if (!duplicado) {
            System.out.print("Nenhum número repetido encontrado.");
        }

    }
}