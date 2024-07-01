package FichaPratica05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {


        // Import Scanner
        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int[][] matriz = new int[4][4];
        int soma = 0;

        // Ler números e preencher a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Insira um número na Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Calcular soma quando i = j
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i] == matriz[j]) {
                    soma = soma + matriz[i][j];
                }
            }
        }
        System.out.println("Soma de diagonal principal = " + soma);
    }
}

