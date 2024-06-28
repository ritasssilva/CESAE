package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int[] numeros = new int[10];
        boolean crescente = true;


        // Ler numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um número: ");
            numeros[i] = input.nextInt();
        }


        System.out.println("\n___________________________________________\n");

        // Avaliar se array é crescente
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < numeros[i-1]) {
                crescente = false; // neste caso não podemos colocar else porque senão o cresultado era sempre true...
            }
        }

        if (crescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }

    }
}
