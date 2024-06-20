package FichaPratica02;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2;

        // Ler num1
        System.out.println("Introduza um número: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.println("Introduza outro número: ");
        num2 = input.nextInt();

        // Avaliar qual o maior
        if (num1 < num2) {
            System.out.println(num1 + "\t" + num2);
        } else {
            System.out.println(num2 + "\t" + num1);
        }
    }
}
