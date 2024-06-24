package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;
        int countAte25 = 0;
        int count26a50 = 0;
        int count51a75 = 0;
        int count76a100 = 0;

        
        // Pedir o primeiro numero ao utilizador
        System.out.println("Introduza um numero inteiro positivo: ");
        numero = input.nextInt();

        while (numero >= 0) {
            if (numero <= 25) {
                countAte25++;
            } else {
                if (numero <= 50) {
                        count26a50++;
                    }
                if (numero > 50 && numero <= 75) {
                    count51a75++;
                    }

                if (numero > 75 && numero <= 100) {
                    count76a100++;
                }
            }

            System.out.println("Introduza um numero inteiro positivo: "); // Pedir input ao utilizador até que numero seja negativo
            numero = input.nextInt();
        }

        // Imprimir os resultados:
        System.out.println("[00,25]: " + countAte25);
        System.out.println("[26,50]: " + count26a50);
        System.out.println("[51,75]: " + count51a75);
        System.out.println("[76,100]: " + count76a100);

    }
}