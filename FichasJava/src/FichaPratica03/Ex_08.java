package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, count = 0;

        // Pedir input ao utilizador
        System.out.println("Introduza um número: ");
        numero = input.nextInt();

        // Inicializar a variável x
        int x = numero - 5;


        // Apresentar os cinco numeros anteriores
        while (count < 5) {
            System.out.println(x);
            x++;
            count++;
        }

        // Fazer reset ao contador e inserir linha em branco para separar os resultados
        count = 0;
        System.out.println(" \n");

        // Imprimir os 5 números seguintes
        x = numero + 1;

        while (count < 5) {
            System.out.println(x);
            x++;
            count++;
        }


        // Resolução do Formador
        // // Declarar variáveis
        //        int num, antecessor, sucessor;
        //
        //        System.out.print("Insira um número: ");
        //        num = input.nextInt();
        //
        //        antecessor=num-5;
        //        sucessor=num+5;
        //
        //        while (antecessor<=sucessor){
        //
        //            if(antecessor!=num){
        //                System.out.println(antecessor);
        //            }else{
        //                System.out.println();
        //            }
        //
        //            antecessor++;
        //        }



    }
}