package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, notaFinal;

        System.out.println("Introduza a nota 1: ");
        nota1 = input.nextDouble();
        System.out.println("Introduza a nota 2: ");
        nota2 = input.nextDouble();
        System.out.println("Introduza a nota 3: ");
        nota3 = input.nextDouble();

        notaFinal = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.40;

        if (notaFinal >= 9.5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
