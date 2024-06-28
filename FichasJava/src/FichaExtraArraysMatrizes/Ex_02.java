package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no Array[" + i + "]: ");
            vetor[i] = input.nextInt();

        }

        System.out.println("\n___________________________________________\n");



        // Imprimir vetor por ordem inversa
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

    }
}
