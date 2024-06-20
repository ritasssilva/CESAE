package FichaPratica02;

import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercício 18 - Empresa XPTO, Lda. *****");

        // Declarar variáveis
        int dias, codigoFuncionario;
        double valorDia = 0, vencimentoIliquido = 0, subsidioAlimentacao = 0, vencimentoLiquido = 0, retencaoIRS = 0, segurancaSocial = 0;
        String cargo;

        // Ler código de funcionário
        System.out.println("Indique o seu código de funcionário: ");
        codigoFuncionario = input.nextInt();

        // Ler cargo
        System.out.println("Indique o seu cargo:\n E - Empregado\n C - Chefe\n A - Administrador");
        cargo = input.next();


        // Ler dias trabalhados
        System.out.println("Indique quantos dias trabalhou este mês: ");
        dias = input.nextInt();


        // Valores de acordo com cargo

        switch (cargo) {
            case "E":
                valorDia = 40;
                subsidioAlimentacao = dias * 5;
                if (vencimentoIliquido < 1000) {
                    retencaoIRS = 0.10;
                } else {
                    retencaoIRS = 0.20;
                }
                segurancaSocial = vencimentoIliquido * (0.11 + 0.2375);
                break;

            case "C":
                valorDia = 60;
                subsidioAlimentacao = dias * 5;
                if (vencimentoIliquido < 1000) {
                    retencaoIRS = 0.10;
                } else {
                    retencaoIRS = 0.20;
                }
                segurancaSocial = vencimentoIliquido * (0.11 + 0.2375);
                break;

            case "A":
                valorDia = 80;
                subsidioAlimentacao = dias * 7.5;
                if (vencimentoIliquido < 1000) {
                    retencaoIRS = 0.10;
                } else {
                        retencaoIRS = 0.20;
                }
                segurancaSocial = vencimentoIliquido * (0.09 + 0.21);
                break;
        }

    // Validar a escolha do cargo
        if (!(cargo.equals("E") || cargo.equals("e") || cargo.equals("C") || cargo.equals("c")|| cargo.equals("A") || cargo.equals("a"))) {
        System.out.println("Escolha inválida. Por favor, selecione um cargo válido");
        }


        // Cálculo Vencimento Iliquido
        vencimentoIliquido = dias * valorDia;

        // Cálculo Retenção IRS
        retencaoIRS = vencimentoIliquido * retencaoIRS;

        // Cálculo Vencimento líquido
        vencimentoLiquido = vencimentoIliquido - retencaoIRS - segurancaSocial;


        // Apresentar os resultados
    System.out.println("Código de Funcionário: " + codigoFuncionario);
    System.out.println("Cargo: " + cargo);
    System.out.println("Subsídio Alimentação: " + subsidioAlimentacao + "€");
    System.out.println("Valor da Retenção de IRS: " + retencaoIRS + "€");
    System.out.println("Segurança Social (11% + 23,75%): " + segurancaSocial + "€");
    System.out.println("Vencimento Líquido: " + vencimentoLiquido + "€");

    }
}
