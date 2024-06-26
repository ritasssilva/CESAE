package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numJog1, numJog2, tentativas = 0;


        System.out.println("Jogador 1: Introduza um número entre 0 e 100.");
        numJog1 = input.nextInt();

        // Garantir que o número está no intervalo correto

        while (numJog1 < 0 || numJog1 > 100) {
            System.out.println("Por favor, introduza um número válido entre 0 e 100.");
            numJog1 = input.nextInt();
        }

        do {
            System.out.println("Jogador 2: Introduza um número entre 0 e 100.");
            numJog2 = input.nextInt();
            tentativas++;

            if (numJog2 > numJog1) {
                System.out.println("O número introduzido é maior do que o número escolhido pelo jogador 1 :(");
            } else if (numJog2 < numJog1) {
                System.out.println("O número introduzido é menor do que o número escolhido pelo jogador 1 :(");
            }
        } while (numJog2 != numJog1);

        System.out.println("Parabéns! Acertou no número escolhido pelo jogador 1 :)");
        System.out.println("Número de tentativas: " + tentativas);

    }
}
