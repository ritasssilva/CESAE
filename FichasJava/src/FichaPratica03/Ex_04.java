package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 0, numero;

        System.out.println("Introduza um número: ");
        numero = input.nextInt();

        while (x <= numero) {
            System.out.println(x);
            x = x + 1; // Outra forma de escrever este incremento é x++; também podia ter escrito diretamente na minha de printline em cima (porque o incremento à direita da variável considera o valor anterior da variável; count++ é um pós incremento e ++count é pré-incremento; count+=2 é igual a count = count + 2
        }
    }
}
