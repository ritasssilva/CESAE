package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 10 *****");

        Scanner input = new Scanner(System.in);

        double num1, num2;
        String operacao;

        System.out.println("Introduza um número: ");
        num1 = input.nextDouble();
        System.out.println("Introduza outro número: ");
        num2 = input.nextDouble();
        System.out.println("Introduza a operação: ");
        operacao = input.next();

        switch (operacao) {
            case "+": System.out.println(num1 + num2);
                break;
            case "-": System.out.println(num1 - num2);
                break;
            case "*": System.out.println(num1 * num2);
                break;
            case "/": System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Erro: introduza dois valores e um sinal de operação aritmética.");

        }

    }
}
