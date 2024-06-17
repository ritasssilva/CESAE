package FichaPratica02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {


        System.out.println("***** Exercício 12 *****");

        Scanner input = new Scanner(System.in);


        //Declarar variáveis
        int opcao;

        //Ler variáveis
        System.out.println("Introduza o número da opção que pretende selecionar:\n 1. Criar \n 2. Atualizar\n 3. Eliminar\n 4. Sair");
        opcao = input.nextInt();

        //Devolver resposta ao utilizador
        switch (opcao) {
            case 1: System.out.println("Criar");
                break;
            case 2: System.out.println("Atualizar");
                break;
            case 3: System.out.println("Eliminar");
                break;
            case 4: System.out.println("");
                break;
            default: System.out.println("Opção inválida. Por favor introduza o número da opção pretendida, de 1 a 4.");
                break;
        }

    }
}
