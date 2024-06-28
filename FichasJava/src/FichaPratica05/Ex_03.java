package FichaPratica05;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {


        // Import Scanner
        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int[] numeros = new int[10];
        int maior;


        // Ler numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um número: ");
            numeros[i] = input.nextInt();
        }

        maior = numeros[0];

        System.out.println("\n___________________________________________\n");

        // Imprimir o número do maior do array
        for (int i = 0; i < numeros.length; i++) {

            // Avaliar qual o maior
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

        }
        System.out.println("Maior elemento = " + maior);
    }
}

