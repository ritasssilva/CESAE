package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, taxa;

        System.out.println("Introduza um salário: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            taxa = salario * 0.20;
            System.out.println("Paga taxa de 20%: " + taxa + "€");
        }
        if (salario > 15000 && salario < 20000) {
            taxa = salario * 0.30;
            System.out.println("Paga taxa de 30%: " + taxa + "€");
        }

        if (salario > 20000 && salario <= 25000) {
            taxa = salario * 0.35;
            System.out.println("Paga taxa de 35%: " + taxa + "€");
        }

        if (salario > 25000) {
            taxa = salario * 0.40;
            System.out.println("Paga taxa de 40%: " + taxa + "€");
        }
    }
}
