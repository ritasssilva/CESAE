package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int numero;
        int[] indices = new int[10]; // Array para armazenar os índices das ocorrências
        int contador = 0; // Contador para o número de ocorrências

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no Array[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("\n___________________________________________\n");

        // Pesquisar o número no array
        System.out.println("Número a pesquisar: ");
        numero = input.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                indices[contador] = i; // Armazenar o índice da ocorrência
                contador++; // Incrementar o contador
            }
        }

        if (contador > 0) { // Verificar se houve ocorrências
            System.out.print(numero + " existe no array: ");
            for (int i = 0; i < contador; i++) {
                System.out.print("Array[" + indices[i] + "] ");
            }
            System.out.println();
        } else {
            System.out.println(numero + " não existe no array.");
        }


    }
}
