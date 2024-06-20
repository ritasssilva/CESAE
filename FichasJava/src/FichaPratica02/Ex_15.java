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


        if (ordem.equals("C") || ordem.equals("c")) { // Ordenar crescente
            if (num1 <= num2 && num1 <= num3) {
                if (num2 <= num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else {
                    System.out.println(num1 + " " + num3 + " " + num2);
                }
            }

            if (num2 <= num1 && num2 <= num3) {
                if (num1 <= num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                } else {
                    System.out.println(num2 + " " + num3 + " " + num1);
                }
            }

            if (num3 <= num1 && num3 <= num2) {
                if (num1 <= num2) {
                    System.out.println(num3 + " " + num1 + " " + num2);
                } else {
                    System.out.println(num3 + " " + num2 + " " + num1);
                }
            }
        }

            if (ordem.equals("D") || ordem.equals("d")) { // Ordenar decrescente
                if (num1 >= num2 && num1 >= num3) {
                    if (num2 >= num3) {
                        System.out.println(num1 + " " + num2 + " " + num3);
                    } else {
                        System.out.println(num1 + " " + num3 + " " + num2);
                    }
                }

                if (num2 >= num1 && num2 >= num3) {
                    if (num1 >= num3) {
                        System.out.println(num2 + " " + num1 + " " + num3);
                    } else {
                        System.out.println(num2 + " " + num3 + " " + num1);
                    }
                }

                if (num3 >= num1 && num3 >= num2) {
                    if (num1 >= num2) {
                        System.out.println(num3 + " " + num1 + " " + num2);
                    } else {
                        System.out.println(num3 + " " + num2 + " " + num1);
                    }
                }
            }

        // Validar a escolha da ordem
        if (!(ordem.equals("C") || ordem.equals("c") || ordem.equals("D") || ordem.equals("d"))) {
            System.out.println("Escolha inválida. Por favor, selecione 'C' para crescente ou 'D' para decrescente.");
        }

    }
}

        /*       Resolução Formador

        System.out.print("Insira um número: ");
        int a = input.nextInt();
        System.out.print("Insira um número: ");
        int b = input.nextInt();
        System.out.print("Insira um número: ");
        int c = input.nextInt();
        System.out.print("Crescente (C) ou Decrescente (D): ");
        switch (input.next()) {
            case "C":
                if (a < b && a < c) {
                    if (b < c) {
                        System.out.println("" + a + " " + b + " " + c);
                    } else {
                        System.out.println("" + a + " " + c + " " + b);
                    }
                }

                if (b < a && b < c) {
                    if (a < c) {
                        System.out.println("" + b + " " + a + " " + c);
                    } else {
                        System.out.println("" + b + " " + c + " " + a);
                    }
                }

                if (c < a && c < b) {
                    if (a < b) {
                        System.out.println("" + c + " " + a + " " + b);
                    } else {
                        System.out.println("" + c + " " + b + " " + a);
                    }
                }
                break;
            case "D": // Para este caso, troca-se a ordem das letras: a terceira para para primeiro e a primeira para terceiro e a do meio mantem-se, para criar o flow decrescente
                if (a < b && a < c) {
                    if (b < c) {
                        System.out.println("" + c + " " + b + " " + a);
                    } else {
                        System.out.println("" + b + " " + c + " " + a);
                    }
                }

                if (b < a && b < c) {
                    if (a < c) {
                        System.out.println("" + c + " " + a + " " + b);
                    } else {
                        System.out.println("" + a + " " + c + " " + b);
                    }
                }

                if (c < a && c < b) {
                    if (a < b) {
                        System.out.println("" + b + " " + a + " " + c);
                    } else {
                        System.out.println("" + a + " " + b + " " + c);
                    }
                } */