package FichaPratica02;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 14 *****");

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        int num1, num2, num3;

        //Ler o input do utilizador
        System.out.println("Introduza um número: ");
        num1 = input.nextInt();
        System.out.println("Introduza outro número: ");
        num2 = input.nextInt();
        System.out.println("Introduza outro número: ");
        num3 = input.nextInt();

        // Colocar os números por ordem crescente e imprimir
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

        /*  Resolução do Formador

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
        } */

    }
}
