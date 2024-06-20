package FichaPratica03;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int numeroInicio, numeroFim;

        // Pedir input ao utilizador
        System.out.println("Introduza um número de início: ");
        numeroInicio = input.nextInt();
        System.out.println("Introduza um número de fim: ");
        numeroFim = input.nextInt();

        // Inicializar x com o valor de numeroInicio
        int x = numeroInicio;

        while (x <= numeroFim) {
            System.out.println(x);
            x++;
        }


    }
}
