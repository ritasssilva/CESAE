package FichaPratica03;

public class Ex_02 {
    public static void main(String[] args) {

        int x = 2;

        while (x <= 400) {
            System.out.println(x);
            x = x + 2;
        }

        /* Outra solução possível, mas menos otimizada:

        int x = 1;

        while (x <= 400) {

            if (x % 2 == 0) {

            System.out.println(x);
            }

            x = x + 2;
        }

        */



    }
}
