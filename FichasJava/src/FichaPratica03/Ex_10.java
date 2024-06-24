package FichaPratica03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, x = 2;

        // Pedir input ao utilizador
        System.out.println("Introduza um número: ");
        numero = input.nextInt();


        // Apresentar os numeros pares até ao número lido inclusivé
        while (x <= numero) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }

    }
}