package FichaPratica03;

public class Ex_07 {

    public static void main(String[] args) {

        int x = 1, soma = 0;

        while (x <= 100){
            System.out.println(x);
            soma += x;
            x++;
        }

        System.out.println("Somatório: " + soma);

    }
}
