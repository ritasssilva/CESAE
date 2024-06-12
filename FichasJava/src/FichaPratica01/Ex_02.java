package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, soma, subtracao, multiplicacao, divisao;
        System.out.println("Introduza um numero: ");
        num1 = input.nextInt();

        System.out.println("Introduza um numero: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
    }
}
