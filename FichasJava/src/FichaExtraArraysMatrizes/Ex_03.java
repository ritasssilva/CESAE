package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int numero;
        boolean existe = true;

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
                existe = true;
            }


            if (existe = true) {
                System.out.println(numero + " existe no array.");
            } else {
                System.out.println(numero + " não existe no array.");
            }
        }


    }
}
