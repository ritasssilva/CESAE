package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {


        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] comissoes = new double[12];
        double total=0;


        // Ler comissões
        for (int i = 0; i < comissoes.length; i++) {
            System.out.print("Insira as comissões do mês " + i+1 + ": ");
            comissoes[i] = input.nextDouble();

        }

        System.out.println("\n___________________________________________\n");

        // Imprimir comissões e soma das mesmas
        for (int i = 0; i < comissoes.length; i++) {
            System.out.println("Mês[" + i + "] = " + comissoes[i]);
            total = total+comissoes[i];
        }

        System.out.println("Total comissões = " + total);

    }
}
