package FichaPratica05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int[] sequencia1 = new int[10];
        int[] sequencia2 = new int[10];
        int[][] matriz = new int[10][2];


        // Ler numeros
        for (int i = 0; i < sequencia1.length; i++) {
            System.out.print("Insira um número no Array1 [" + i + "]: ");
            sequencia1[i] = input.nextInt();
        }

        System.out.print("\n");

        for (int i = 0; i < sequencia2.length; i++) {
            System.out.print("Insira um número no Array2 [" + i + "]: ");
            sequencia2[i] = input.nextInt();
        }

        // Preencher a matriz com os valores das sequências
        for (int i = 0; i < 10; i++) {
            matriz[i][0] = sequencia1[i];
            matriz[i][1] = sequencia2[i];
        }

        // Imprimir matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }


    }
}
