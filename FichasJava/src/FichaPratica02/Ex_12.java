package FichaPratica02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {


        System.out.println("***** Exercício 12 *****");

        // Import do scanner
        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int opcao;

        // Apresentar opções
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        //Ler variáveis
        System.out.println("Insira a opção: ");
        opcao = input.nextInt();

        // Devolver resposta ao utilizador
        switch (opcao) {
            case 1: // Criar
                System.out.println("*** Criar ***");
                break;
            case 2: // Atualizar
                System.out.println("*** Atualizar ***");
                break;
            case 3: // Eliminar
                System.out.println("*** Eliminar ***");
                break;
            case 4: // Sair
                break;
            default: System.out.println("Opção inválida. Por favor introduza o número da opção pretendida, de 1 a 4.");
                break;
        }

    }
}
