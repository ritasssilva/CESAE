package FichaPratica01;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;
        System.out.println("Introduza um valor inteiro: ");
        valor1 = input.nextInt();

        System.out.println("Introduza um valor inteiro: ");
        valor2 = input.nextInt();

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("O valor1 agora é " + valor1 + " e o valor2 é " + valor2);


    }
}
