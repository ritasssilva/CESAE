package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {


        System.out.println("***** Exercício 13 *****");

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int horas, minutos;

        // Ler variáveis
        System.out.println("Introduza horas: ");
        horas = input.nextInt();
        System.out.println("Introduza minutos: ");
        minutos = input.nextInt();

        // Devolver resposta ao utilizador
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos < 60) {
            if (horas < 12) {
                System.out.println(horas + ":" + minutos + " AM");
            }
            if (horas == 12) {
                System.out.println(horas + ":" + minutos + " PM");
            }
            if (horas > 13 && horas < 24) {
                System.out.println((horas - 12) + ":" + minutos + " PM");
            }
            if (horas == 24) {  // horas == 24
                System.out.println("00:" + minutos + " AM");
            }

        } else {
            System.out.println("Por favor introduza uma hora válida.");
        }

    }
}
