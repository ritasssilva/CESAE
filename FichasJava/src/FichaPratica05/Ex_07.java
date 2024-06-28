package FichaPratica05;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {


        // Import Scanner
        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int[] numeros = new int[10];
        int maior;
        boolean par = true;

        // Ler numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um número: ");
            numeros[i] = input.nextInt();
        }

        maior = numeros[0];

        System.out.println("\n___________________________________________\n");

        // Avaliar o número do maior do array
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // Avaliar se o maior número é par
        if (maior % 2 == 0) {
            par = true;
            System.out.println("Maior número par: " + maior);
        } else {
            par = false;
            System.out.println("O maior número não é par.");
        }
    }
    }