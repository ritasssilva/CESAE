package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, pi, area;
        System.out.println("Introduza o raio da circunferência: ");
        raio = input.nextDouble();

        pi = 3.14;
        area = pi * raio * raio;
        System.out.println("A área da circunferência é: " + area);

    }
}
