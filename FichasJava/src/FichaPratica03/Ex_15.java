package FichaPratica03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, fatorial = 1;

        System.out.println("Número para o qual pretende calcular o fatorial: ");
        numero = input.nextInt();


        while (numero > 1) {
            fatorial *= numero;
            numero--;
        }
        System.out.println("O fatorial é: " + fatorial);

    }
}
