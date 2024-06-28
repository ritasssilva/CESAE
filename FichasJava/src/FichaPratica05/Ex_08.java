package FichaPratica05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int[][] matriz = new int[3][3];

        // Ler números e preencher a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Insira um número na Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Imprimir matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
