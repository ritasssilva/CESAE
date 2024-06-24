package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, salto, x = 0;

        // Pedir input ao utilizador
        System.out.println("Introduza um limite: ");
        limite = input.nextInt();
        System.out.println("Introduza um salto: ");
        salto = input.nextInt();

        
        // Apresentar os numeros inteiros de 0 até limite inclusivé com incremento do salto definido pelo utilizador
        while (x <= limite) {
            System.out.println(x); // Primeiro imprme o atual valor de x
            x += salto; // Depois incrementa x
        }

    }
}