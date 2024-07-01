package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int[][] matriz = new int[3][5];
        int numero;
        int count = 0;

        // Ler números e preencher a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Insira um número na Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprimir matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Pedir um número ao utilizador
        System.out.println("Insira um número para pesquisar: ");
        numero = input.nextInt();


        // Pesquisar o número na matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == numero) {
                    count++;
                }
            }
        }

        // Mostrar o resultado da pesquisa
        if (count > 0) {
            System.out.println("Há " + count + " posições na matriz com o número " + numero);
        } else {
            System.out.println("O número não existe na matriz.");
        }


    }
}
