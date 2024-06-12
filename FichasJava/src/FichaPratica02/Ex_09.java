package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Introduza o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Introduza o segundo número: ");
        num2 = input.nextInt();
        System.out.println("Introduza o terceiro número: ");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Menor: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Menor: " + num2);
            } else {
            System.out.println("Menor: " + num3);
            }
    }
}