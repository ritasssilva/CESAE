package FichaPratica01;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis

        int codigoFuncionario, dias;
        double vencimentoIliquido, subsidioAlimentacao, vencimentoLiquido, retencaoIRS, segurancaSocial ;

        // Pedidos ao utilizador
        System.out.println("Indique o seu código de funcionário: ");
        codigoFuncionario = input.nextInt();
        System.out.println("Indique quantos dias trabalhou este mês: ");
        dias = input.nextInt();


        vencimentoIliquido = dias * 40;
        subsidioAlimentacao = dias * 5;
        retencaoIRS = vencimentoIliquido * 0.10;
        segurancaSocial = vencimentoIliquido * (0.11 + 0.2375);
        vencimentoLiquido = vencimentoIliquido - retencaoIRS - segurancaSocial;

        // Apresentar os resultados
        System.out.println("Código de Funcionário: " + codigoFuncionario);
        System.out.println("Vencimento Ilíquido: " + vencimentoIliquido + "€");
        System.out.println("Subsídio Alimentação: " + subsidioAlimentacao + "€");
        System.out.println("Valor da Retenção de IRS: " + retencaoIRS + "€");
        System.out.println("Segurança Social (11% + 23,75%): " + segurancaSocial + "€");
        System.out.println("Vencimento Líquido: " + vencimentoLiquido + "€");


    }
}
