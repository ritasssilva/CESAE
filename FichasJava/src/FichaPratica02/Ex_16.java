package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 16 *****");

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza um valor em euros (múltiplo de 5):");
        int valor = input.nextInt();

        System.out.println("Valor: " + valor + " euros");

        // Calcula o número de notas de cada valor
        int notas200 = valor / 200;
        valor %= 200;
        int notas100 = valor / 100;
        valor %= 100;
        int notas50 = valor / 50;
        valor %= 50;
        int notas20 = valor / 20;
        valor %= 20;
        int notas10 = valor / 10;
        valor %= 10;
        int notas5 = valor / 5;
        valor %= 5;

        // Mostra a quantidade de cada nota
        if (notas200 > 0) System.out.println("Notas de 200 euros: " + notas200);
        if (notas100 > 0) System.out.println("Notas de 100 euros: " + notas100);
        if (notas50 > 0) System.out.println("Notas de 50 euros: " + notas50);
        if (notas20 > 0) System.out.println("Notas de 20 euros: " + notas20);
        if (notas10 > 0) System.out.println("Notas de 10 euros: " + notas10);
        if (notas5 > 0) System.out.println("Notas de 5 euros: " + notas5);

        // Verifica se o valor é múltiplo de 5
        if (valor % 5 != 0) {
            System.out.println("Erro: O valor introduzido não é múltiplo de 5.");
        }
    }
}
