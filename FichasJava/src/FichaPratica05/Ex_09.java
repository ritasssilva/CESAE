package FichaPratica05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);
        int soma = 0;


        // Declarar variáveis
        int[][] matriz = new int[5][5];


        // Ler números e preencher a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Insira um número na Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\n___________________________________________\n");


        // Imprimir soma de todos os elementos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma = soma + matriz[i][j];
            }
        }

        System.out.print("Soma dos elementos: " + soma);

    }
}
