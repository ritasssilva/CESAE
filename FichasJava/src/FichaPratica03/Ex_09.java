package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero = 0;
        double soma = 0;
        int count = 0;
        double media;

        while (numero != -1) {
            System.out.println("Introduza um número: ");
            numero = input.nextInt();

            if (numero != -1) {
                soma += numero;
                count++;
            }
        }

        media = soma / count;
        System.out.println("Média: " + media);

    }
}
