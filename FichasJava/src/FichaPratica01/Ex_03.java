package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double comprimento, largura, area, perimetro;

        System.out.println("Introduza o comprimento do retangulo: ");
        comprimento = input.nextDouble();

        System.out.println("Introduza a largura do retangulo: ");
        largura = input.nextDouble();

        area = comprimento * largura;
        perimetro = (comprimento * 2) + (largura * 2);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

    }
}
