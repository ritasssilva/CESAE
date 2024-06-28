package FichaPratica05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

// Import Scanner
        Scanner input = new Scanner(System.in);

// Declarar variáveis
        int[] numeros = new int[10];
        int menor;

// Ler numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um número: ");
            numeros[i] = input.nextInt();
        }

        menor = numeros[0];

        System.out.println("\n___________________________________________");

// Imprimir o número do menor do array
        for (int i = 0; i < numeros.length; i++) {

            // Avaliar qual o menor
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

        }
        System.out.println("Menor elemento = " + menor);
    }
}
