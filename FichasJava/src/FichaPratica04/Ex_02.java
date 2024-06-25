package FichaPratica04;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int opcao;

        // Pedir input ao utilizador

        do {
            System.out.println("Escolha uma das seguintes opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1. Criar");
                    break;
                case 2:
                    System.out.println("2. Atualizar");
                    break;
                case 3:
                    System.out.println("3. Eliminar");
                    break;
                case 4:
                    System.out.println("4. Sair");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

        } while (opcao != 4);
    }
}
