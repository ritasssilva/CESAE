package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, x = 0;
        String mensagem;

        // Pedir input ao utilizador
        System.out.println("Introduza um número: ");
        numero = input.nextInt();

        System.out.println("Introduza uma mensagem: ");
        input.nextLine(); // preciso de colocar esta linha para limpar o buffer, que significa "eliminar" o Enter que o utilizador dá ao introduzir o número. Caso contrário o programa lê o Enter como a variável mensagem
        mensagem = input.nextLine();


        while (x < numero) {
            System.out.println(mensagem);
            x++;
        }

        /* System.out.println("Número: " + numero);
        System.out.println("Mensagem: " + mensagem); */



    }
}
