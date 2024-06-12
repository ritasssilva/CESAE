package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutos, segundos, horas,
                minutosM1, minutosM2, minutosM3, minutosM4, minutosM5, segundosM1, segundosM2, segundosM3, segundosM4, segundosM5,
                totalSegundos, restantesSegundos;

        System.out.println("Introduza minutos da música 1: ");
        minutosM1 = input.nextInt();
        System.out.println("Introduza segundos da música 1: ");
        segundosM1 = input.nextInt();
        System.out.println("Introduza minutos da música 2: ");
        minutosM2 = input.nextInt();
        System.out.println("Introduza segundos da música 2: ");
        segundosM2 = input.nextInt();
        System.out.println("Introduza minutos da música 3: ");
        minutosM3 = input.nextInt();
        System.out.println("Introduza segundos da música 3: ");
        segundosM3 = input.nextInt();
        System.out.println("Introduza minutos da música 4: ");
        minutosM4 = input.nextInt();
        System.out.println("Introduza segundos da música 4: ");
        segundosM4 = input.nextInt();
        System.out.println("Introduza minutos da música 5: ");
        minutosM5 = input.nextInt();
        System.out.println("Introduza segundos da música 5: ");
        segundosM5 = input.nextInt();


        totalSegundos = minutosM1 * 60 + minutosM2 * 60 + minutosM3 * 60 + minutosM4 * 60 + minutosM5 * 60 + segundosM1 + segundosM2 + segundosM3 + segundosM4 + segundosM5;
        horas = totalSegundos / 3600;
        restantesSegundos = totalSegundos % 3600;
        minutos = restantesSegundos / 60;
        segundos = restantesSegundos % 60;

        System.out.println("A duração do álbum é de " + horas + ":" + minutos + ":" + segundos);


    }
}
