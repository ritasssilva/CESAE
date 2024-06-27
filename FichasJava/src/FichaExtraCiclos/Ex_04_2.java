package FichaExtraCiclos;

public class Ex_04_2 {

    public static void main(String[] args) {

        int linhas = 5;  // Número de linhas que queremos imprimir

        for (int n = 1; n <= linhas; n++) {
            for (int x = 0; x < n; x++) {
                System.out.print("*");
            }
            System.out.println();  // Move para a próxima linha após imprimir todos os asteriscos
        }


    }
}
