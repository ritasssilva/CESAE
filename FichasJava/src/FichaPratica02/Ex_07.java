package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Introduza um número: ");
        numero = input.nextInt();

        if (numero % 2 == 0)
            System.out.println("O número é par.");
        else
            System.out.println("O número é ímpar.");

    }
}