package FichaPratica05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int maior, menor;

        // Ler números e preencher a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Insira um número na Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Inicializar maior e menor com o primeiro elemento da matriz
        maior = matriz[0][0];
        menor = matriz[0][0];

        // Pesquisar o maior e o menor número na matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
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

        // Imprimir o maior e o menor número
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

    }
}
