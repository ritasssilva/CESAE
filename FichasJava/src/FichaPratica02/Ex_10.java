package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 10 *****");

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;
        String operacao;

        // Ler valores
        System.out.println("Introduza um número: ");
        num1 = input.nextDouble();
        System.out.println("Introduza outro número: ");
        num2 = input.nextDouble();

        // Ler operação
        System.out.println("Operação desejada (+ - * /): ");
        operacao = input.next();

        switch (operacao) {
            case "+": // Soma
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case "-": // Subtração
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            case "*": // Multiplicação
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;
            case "/": // Divisão
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;
            default:
                System.out.println("Erro: Operação não reconhecida");

        }

    }
}
