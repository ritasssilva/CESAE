package FichaPratica02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 15 *****");

        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2, num3;
        String ordem;

        // Ler o input do utilizador para os números
        System.out.println("Introduza um número: ");
        num1 = input.nextInt();
        System.out.println("Introduza outro número: ");
        num2 = input.nextInt();
        System.out.println("Introduza outro número: ");
        num3 = input.nextInt();

        // Perguntar ao utilizador a ordem desejada
        System.out.println("Deseja ordem crescente (C) ou decrescente (D)?");
        ordem = input.next();  // Lê a próxima string

        if (ordem.equals("C") || ordem.equals("c")) {
            // Ordenar crescente
            if (num1 <= num2 && num1 <= num3) {
                if (num2 <= num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else {
                    System.out.println(num1 + " " + num3 + " " + num2);
                }
            } else if (num2 <= num1 && num2 <= num3) {
                if (num1 <= num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                } else {
                    System.out.println(num2 + " " + num3 + " " + num1);
                }
            } else {
                if (num1 <= num2) {
                    System.out.println(num3 + " " + num1 + " " + num2);
                } else {
                    System.out.println(num3 + " " + num2 + " " + num1);
                }
            }
        } else if (ordem.equals("D") || ordem.equals("d")) {
            // Ordenar decrescente
            if (num1 >= num2 && num1 >= num3) {
                if (num2 >= num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else {
                    System.out.println(num1 + " " + num3 + " " + num2);
                }
            } else if (num2 >= num1 && num2 >= num3) {
                if (num1 >= num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                } else {
                    System.out.println(num2 + " " + num3 + " " + num1);
                }
            } else {
                if (num1 >= num2) {
                    System.out.println(num3 + " " + num1 + " " + num2);
                } else {
                    System.out.println(num3 + " " + num2 + " " + num1);
                }
            }
        } else {
            System.out.println("Escolha inválida. Por favor, selecione 'C' para crescente ou 'D' para decrescente.");
        }
    }
}
