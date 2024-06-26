package FichaPratica04;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza um número:");
        int numero = input.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            boolean isPrimo = true;

            // Verifica se o número tem algum divisor além de 1 e dele mesmo
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                }
            }

            if (isPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
    }
}
