package FichaPratica02;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        // Import the Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2;

        System.out.println("Introduza um número: ");
        num1 = input.nextInt();
        System.out.println("Introduza outro número: ");
        num2 = input.nextInt();

        //Avaliar qual dos dois numeros é maior

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else {
            if (num1 > num2) {
                System.out.println("Maior: " + num1);
            } else {
                System.out.println("Maior: " + num2);
            }
        }
    }
}