package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double valor1, valor2, valor3, mediaAritmetica, mediaPonderada;
        System.out.println("Introduza o valor 1: ");
        valor1 = input.nextDouble();

        System.out.println("Introduza o valor 2: ");
        valor2 = input.nextDouble();

        System.out.println("Introduza o valor 3: ");
        valor3 = input.nextDouble();

        mediaAritmetica = (valor1 + valor2 + valor3) / 3;
        mediaPonderada = (valor1 * 0.2 + valor2 * 0.3 + valor3 * 0.5) / 3;
        System.out.println("A média aritmética dos valores é: " + mediaAritmetica);

        System.out.println("A média ponderada dos valores é: " + mediaPonderada);

    }

}
