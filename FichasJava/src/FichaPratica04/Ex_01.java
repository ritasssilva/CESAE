package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor1, valor2;
        String operacao, continuar;

        // Pedir input ao utilizador

        System.out.println("Introduza o primeiro valor: ");
        valor1 = input.nextDouble();

        System.out.println("Introduza o segundo valor: ");
        valor2 = input.nextDouble();

        // Realizar as operações enquanto utilizador quiser continuar

        do {
            System.out.println("Escolha uma das seguintes operações aritméticas: + (soma), - (subtração), * (multiplicação), / (divisão): ");
            operacao = input.next();

            switch (operacao) {
                case "+":
                    System.out.println("Escolheu a soma: " + valor1 + " + " + valor2 + " = " + (valor1 + valor2));
                    break;
                case "-":
                    System.out.println("Escolheu a subtração: " + valor1 + " - " + valor2 + " = " + (valor1-valor2));
                    break;
                case "*":
                    System.out.println("Escolheu a multiplicação: " + valor1 + " * " + valor2 + " = " + (valor1 * valor2));
                    break;
                case "/":
                    System.out.println("Escolheu a divisão: " + valor1 + " / " + valor2 + " = " + (valor1 / valor2));
                    break;
                default:
                    System.out.println("Operação Inválida!");
            }
            System.out.println("Deseja continuar? (introduza s/n)");
            continuar = input.next();
        }
        while (continuar.equalsIgnoreCase("s"));
    }
}
