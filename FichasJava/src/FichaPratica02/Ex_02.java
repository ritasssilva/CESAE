package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, taxa20, taxa30;

        System.out.println("Introduza um salário: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            taxa20 = salario * 0.20;
            System.out.println("Paga taxa de 20%: " + taxa20 + "€");
        }

        else {
            taxa30 = salario * 0.30;
            System.out.println("Paga taxa de 30%: " + taxa30 + "€");
        }
    }
}
