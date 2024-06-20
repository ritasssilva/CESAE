package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, notaFinal;

        // Ler nota 1
        System.out.println("Introduza a nota 1: ");
        nota1 = input.nextDouble();

        // Ler nota 2
        System.out.println("Introduza a nota 2: ");
        nota2 = input.nextDouble();

        // Ler nota 3
        System.out.println("Introduza a nota 3: ");
        nota3 = input.nextDouble();

        // Calcular média ponderada
        notaFinal = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.40;

       // System.out.println("Média: " + notaFinal);

        // Avaliar se teve positiva

        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20 || nota3 < 0 || nota3 > 20) {
            System.out.println("Notas inválidas");
        } else {
                if (notaFinal >= 9.5) { // Positiva
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }

            }

        }

    }
