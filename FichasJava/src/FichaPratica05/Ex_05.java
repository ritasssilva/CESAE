package FichaPratica05;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

// Declarar variáveis
        double[] numeros = new double[10];
        double soma = 0;
        double media = 0;

// Ler numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um número: ");
            numeros[i] = input.nextDouble();
        }

        System.out.println("\n___________________________________________\n");

        // Imprimir média dos  numeros do array
        for (int i = 0; i < numeros.length; i++) {
            soma = soma+numeros[i];
        }

        media = soma/numeros.length;
        System.out.println("Média dos números = " + media);
    }
}
