package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;
        int countAte25 = 0;
        int count26a50 = 0;
        int count51a75 = 0;
        int count76a100 = 0;

        
        // Pedir o primeiro numero ao utilizador
        System.out.println("Introduza um numero inteiro positivo: ");
        numero = input.nextInt();

        while (numero >= 0) {
            if (numero <= 25) {
                countAte25++;
            } else {
                if (numero <= 50) {
                        count26a50++;
                    }
                if (numero > 50 && numero <= 75) {
                    count51a75++;
                    }

                if (numero > 75 && numero <= 100) {
                    count76a100++;
                }
            }

            System.out.println("Introduza um numero inteiro positivo: "); // Pedir input ao utilizador até que numero seja negativo
            numero = input.nextInt();
        }

        // Imprimir os resultados:
        System.out.println("[00,25]: " + countAte25);
        System.out.println("[26,50]: " + count26a50);
        System.out.println("[51,75]: " + count51a75);
        System.out.println("[76,100]: " + count76a100);

        // Resolução do Formador
        //  // Declarar variáveis
        //        int num=0, count0_25=0, count26_50=0, count51_75=0, count76_100=0;
        //
        //        while (num >= 0) {
        //            System.out.print("Insira um numero: ");
        //            num = input.nextInt();
        //
        //            if(num>=0 && num <=25){
        //                count0_25++;
        //            }
        //
        //            if(num>=26 && num <=50){
        //                count26_50++;
        //            }
        //
        //            if(num>=51 && num <= 75){
        //                count51_75++;
        //            }
        //
        //            if(num>=76 && num <=100){
        //                count76_100++;
        //            }
        //
        //
        //        }
        //
        //        System.out.println("[00,25]: "+count0_25);
        //        System.out.println("[26,50]: "+count26_50);
        //        System.out.println("[51,75]: "+count51_75);
        //        System.out.println("[76,100]: "+count76_100);

    }
}