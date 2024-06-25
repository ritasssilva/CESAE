package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numJog1, numJog2, tentativas = 0;


        System.out.println("Jogador 1: Introduza um número entre 0 e 100.");
        numJog1 = input.nextInt();

        System.out.println("Jogador 2: Introduza um número entre 0 e 100.");
        numJog2 = input.nextInt();

        while (numJog1 != numJog2) {
            System.out.println("O número introduzido não corresponde ao número escolhido pelo jogagor 1 :(");

            if (numJog2 > numJog1) {
                System.out.println("O número introduzido é maior do que o número escolhido pelo jogagor 1 :(");
            }
            else {
                System.out.println("O número introduzido é menor do que o número escolhido pelo jogagor 1 :(");
            }
        }

    }
}
