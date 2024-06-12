package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double produto1, produto2, produto3, total, efetivo;
        System.out.println("Introduza o preço do produto 1: ");
        produto1 = input.nextDouble();
        System.out.println("Introduza o preço do produto 2: ");
        produto2 = input.nextDouble();
        System.out.println("Introduza o preço do produto 3: ");
        produto3 = input.nextDouble();

        efetivo = 0.90;
        total = (produto1 + produto2 + produto3) * efetivo;
        System.out.println("O valor a pagar é: " + total);

    }
}
